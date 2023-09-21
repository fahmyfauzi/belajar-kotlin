import java.lang.StringBuilder
import javax.xml.crypto.Data

fun main() {
//    cases(1)
//    tesPartition()

//    kalkulator()
//    registerAkun()
//    loginAkun()
//    daduAcak()

//    val rectangle = Rectangle(5.0,2.0)
//    println("Hasilnya dari tinggi ${rectangle.height} dan lebar segitiga ${rectangle.length} adalah ${rectangle.result}")

//    val bmw = Car(4,2,"merah","Ferari",100)
//    bmw.jalan()
//    bmw.mundur()
//    bmw.tambahBensin(10)

//    reverseAngka()

//    luasPersegi()
//    DolarKeRupiah()

//    CariNilaiTerbesar()

    //------collection
//    //1. list collection
//    addSystemUser(8)
//    println("Tot sudoers: ${getSystemSudoers().size}")
//    getSystemSudoers().forEach({
//        i->
//        println("Some useful info on user $i")
//    })


    //3. filter
//    filterNumber()
//    mapNumber()
//    findKata()

//    findAngka()

//    countAngka()

//    associateByandGroupBy()

//    flatMapExample()

//    println(describeString(null))
//    println(describeString("Testing nullsafety"))

//   --inheritance
//    val dog:Dog =Yorkshire()
//    dog.sayHello()

//    ---collection
//    val stringList = listOf("One","Two","Three")
//    printAll(stringList)
//
//    val stringSet = setOf("one", "two", "three")
//    printAll(stringSet)
//
//    val numberList = listOf(1,3,5,3,5,)
//    printAllNumbers(numberList)
//
//    val numberSet = setOf(1,2,5,6,78,0)
//    printAllNumbers(numberSet)

//    listStrings()
//    mutableList()

//    setNumbers()
//    mapNumbersCollection()

//    IterableSequence()

//--function dicoding
//    val user  = setUser("Fahmy",23)
//    println(user)
//
//    printUser("Fauzi")

//    --- aray
//    val intArray = intArrayOf(1,2,3,4,5)
//    val mixArray = arrayOf(1,2,3,"Testing",true)
//    intArray[2] = 11
//    println(intArray[1])
//    println(mixArray[4])
//


    //--nullable
//    val text: String? = null
//    if(text!=null)
//    {
//        println(text.length)
//    }else{
//        println("Text masih kosong")
//    }
//    //--safe calls
//    val text2: String? = null
//    println(text2?.length)
//
//    //--elvis operator
//    val text3: String? = null
//    println(text3?.length ?: 7)

//--    non null assertion
//    val text4: String? = null
//    println(text4!!.length)

//---- enumeration
//    val color: Color = Color.GREEN
//    println(color)
//    println("posisi $color adalah ${color.ordinal}")
//    println("nilai $color adalah ${color.value}")
//
//    when(color){
//        Color.RED -> print("color is red")
//        Color.GREEN -> print("color is green")
//        Color.BLUE -> print("color is blue")
//    }

//    val colors: Array<Color> = Color.values()
//    colors.forEach { color->
//        print("$color ")
//    }

//    -- when expression
//    val registerNumber = when(val regis = getRegisterNumber()){
//        in 1..50 -> 50*regis
//        in 51..100 ->50*regis
//        else ->regis
//
//    }
//    println(registerNumber)
//
//    val anyType: Any = 100L
//    when (anyType) {
//        is Long -> println("the value has a Long type")
//        is Int -> println("the value has a Int type")
//        is Double -> println("the value has a Double type")
//        else -> println("undefined")
//    }


    //--while and do while
//    whileHello()
//    doWhileHello()

    //---range
//    rangeAngka()

//    forLoop()


//    breakList()
//    println()
//    println("---------")
//    continueList()

//    labelBreakContinue()

//    class
//    val dataUser = DataUser("Fahmy",23)
//    dataUser.intro()



//    list()
//    set()

//    map()

//    collectionOperator()

//    sequenceCollection()
//
//    val number = varArgSumNumber(1,2,3,4,5   )
//    print(number)


//---extension properti dan extension function
//    println(10.slice)
//    12.PrintInt()


//    --function type
//    val sumResult = sum.invoke(10,10)
//    val multiplyResult  = multiply(10,20)
//    val sumNullReceiber = sum?.invoke(0,23)
//
//    println("Hasil $sumResult")
//    println("hasil multiply $multiplyResult")
//    println(sumNullReceiber)

//    val message = buildString {
//        append("helo ")
//        append("from ")
//        append("lambda")
//    }
//    println(message)


//  --- lambda receiver this : apply,run,with
//    val buildeString =StringBuilder().apply {
//        append("world")
//        append("hello")
//    }
//    println(buildeString)
//
//    // --lambda receiver it
//    val text = "Hello"
//    text.let{
//        val message = "$it kotlin"
//        println(message)
//    }

//    ---lambda run
//    val result = text.run{
//        val from = this
//        val to = this.replace("Hello","Kotlin")
//        "replace text from $from to $to"
//    }
//    println("Result: $result")

//    ---lambda with
//    val message = "Halo Kotlin"
//    val result = with(message){
//      "Firts character is ${this[0]} " +
//              "and last character is ${this[this.length - 1]}"
//
//    }
//    println(result)

    //--lambda apply
//    val message = StringBuilder().apply{
//        append("Hello")
//        append(" word")
//    }
//    println(message)





//  ---  atau // lambda let ,also
//    text.let{ value ->
//        val message = "$value kotlin"
//        println(message)
//
//    }

//    ---let
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    }
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }

    //-also
//    val text = "Hello Kotlin"
//    val result = text.also {
//        println("value length -> ${it.length}")
//    }
//
//    println("text -> $result")

//--referecnce function
//    val numbersx = 1.rangeTo(10)
////    val evenNumber = numbers.filter (::isEvenNumber )
//    val evenNumbers = numbersx.filter(Int::isEvenNumbers)
//    println(evenNumbers)
//
    println(::message.name)
    println(::message.get())

    ::message.set("Kotlin Academy")

    println(::message.get())

























}




var message = "Kotlin"


// --- extension
val Int.slice: Int
    get() = this / 2

//--data class dicoding
data class DataUser(val name:String,val age:Int){
    fun intro(){
        println("Helo nama saya $name saya berumur $age tahun")
    }
}


enum class Color(val value:Int){
    RED(0xF0000),
    GREEN(0x00FF00),
    BLUE(0x000FF)
}


open class Dog()
{
    open fun sayHello()
    {
        println("wow wow")
    }
}

class Yorkshire() : Dog(){
    override fun sayHello() {
        println("wif wif")
    }
}


