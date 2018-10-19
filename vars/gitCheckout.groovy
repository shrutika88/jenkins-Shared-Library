/**
* Hello world step.
*/
def call(String a) {   
   echo "before cmd"
   sh "cd $WORKSPACE"
   echo "after cmd"
}
