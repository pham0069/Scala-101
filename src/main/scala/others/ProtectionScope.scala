package society {
  package professional {
    class Executive {
      private[professional] var workDetails = null //accessible to any class in package professional
      private[society] var friends = null //accessible to any class in package society
      private[this] var secrets = null //accessible to class Executive only

      def help(another : Executive): Unit = {
        println(another.workDetails)
        //not OK as secrets is inaccessible
        //println(another.secrets)
      }
    }
  }
}

class ProtectionScope {

}
