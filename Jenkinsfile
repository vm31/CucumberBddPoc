pipeline {
    agent any

    stages {
        stage ('Compile Stage'){

            steps{
                withMaven(maven:'MAVEN_HOME'){
                    echo 'compile stage'
                    sh 'clean compile'
                }
            }
        }
        stage ('Testing Stage'){
            steps{
                withMaven(maven:'MAVEN_HOME'){
                    sh 'test -Dcucumber.filter.tags="@smoke'
                }
            }
        }
    }


}
