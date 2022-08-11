pipeline {
    agent any

    tools {
        
        maven "Maven3"
    }

    stages {
        stage('Build') {
            steps {
                
               // git 'https://github.com/RanjanGitHubb/demo.git'
				
                bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
			
			   success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
