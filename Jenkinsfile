node{
   stage('SCM Checkout'){

      git 'https://github.com/vm31/CucumberBddPoc'
   }
   stage('Compile-Package'){
      def mvnHome = tool name: 'maven_3_5_0', type: 'maven'
      bat "${mvnHome}/bin/mvn package"
   }
}