import com.TestClass
def call(){
  node{
  tele(this)
  def t = new TestClass()
  stage("new"){
  println(t.calling())
println("shred lib")
  }}}
return this
