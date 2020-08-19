pipeline {
    agent any
    stages {
stage('testing pipeline'){
          steps{
      echo 'test1'
                sh 'mvn test -Dcucumber.options="--tag @smoke"'

                }
        }
}
}