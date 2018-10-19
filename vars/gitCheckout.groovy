/**
* Hello world step.
*/
def call(String a) {   
   echo "before cmd"
   sh "cd $WORKSPACE"
   sh "ls -l"
   echo "after cmd"
}
