def call(String repo, String brnach) {
    checkout([$class: 'GitSCM', branches: [[name: '*/"$brnach"']], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'git_creds', url: "$repo"]]])
}
