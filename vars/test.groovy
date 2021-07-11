import com.TestClass
def call(Closure cls){
cls()
 def t = new TestClass(this)
  tele(this)
   script{ t.Callstage() }
  stage("new"){
   script{ println(t.calling())}
echo("shred lib")
  }}

def experiment(){
echo "Testing With Experiment : call another function"
}
return this
