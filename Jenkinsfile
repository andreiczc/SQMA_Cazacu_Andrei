pipeline {
    agent any
    
    stages {
        stage('Test') {
            steps {
                echo 'Test...'
            }
        }
        stage('Test2') {
            steps {
                echo 'Test 2...'
            }
        }
    }
    
    post {
        success {
            echo 'Success!'
        }
        failure {
            echo 'Failed...'
        }
    }
}