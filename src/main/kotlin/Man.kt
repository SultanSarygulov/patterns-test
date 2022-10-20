data class Man(val name: String, val surname: String): IMan {
    private val TAG = Man::class.java.simpleName

    override fun getCloth(degrees: Int) {
        if (degrees > 0){
            println("$name $surname is Warm")
        } else {
            println("$name $surname is Cold")
        }
    }
}