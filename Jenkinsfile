
pipeline {

    // Especifica el uso de dockerfile
    agent none

    // Especifica las etapas de ejecucion
    stages {

        // Etapa que construye la imagen docker
        stage('build') {
            agent any
            steps {
                sh 'docker build -t rauldpm/inmobiliv .'
            }    
        }

        // Etapa que ejecuta los test de la imagen docker
        stage('test') {
            agent any
            steps {
                sh 'docker run -t -v `pwd`:/test rauldpm/inmobiliv'
            }
        }
    }

}