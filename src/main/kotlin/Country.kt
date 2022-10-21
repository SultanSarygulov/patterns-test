//Create Country class and countries
sealed class Country {
    object Canada: Country()
}

object Spain: Country()
class Italy(val someProperty: String): Country()
data class Russia (val someProperty: String): Country()

//
class Currency(val code: String)

// connect countries with their currencies
object CurrencyFactory{
    fun createCurrency(country: Country): Currency =
        when(country){
            is Spain -> Currency("EUR")
            is Italy -> Currency("EUR")
            is Russia -> Currency("RUB")
            is Country.Canada -> Currency("CAD")
        }
}

// testing
fun main(){
    val italianCurrency = CurrencyFactory.createCurrency(Italy("")).code
    println(italianCurrency)
}
