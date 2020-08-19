pipeline {
    agent any

    stages {
        stage ('compile stage'){

            steps{
                withMaven(maven:'MAVEN_HOME'){
                    sh 'mvn clean compile'
                }
            }
        }
    }


}
