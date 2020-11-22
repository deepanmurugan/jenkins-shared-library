def call(String dockerImage) {
  echo "${dockerImage}"
  withCredentials([usernamePassword(credentialsId: 'dockerhub', usernameVariable: 'hubUsername', passwordVariable: 'hubPassword')]) {
        sh """
            docker login --username="${hubUsername}" --password="${hubPassword}"
            docker push "${dockerImage}"
        """
    }
}
