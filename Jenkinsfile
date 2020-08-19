pipeline {
    agent any

    stages {
        stage ('Compile Stage'){

            steps{
                withMaven(maven:'MAVEN_HOME'){
                    echo 'compile stage'
                    sh 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage'){
            steps{
                withMaven(maven:'MAVEN_HOME'){
                    sh 'mvn test -Dcucumber.filter.tags="@smoke'
                }
            }
        }
    }


}
