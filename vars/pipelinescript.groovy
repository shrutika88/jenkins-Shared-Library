def call(String name){
	pipeline{
		agent any
		stages{
			stage('Clone'){
				steps{
					git url: \
					"https://github.com/shrutika88/final_demo.git"
				}
			}
			stage('Compile'){
				steps{
					sh("ls")
				}
			}
		}
	}
}
