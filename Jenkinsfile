pipeline {
    agent any

    tools {
        maven "Default"
    }

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                // The 'mvn clean package' command will now generate JaCoCo reports 
                // because of the changes made to your pom.xml
                bat 'mvn clean package'
            }
        }
    }

    post {
        always {
            // Record test results
            junit '**/target/surefire-reports/*.xml'
            
            
            // Archive the generated JAR file
            archiveArtifacts artifacts: 'target/*.jar'
        }
    }
}
