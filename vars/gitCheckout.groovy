/**
* Hello world step.
*/
def call (String cmd) {
   timestamps {
      cmdOutput = sh (script:"${cmd}", returnStdout:true).trim()   
	}  
	echo cmdOutput   
	checkout([$class: 'GitSCM', branches: [[name: '*/master']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'shrutika_yadav', url: 'https://github.com/shrutika88/final_demo.git']]])
}
