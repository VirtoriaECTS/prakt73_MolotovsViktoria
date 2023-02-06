import kotlin.math.*
fun main(){
    try{
        println("Введите x")
        val x: Double = readLine()!!.toDouble()
        println("Введите y")
        val y: Double = readLine()!!.toDouble()
        println("Введите z")
        val z: Double = readLine()!!.toDouble()
        if(y < 0) {
            val u: Double = min(z, min(x,y))
            println(u)
        }
        else{
            val u: Double = max(z, min(x,y))
            println(u)
        }
    }
    catch (e: NumberFormatException){
        println("Необходимо ввести число")
    }
}