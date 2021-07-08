def call(script){
 println script.JOB_NAME
 println "using the env " + env.JOB_NAME
 node{
 stage("build 01 from tele"){
  
  bat "date"
  
 }}
}
return this
