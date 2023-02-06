import kotlin.math.*

fun main(){

    try{
        println("Введите a")
        val a: Double = readLine()!!.toDouble()
        println("Введите b")
        val b: Double = readLine()!!.toDouble()
        println("Введите c")
        val c: Double = readLine()!!.toDouble()
        if((a == 0.0) || (b == 0.0) || (c == 0.0)){
            println("Сторона треугольника не может быть равна нулю")
        }
        else if((a + b < c ) || (a + c < b) ||( b + c < a)){
            println("Такого треугольника не существует")
        }
        else{
            val p: Double = a + b + c
            val s: Double = sqrt(p * (p-a) * (p - b) * (p -c))
            val h: Double = a * (s / a)
            println("Высота равна $h")
        }

    }
    catch (e: NumberFormatException){
        println("Необходимо ввести число")
    }

}