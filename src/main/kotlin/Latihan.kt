fun main() {

    var waktuParkir: Int
    var biayaParkir: Float

    //input waktunya disini ya :) (waktu dalam satuan jam)
    waktuParkir = 2

    //peraturan biaya parkir
    val tarifDasar = 1.0
    val tarifPerjam1 = 0.5
    val tarifPerjam2 = 1.1
    val maxTarif = 15

    //proses pentarifan
    if (waktuParkir < 5) {
        biayaParkir = (tarifDasar*waktuParkir).toFloat()
    } else if ((waktuParkir < 26) && (waktuParkir > 5)) {
        biayaParkir = tarifDasar + (waktuParkir * tarifPerjam2)
    } else if (waktuParkir < 5){
        biayaParkir = tarifDasar + (waktuParkir * tarifPerjam1)
    }


    //out
    println("Lama Parkir : $waktuParkir")
    println("Biaya Parkir : $biayaParkir")

}