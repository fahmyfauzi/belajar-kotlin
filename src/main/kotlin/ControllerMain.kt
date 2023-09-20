import java.lang.Exception
import java.util.Date

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

fun reverseAngka()
{
    var numbers =1234
    print("Kebalikan dari $numbers ")
    var reverse = 0
//    ketika numbers tidak berisi 0 atau ada isinya
    while(numbers != 0)
    {
        // 1234 % 10 = 4
        val digit = numbers % 10

        // 0 * 10 + 4 = 4
        reverse = reverse * 10 + digit

        /*
        iterasi numbers pertama 4/10 = 0.4
        iterasi numbers kedua  3/10=0.3
         iterasi numbers ketiga 2/10=0.2
         iterasi numbers keempat 1/10=0.1
         iterasi numbers kelima 0/10=0

         maka numbers == 0 dan iterasi dihentikan
         */
        numbers /= 10
    }
    println("adalah $reverse")
}

fun luasPersegi()
{
    print("Masukan panjang sisi 1 : ")
    var sisi1 = readLine()!!.toDouble()
    print("Masukan panjang sisi 2 : ")
    var sisi2 = readLine()!!.toDouble()
    var result = sisi1*sisi2
    println("Hasil dari luas persegi adalah : ${result.toInt()}")

}

fun DolarKeRupiah()
{
    print("Masukan dolar : ")
    var dolar = readln()!!.toDouble()
    val rupiah = 15.38800
    var result = dolar * rupiah
    println("Hasil dari $dolar adalah Rp$result ")
}


//mencari nilai terbesar
fun CariNilaiTerbesar()
{
    print("Masukan nilai pertama: ")
    var nilaiPertama = readln()!!.toDouble()
    print("Masukan nilai Kedua: ")
    var nilaiKedua = readln()!!.toDouble()
    print("Masukan nilai Ketiga: ")
    var nilaiKetiga = readln()!!.toDouble()

    if(nilaiPertama > nilaiKedua && nilaiPertama > nilaiKetiga)
    {
        println("Nilai $nilaiPertama lebih besari dari nilai $nilaiKedua dan $nilaiKetiga")
    }else if(nilaiKedua > nilaiPertama && nilaiKedua > nilaiKetiga)
    {
        println("Nilai $nilaiKedua lebih besari dari nilai $nilaiPertama dan $nilaiKetiga")
    }else if(nilaiPertama == nilaiKedua && nilaiPertama == nilaiKetiga) {
        println("Nilai $nilaiKedua ,  $nilaiPertama dan $nilaiKetiga adalah sama")

    }else{
        println("Nilai $nilaiKetiga lebih besari dari nilai $nilaiPertama dan $nilaiKedua")

    }
}

//null safety
fun describeString( maybeStringNull :String?):String {
    if(maybeStringNull != null && maybeStringNull.length > 0)
    {
        return "panjang string adalah ${maybeStringNull.length}"
    }else{
        return "String kosong"
    }

}

fun IterableSequence()
{
    val words = "Ini adalah teks dummy yang dibuat secara manual dan diketik oleh fahmy".split(" ")
    val lengthList =words.filter{ println("filter: $it"); it.length > 3 }
        .map { println("length : ${it.length}");it.length }
        .take(2)

    println("Lengths of first 4 words longer than 3 chars:")
    println(lengthList)
}