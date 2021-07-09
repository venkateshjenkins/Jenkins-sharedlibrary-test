import com.TestClass

def call(script){
 

  def t = new TestClass()
println(t.calling())
 println script.JOB_NAME
 println "using the env " + env.JOB_NAME

 stage("build 01 from tele"){
    
  bat "date"
  
 }
}
return this
