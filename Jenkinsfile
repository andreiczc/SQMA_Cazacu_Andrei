pipeline {
    agent any
    
    stages {
        stage('Clean-up') {
            steps {
                sh 'rm -rf SQMA_Cazacu_Andrei'
                echo 'Clean-up completed'
            }
        }
        stage('Clone repository') {
            steps {
                sh 'git clone https://github.com/andreiczc/SQMA_Cazacu_Andrei.git'
                echo 'Clone completed!'
            }
        }
        stage('Build') {
            steps {
                dir('SQMA_Cazacu_Andrei') {
                    sh 'mvn clean install -DskipTests'
                }
                echo 'Build succesfull'
            }
        }
        stage('Test') {
            steps {
                dir('SQMA_Cazacu_Andrei') {
                    sh 'mvn test'
                }
                echo 'Tests succesfull'
            }
        }
    }
}