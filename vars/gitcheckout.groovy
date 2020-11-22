def gitcheckout(Map stageParams){
checkout([$class: 'GitSCM', branches: [[name: stageParams.branch]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: 'github_repo', url: stageParams.repoUrl]]])
}
