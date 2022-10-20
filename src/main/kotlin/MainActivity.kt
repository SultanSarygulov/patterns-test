
fun main(){
    val weatherStation = WeatherStation()
    weatherStation.addMan(Man(name = "Sultan", surname = "Sarygulov"))
    weatherStation.addMan(Man(name = "Sanjar", surname = "Sarygulov"))
    weatherStation.addMan(Man(name = "Bermet", surname = "Sarygulova"))

    weatherStation.updateWeather()
}
