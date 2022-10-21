data class House(
    val material: String,
    val rooms: Int,
    val floors: Int,
    val hasPool: Boolean
)

// Use what I've learned from Singleton pattern
// Create a singleton class, so all new classes inherit from it
// It has default parameters and functions where you can change them
object HouseBuilder{
    var material: String = "Wood"
    var rooms: Int = 5
    var floors: Int = 2
    var hasPool: Boolean = false

    fun material(value: String): HouseBuilder{
        this.material = value
        return HouseBuilder
    }

    fun rooms(value: Int): HouseBuilder{
        this.rooms = value
        return HouseBuilder
    }

    fun floors(value: Int): HouseBuilder{
        this.floors = value
        return HouseBuilder
    }

    fun hasPool(value: Boolean): HouseBuilder{
        this.hasPool = value
        return HouseBuilder
    }

    // main function where we create our class
    fun build(): House = House(
        material = material,
        rooms = rooms,
        floors = floors,
        hasPool = hasPool
    )
}