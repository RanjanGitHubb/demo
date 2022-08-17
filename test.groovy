node {
  stage('Clone') {
  git "https://github.com/RanjanGitHubb/demo.git"
  }
  stage('Build') {
    bat "mvn clean install"
  }
  stage('SonarCloud Analysis') {
    withSonarQubeEnv('SonarCloud')
    bat "mvn sonar:sonar"
    
  }

}
