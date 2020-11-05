
pipeline {

    // Especifica el uso de dockerfile
    agent none

    stages {

        stage('build') {
            agent any
            steps {
                sh 'docker build -t rauldpm/inmobiliv .'
            }    
        }

        stage('test') {
            agent any
            steps {
                sh 'docker run -t -v `pwd`:/test rauldpm/inmobiliv'
            }
        }
    }

}