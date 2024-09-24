fun main() {

    val b = ToDec("1010")
    MyNum(b).toDec()

}

interface Dec{
    fun toDec()
}

class ToDec(val num: String): Dec{
    override fun toDec() {
        println("Число в бинарной системе счисления ${num.toLong(2)}")
    }
}

class MyNum(num: Dec):Dec by num