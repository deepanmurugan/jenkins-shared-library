def build(String dockerRegistry) {
  script {
    return docker.build ${dockerRegistry}
  }
}
