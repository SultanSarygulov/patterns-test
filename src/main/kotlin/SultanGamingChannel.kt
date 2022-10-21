import java.util.LinkedList
import kotlin.random.Random

class SultanGamingChannel {
    private val subscribers: MutableList<IMan> = LinkedList()
    var videoQuality = 0

    fun subscribe(iMan: IMan){
        subscribers.add(iMan)
    }

    fun unsubscribe(iMan: IMan){
        subscribers.remove(iMan)
    }

    fun uploadVideo(){
        videoQuality = Random.nextInt(100)
        println(videoQuality)
        subscribers.forEach {
            it.watchVideo(videoQuality = videoQuality)
        }
    }
}