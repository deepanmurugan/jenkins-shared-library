def build(String dockerRegistry) {
  script {
    docker.build "${dockerRegistry}"
  }
}
