fun main(){
    // Build a house,
    // but made with bricks (instead of default wood)
    val house: House = HouseBuilder
        .material("Brick")
        .build()

    // Write a sentence to check the work
    with(house){
        println("This house is made of $material, has $rooms rooms, $floors floors, and has a pool ($hasPool) ")
    }
}