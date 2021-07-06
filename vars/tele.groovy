def call(script){
 println script.JOB_NAME
 println "using the env " + env.JOB_NAME
 stage("build 01 from tele"){
  steps{
  bat "date"
  }
 }
}
