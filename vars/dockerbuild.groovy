def call(String dockerRegistry, String buildNo) {
  script {
    def dockerimagetag = "${dockerRegistry}" + "${buildNo}"
    docker.build "${dockerimagetag}"
  }
}
