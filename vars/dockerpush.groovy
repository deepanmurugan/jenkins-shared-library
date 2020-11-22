def call() {
  docker.withRegistry( '', registryCredential ) {
    dockerImage.push()
  }
}
