import com.TestClass
def call(Closure cls){
cls()
 
  tele(this)
def t = new TestClass()
  stage("new"){
   script{ println(t.calling())}
echo("shred lib")
  }}

def experiment(){
echo "Testing With Experiment : call another function"
}
return this
