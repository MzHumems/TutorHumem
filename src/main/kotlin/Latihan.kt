fun main() {

    var waktuParkir: Int
    var biayaParkir: Float

    //input waktunya disini ya :) (waktu dalam satuan jam)
    waktuParkir = 24

    //peraturan biaya parkir
    val tarifDasar = 1.0
    val tarifPerjam1 = 1.0
    val tarifPerjam2 = 0.5
    val maxTarif = 15

    //proses pentarifan dan biaya total
    println("Lama Parkir : $waktuParkir")
    if (waktuParkir < 5) {
        biayaParkir = (tarifDasar+(tarifPerjam1*waktuParkir)).toFloat()
        println("Biaya Parkir : $biayaParkir")
    } else if ((waktuParkir < 24) && (waktuParkir > 5)) {
        biayaParkir = (tarifDasar + (tarifPerjam2*waktuParkir)).toFloat()
        println("Biaya Parkir : $biayaParkir")
    } else if (waktuParkir == 24){
        biayaParkir = maxTarif.toFloat()
    } else {

    }
}