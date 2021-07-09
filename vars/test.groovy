import com.TestClass
def call(Closure cls){
cls()
 
  tele(this)
def t = new TestClass()
  stage("new"){
   script{ println(t.calling())}
echo("shred lib")
  }}
return this
