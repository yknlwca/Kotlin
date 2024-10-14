fun main() {
    var data: String? = "choi"
    println("data= $data : ${data?.length ?: -1}")
    data = null
    println("data= $data : ${data?.length ?: -1}")

    println(some("choi"))
    println(some(null))
}

fun some(data: String?): Int {
    return data!!.length
}