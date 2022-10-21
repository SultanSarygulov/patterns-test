data class Man(val name: String, val surname: String, val expectation: Int): IMan {
    override fun watchVideo(videoQuality: Int) {
        if (videoQuality > expectation){
            println("$name $surname ($expectation) commented: 'This video is good'")
        } else {
            println("$name $surname ($expectation) commented: 'This video is shit'")
        }
    }
}