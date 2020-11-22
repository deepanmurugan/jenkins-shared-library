def build(String dockerRegistry) {
  script {
      dockerImage = docker.build dockerRegistry + ":$BUILD_NUMBER"
  }
}
