pipeline{
    agent any
    stages {
        stage('Git clone') {
            steps {
                git url: 'https://github.com/ShreyankB/DevOps-Calc.git', branch: 'main',
                 credentialsId: 'ShreyankB'
            }
        }
        stage('Test'){
            steps {
                sh 'mvn clean test'
            }
        }
        stage('Build'){
            steps {
                sh 'mvn clean install'
            }
        }
        stage('Docker Build'){
            steps {
                sh 'docker build -t shreyankb/devops-calculator:latest .'
            }
        }
        stage('Docker Push'){
            steps {
                withCredentials([usernamePassword(credentialsId: 'DockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
                sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
                sh 'docker push shreyankb/devops-calculator:latest'            }
            }
        }
        stage('Clean Docker Images') {
            steps {
                sh 'docker rmi -f shreyankb/devops-calculator'
            }
        }
        stage('Ansible Deploy') {
             steps {
                  ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'deploy.yml'
             }
        }
    }
}