pipeline {
    agent any

    stages {
        stage('Code Clone from GitHub') {
            steps {
                echo 'Cloning code from GitHub'
                git url: 'https://github.com/kumarsrisai/SpringBoot.git', branch: 'master'
            }
        }

        stage('Code Build') {
            steps {
                echo 'Building Docker image'
                sh 'docker build -t simple-node-app:v1 .'
            }
        }

        stage('Deploy with Docker Compose') {
            steps {
                echo 'Deploying with Docker Compose'
                sh 'docker-compose down && docker-compose up -d'
            }
        }
    }
}
