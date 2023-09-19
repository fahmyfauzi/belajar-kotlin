class Car(var Roda:Int, var Pintu:Int, var warna:String,var merek:String,var bensin:Int) {



    fun jalan(){
        var bensin = bensin - 10
        println("${merek} berjalan sejauh 1km dan sisa bensin ${bensin}")
    }

    fun mundur(){
        var bensin = bensin - 5
        println("${merek} berjalan sejauh 500m dan sisa bensin ${bensin -  5}")

    }

    fun tambahBensin(isiBensin:Int){
        println("${merek} mengisi bensin sebanyak ${isiBensin}L ")
    }

}