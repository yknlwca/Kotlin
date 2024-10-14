fun main() {
    val some1 = { no: Int -> println(no) }
    some1(10)

    val some2:(Int) -> Unit = {println(it) }
    some2(10)

    val some3 = {no1:Int , no2:Int ->
        println("in lambda function")
        no1*no2
    }

    println("result : ${some3(10, 20)}")
}