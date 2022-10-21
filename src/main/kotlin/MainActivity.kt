
// Подписываем людей к нашему Ютуб каналу
// У них есть ФИ и ожидание от видео.
// Когда загружаем видео с определенным качеством, мы оповещаем наших подписчиков
// и они "оставляют комментарий", исходя превзошло ли видео их ожидания
fun main(){
    val sultanGamingChannel = SultanGamingChannel()

    sultanGamingChannel.subscribe(Man(name = "Sultan", surname = "Sarygulov", expectation = 20))
    sultanGamingChannel.subscribe(Man(name = "Michael", surname = "Jordan", expectation = 50))
    sultanGamingChannel.subscribe(Man(name = "Gordon", surname = "Ramsay", expectation = 70))

    sultanGamingChannel.uploadVideo()
}
