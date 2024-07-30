pipeline {
	agent any

	stages {
		stage('Code Clone from GitHub') {
	   		steps {
				echo 'Clong code from GitHub'
				git
				url:'https://github.com/kumarsrisai/SpringBoot.git' , branch:'master'
				}
		}
		stage('Code build') {
			steps {
				echo 'Code build'
				sh 'docker build -t simple-node-app:v1 .'
				}
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

