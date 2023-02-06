import kotlin.math.*
fun main(){
    try{
        println("Введите рдиус внутреннего кольца")
        val r1: Double = readLine()!!.toDouble()
        println("Введите радиус внешнего кольца")
        val r2: Double = readLine()!!.toDouble()
        if((r1 == 0.0) || (r2 == 0.0)){
            println("Радиус не может быть равен нулю")
        }
        else{
            val s: Double = PI * ((r2 * r2) - (r1 * r1))
            println("Площадь кольца равна $s")
        }

    }
    catch (e: NumberFormatException){
        println("Необходимо ввести число")
    }
}