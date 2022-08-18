node {
  stage('Clone') {
  git 'https://github.com/RanjanGitHubb/demo.git'
  }
  stage('Build') {
    bat "cd initial && mvn clean install"
  }
  stage('SonarCloud Analysis') {
   // withSonarQubeEnv('SonarQube')
    bat "mvn verify org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=RanjanGitHubb_demo"
    
  }

}
