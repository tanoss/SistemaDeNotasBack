pipeline {
  agent { label 'linux' }
  options {
    buildDiscarder(logRotator(numToKeepStr: '5'))
  }
  stages {
    stage('Scan') {
      steps {
        withSonarQubeEnv(installationName: 'sonarTest') { 
          sh 'chmod +x gradlew'
          sh 'sudo ./gradlew clean sonarqube'
        }
      }
    }
  }
}