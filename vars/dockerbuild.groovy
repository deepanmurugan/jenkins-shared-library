def call(String dockerRegistry) {
  script {
    docker.build "${dockerRegistry}"
  }
}
