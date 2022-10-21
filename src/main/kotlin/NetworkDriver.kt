import org.testng.annotations.Test

// Create class and object NetworkDriver
class NetworkDriverClass() {
    init {
        println("Initializing $this")
    }

    fun log(): NetworkDriverClass = apply { println("Network Driver: $this") }
}

object NetworkDriverObj{
    init {
        println("Initializing $this")
    }

    fun log(): NetworkDriverObj = apply { println("Network Driver: $this")}
}

// See the initialization of these classes and objects
class SingletonTest(){
    @Test
    fun testSingleton(){
        println("Start")
        val networkDriver1 = NetworkDriverClass().log()
        val networkDriver2 = NetworkDriverClass().log()
        println("")
        val networkDriver3 = NetworkDriverObj.log()
        val networkDriver4 = NetworkDriverObj.log()
    }
}