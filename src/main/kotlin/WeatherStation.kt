import java.util.LinkedList
import java.util.logging.Handler
import kotlin.random.Random

class WeatherStation {
    private val people: MutableList<IMan> = LinkedList()
    var degrees = 0

    fun addMan(iMan: IMan){
        people.add(iMan)
    }

    fun remove(iMan: IMan){
        people.remove(iMan)
    }

    fun updateWeather(){
        degrees = readLine()!!.toInt()
        people.forEach {
            it.getCloth(degrees = degrees)
        }
    }
}