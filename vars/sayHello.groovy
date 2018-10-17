/**
* Hello world step.
*/
def call(String repo,String branch) {   
   checkout([$class: 'GitSCM', branches: [[name: '*/$repo']],
     userRemoteConfigs: [[url: '$branch']]])
}
