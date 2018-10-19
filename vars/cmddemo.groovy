def call(String repo, String branchname,String credID) {
    checkout([$class: 'GitSCM', branches: [[name: '*/$branchname']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '$credID', url: '$repo']]])
}
