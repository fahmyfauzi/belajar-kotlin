import java.lang.Exception

// --- when
 fun cases(obj:Any){
     when(obj){
         1->println("one")
         "Hello" -> println("greeting")
         is Long->println("Long")
        !is String ->println("Not is string")
         else -> println("Unknow")
     }
 }

 //---partition
 fun tesPartition (){
     val numbers = listOf(1,-2,3,-4,5,-6,7,-8)
     val evenOdd = numbers.partition { it % 2 == 0 }
     val (positives,negatives) = numbers.partition { it > 0 }

     println("Numbers : $numbers")
     println("Even: ${evenOdd.first}")
     println("Odd: ${evenOdd.second}")
     println("Positive number: $positives")
     print("Negative number: $negatives")

 }

 //---kalkulator
 fun kalkulator(){
     try {
         print("Masukan angka pertama: ")
         val angka1 = readLine()!!.toDouble()
         print("Masukan angka kedua: ")
         val angka2 = readLine()!!.toDouble()
         print("Masukan aksi operasi - Tambah(a), Kurang(b), Perkalian(c),Pembagian(d): ")
         when(readLine()){
             "a"->{
                 print("Hasil = ${angka1+angka2}")
             }
             "b"->{
                 print("Hasil = ${angka1-angka2}")
             }
             "c"->{
                 print("Hasil = ${angka1*angka2}")
             }
             "d"->{
                 print("Hasil = ${angka1/angka2}")
             }
             else->{
                 print("Operasi yang dimasukan tidak valid")
             }


         }
     }catch (e:Exception){
         print("Angka yang dimasukkan tidak valide")
     }
 }

//---register
fun registerAkun(){

    try {
        print("Masukan username anda: ")
        val username = readLine()
        print("Masukan password anda: ")
        val password = readLine()

        println("Selamat ${username} telah mendaftar")
    }catch (e:Exception)
    {

    }

}

fun loginAkun(){
    print("Masukan username anda: ")
    val username = readLine()
    print("Masukan password anda: ")
    val password = readLine()

    if(username == "fahmy" && password == "fauzi")
    {
        println("Selamat datang ${username} ")
    }else{
        println("username atau password salah")
    }
}

fun daduAcak()
{
//    val numbers = listOf(1,2,3,4,5,6)
    val numbers = listOf(1,2,3,4,5,6)

//    val result = (1..5).random()
    val result = numbers.random()
    println("$result adalah angka keberuntunganmu dari ${numbers[0]} sampai ${numbers.last()}")
}

fun reverseArray () {
    val numbers = listOf(1,2,3,4,5,6)

}