// --- collection list
val systemUser :MutableList<Int> = mutableListOf(1,2,3)
val sudoers : List<Int> = systemUser

fun addSystemUser(newUser:Int){
    systemUser.add(newUser)
}

fun getSystemSudoers():List<Int>{
    return sudoers
}


//-----filter
fun filterNumber(){
    val number = listOf(4,-5,2,3,-9)
    val positive = number.filter{n -> n > 0}
    val negative = number.filter{it < 0}
    println("Numbers: $number")
    println("Positive Numbers: $positive")
    println("Negative Numbers: $negative")
}

//---map
fun mapNumber()
{
    val numbers = listOf(1,-2,3,-4,5,-6)
    val double = numbers.map{x->x *2}
    val triple = numbers.map{it*3}
    println("Numbers: $numbers")
    println("Doubled Numbers: $double")
    println("Tripled Numbers: $triple")
}

fun findKata()
{
    val words = listOf("Ini", "Adalah","Kata","dari","mana","aja")

    val first = words.find{it.startsWith("Kata")}
    val last = words.findLast { it.startsWith("dari")
    }
    val nothing = words.find { it.contains("j") }

    println("The first word starting with \"some\" is \"$first\"")
    println("The last word starting with \"some\" is \"$last\"")
    println("The first word containing \"nothing\" is ${nothing?.let { "\"$it\"" } ?: "null"}")
}

fun findAngka()
{
    val numbers = listOf(4,2,5,7,3,1,3,8)
    val first = numbers.first()
    val last = numbers.last()

    val firstEven = numbers.first{it % 2 ==0}
    val lastOdd = numbers.last{it % 2 !=0}
    println("Numbers: $numbers")
    println("First $first, last $last, first even $firstEven, last odd $lastOdd")
}


fun countAngka()
{
    val numbers = listOf(3,5,6,7,8,2,1,5)
    val totalNumbers = numbers.count()
    val totalEven =numbers.count { it %2 ==0 }
    println("Total number of elements: $totalNumbers")
    println("Number of even elements: $totalEven")
}

//-- asociateBy dan groupBy
fun associateByandGroupBy(){

data class Person(val name:String,val city:String,val phone:String)

val people = listOf(
    Person("Fahmy","Ciamis","082118418130"),
    Person("Fauzi","Bandung","081323569955"),
    Person("Lia","Bandung","0822134"),

    Person("Alvianda","Tasikmalaya","085156229226")
)

val phoneBook = people.associateBy { it.phone }
val cityBook = people.associateBy (Person::phone, Person::city )
val peopleCities = people.groupBy ( Person::city,Person::name )
val lastPersonCity = people.associateBy (   Person::city, Person::name )

println("People: $people")
println("Phone book: $phoneBook")
println("City book: $cityBook")
println("People living in each city: $peopleCities")
println("Last person living in each city: $lastPersonCity")
}


//--flatmap
fun flatMapExample ()
{
    val fruitBag = listOf("apel","semangka","jeruk","nanas")
    val clothesBag = listOf("celana","baju","kaos","Kemeja")
    val cart = listOf(fruitBag,clothesBag)
    val mapBag = cart.map { it }
    val flatBag = cart.flatMap { it }


    println("Your bags are: $mapBag")
    println("The things you bought are: $flatBag")
}

//--collection
fun printAll(strings:Collection<String>){
    for (s in strings ) print("$s")
    println()
}

fun printAllNumbers(numbers:Collection<Int>){
    for (n in numbers) print(n)
    println()
}

// -- list

fun listStrings(){
    val numbers = listOf("one","two","three")
    println("banyak number ${numbers.size}")
    println("number ke dua adalah ${numbers.get(1)}")
    println("number ke tiga adalah ${numbers[2]}")
    println("index dari elemen \"two\" adalah ${numbers.indexOf("two")} ")
}

fun mutableList()
{
    val number = mutableListOf(1,2,3,4,5,6)
    number.add(7)
    number.removeAt(1)
    number[0] = 0
    number.shuffle()
    println(number)
}

// --set
fun setNumbers ()
{
    val numbers = setOf(1,3,2,4,)
    println("panjang number adalah ${numbers.size}")
    if(numbers.contains(1)) println("1 berada pada set")

    val numbersBackward = setOf(4,3,2,1)
    println("$numbers sama dengan $numbersBackward adalah : ${numbers == numbersBackward}  ")

    println(numbers.first() == numbersBackward.first())
    println(numbers.first() == numbersBackward.last())
}

//---map
fun mapNumbersCollection()
{
    val numbersMap = mapOf(
        "key1" to 1,
        "key2" to 2,
        "key3" to 3
    )

    println("Semua key : ${numbersMap.keys}")
    println("Semua nilai: ${numbersMap.values}")
    if("key2" in numbersMap) println("nilai \"key2\" adalah : ${numbersMap["key2"]}")
    if(1 in numbersMap.values) println("1 berada pada map")
    if(numbersMap.containsValue(4)) println("2 berada pada map") else println("4 tidak ada")
}
