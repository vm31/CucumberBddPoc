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
                    Root POM "pom.xml"
                    Goals and options "test -Dcucumber.options="--tags @regression""

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