def call(String dockerImage) {
  script {
    docker.build "${dockerImage}"
  }
}
