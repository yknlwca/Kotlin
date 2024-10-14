open class VisibilityModifier {
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}

class OverVisibility: VisibilityModifier(){
    fun subFun(){
        publicData++
        protectedData++
    }
}

fun main() {
    val obj = VisibilityModifier()
    print(++obj.publicData)

}