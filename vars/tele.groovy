import com.TestClass

def call(script22){
 

  def t = new TestClass()
 stage ("build"){
println(t.calling())
 println script22.JOB_NAME
 println "using the env " + env.JOB_NAME
  script22.experiment()
  
 }
 
}
return this
