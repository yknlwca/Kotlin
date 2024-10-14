fun main() {
    var data: String? = null
    val length = if (data == null) {
        0
    } else {
        data.length
    }
    println("data length: $length")
    println("data length: ${data?.length ?: 0}")
}
