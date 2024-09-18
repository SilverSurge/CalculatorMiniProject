pipeline {
    agent any

    environment {
        GITHUB_REPO_URL = 'https://github.com/SilverSurge/CalculatorMiniProject.git'
    }
    
    stages {
    
        stage("Checkout") {
            steps {
                git branch: 'main', url: "${GITHUB_REPO_URL}"
            }
        }
        
        stage("Build") {
            steps {
                dir("Calculator") {
                    sh 'mvn clean package'
                }
            }   
        }
        
        stage("Test") {
            steps {
                dir("Calculator") {
                    sh 'mvn test'
                }
            }
        }
    }
}