
pipeline {

    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {

        stage('Checkout') {
            steps {
                echo 'Downloading source code'
                checkout scm
            }
        }

        stage('Build') {
            steps {
                echo 'Compiling Java application'
                sh 'mvn clean compile'
            }
        }

        stage('Testing') {
            steps {
                echo 'Executing JUnit test cases'
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                echo 'Creating application JAR'
                sh 'mvn package -DskipTests'
            }
        }

    }

    post {
        always {
            junit 'target/surefire-reports/*.xml'
        }

        success {
            echo 'CI Pipeline completed successfully!'
        }

        failure {
            echo 'CI Pipeline failed. Please check the console output.'
        }
    }
}
