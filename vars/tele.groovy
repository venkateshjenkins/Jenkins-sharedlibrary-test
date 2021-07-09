import com.TestClass

def call(script){
 

  def t = new TestClass()
 stage ("build"){
println(t.calling())
 println script.JOB_NAME
 println "using the env " + env.JOB_NAME
 }
 
}
return this
