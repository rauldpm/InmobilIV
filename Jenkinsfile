
pipeline {

    // Especifica el uso de dockerfile
    agent none

    // Especifica las etapas de ejecucion
    stages {
        // Etapa que ejecuta los test de la imagen docker
        stage('test') {
            agent any
            steps {
                sh 'docker run -t -v `pwd`:/test ghcr.io/rauldpm/inmobiliv/inmobiliv-con:latest'
            }
        }
    }

}
