def build(String dockerRegistry, string buildNo) {
  script {
    return docker.build "${dockerRegistry}"
  }
}
