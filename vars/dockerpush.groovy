def call(String dockerImage) {
  docker.withRegistry( '', registryCredential ) {
    "${dockerImage}".push()
  }
}
