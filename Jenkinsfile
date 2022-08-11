pipeline {
    agent any

    tools {
        
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                
               // git 'https://github.com/RanjanGitHubb/demo.git'
		    
				
                bat "cd initial && mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
			
			   success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.war'
                }
            }
        }
    }
}
