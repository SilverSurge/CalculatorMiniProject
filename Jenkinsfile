pipeline {
    agent any

    environment {
        DOCKER_IMAGE_NAME = 'calculator-miniproject'
        GITHUB_REPO_URL = 'https://github.com/SilverSurge/CalculatorMiniProject.git'
    }

    stages {
        stage('Checkout') {
            steps {
                script {
                    // get the github branch
                    git branch: 'main', url: "${GITHUB_REPO_URL}"
                }
            }
        }

        stage('Build') {
            steps {
                script {
                    // create the jar file
                    dir('Calculator') {
                        sh 'mvn clean package'
                    }
                }
            }
        }

        stage('Test') {
            steps {
                script {
                    // run unit tests
                    dir('Calculator') {
                        sh 'mvn test'
                    }
                }
            }
        }

        stage('Dockerize') {
            steps {
                script {
                    // build the docker image
                    docker.build("${DOCKER_IMAGE_NAME}", '.')

                    // push the image to docker hub
                    docker.withRegistry('', 'DockerHubCred') {
                        sh 'docker tag calculator-miniproject silversurge/calculator-miniproject:latest'
                        sh 'docker push silversurge/calculator-miniproject'
                    }
                }
            }
        }

        stage('Deploy') {
            steps {
                script {
                    ansiblePlaybook(
                        playbook: 'deploy.yml',
                        inventory: 'inventory.ini'
                    )
                }
            }
        }
    }

    post {
        failure {
            script {
                mail bcc: '', body: 'Break Build Mail Body', cc: '', from: 'deepkumarpatel471@gmail.com', replyTo: '', subject: 'Break Build Mail Subject', to: 'deepkumarpatel471@gmail.com'
            }
        }
    }
}
