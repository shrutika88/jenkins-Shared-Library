/**
* Hello world step.
*/
def call(String repo,String branch) {   
   checkout([$class: 'GitSCM', branches: [[name: '*/master']],
     userRemoteConfigs: [[url: 'http://git-server/user/repository.git']]])
}
