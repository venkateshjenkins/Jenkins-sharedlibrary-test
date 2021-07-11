import com.TestClass
def call(Closure cls){
 node{
cls()
 def t = new TestClass(this)
  tele(this)
  
  stage("new"){
   steps{
    script{ t.Callstage() }
   script{ println(t.calling())}
echo("shred lib")
   }  }}}

def experiment(){
echo "Testing With Experiment : call another function"
}
return this
