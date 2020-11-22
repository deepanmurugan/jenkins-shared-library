def build(String dockerRegistry) {
  script {
      return docker.build dockerRegistry + ":$BUILD_NUMBER"
  }
}
