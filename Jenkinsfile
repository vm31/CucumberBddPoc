pipeline {
         agent any
         stages {
                 stage('One') {
                 steps {
                     echo 'Hi, this is Regression Pipeline'
                 }
                 }
                 stage('Two') {
                 steps {

                    mvn "clean install"

                 }
                 }
                 stage('Three') {
                 when {
                       not {
                            branch "master"
                       }
                 }
                 steps {
                       echo "Hello"
                 }
                 }

              }
}