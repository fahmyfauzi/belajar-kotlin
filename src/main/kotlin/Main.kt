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

    IterableSequence()
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
