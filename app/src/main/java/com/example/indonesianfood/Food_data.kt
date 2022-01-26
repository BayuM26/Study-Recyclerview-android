package com.example.indonesianfood

object Food_data {
    private val food_name = arrayOf(
        "Bobengka",
        "Kapurung",
        "Abon Haruwan",
        "Amparan Tatak",
        "Beberuk",
        "Emping Komak",
        "Geplak",
        "Tumis Keumamah",
        "Sayur Lebui",
        "Gulai Pliek",
    )

    private val energi = arrayOf(
        "225 Kal",
        "41 Kal",
        "513 Kal",
        "191 Kal",
        "65 Kal",
        "355 Kal",
        "350 Kal",
        "300 Kal",
        "64 Kal",
        "176 Kal",
    )

    private val protein = arrayOf(
        "5.3 g",
        "2.0 g",
        "23.7 g",
        "1.3 g",
        "1.1 g",
        "17.8 g",
        "1.4 g",
        "14.5 g",
        "2.1 g",
        "7.3 g",
    )

    private val besi = arrayOf(
        "-",
        "0.3 mg",
        "0.5 mg",
        "-",
        "8.3 mg",
        "4.3 mg",
        "2.1 mg",
        "-",
        "1.0 mg",
        "1.4 mg",
    )

    private val lemak = arrayOf(
        "2.6 g",
        "0.3 g",
        "37.0 g",
        "5.5 g",
        "5.2 g",
        "4.6 g",
        "14.4 g",
        "20.0 g",
        "0.6 g",
        "14.9 g",
    )

    private val serat = arrayOf(
        "-",
        "2.0 g",
        "-",
        "-",
        "3.1 g",
        "-",
        "1.8 g",
        "4.5 g",
        "5.7 g",
        "-",
    )

    private val kalsium = arrayOf(
        "-",
        "34 mg",
        "25 mg",
        "-",
        "179 mg",
        "87 mg",
        "151 mg",
        "-",
        "21 mg",
        "39 mg",
    )

    private val vit_c = arrayOf(
        "-",
        "15 mg",
        "-",
        "-",
        "-",
        "-",
        "0 mg",
        "7 mg",
        "-",
        "-",
    )


    private val daerh_asal_makanan = arrayOf(
        "Sulawesi Utara",
        "Sulawesi Selatan",
        "Kalimantan Selatan",
        "Kalimantan Selatan",
        "Nusa Tenggara Barat",
        "Lombok",
        "Yogyakarta",
        "Aceh",
        "Lombok",
        "Aceh",
    )

    private val Bahandasar = arrayOf(
        "Berbahan dasar tepung terigu, gula merah/gula kelapa, kenari yang diolah dengan cara dipanggang",
        "Bahan dasar: Tepung sagu seperti papeda. Campuran ikan atau daging ayam atau udang dan aneka sayuran (bayam, kacang panjang, daun kacang, jantung)",
        "Abon dari ikan gabus",
        "Seperti kue talam. Berbahan dasar tepung beras, santan, dan pisang",
        "Sayuran mentah (kacang panjang dan terong ungu kecil diiris halus), ditambah bumbu / saos: cabe merah, cabe rawit merah, tomat, terasi, dan garam",
        "Seperti emping melinjo namun berbahan dasar kacang komak. Khas lombok.",
        "Parutan kelapa kasar dengan gula pasir",
        "Keumamah atau katshibushi atau ikan kayu (jenis ikan: tongkol/tuna/cakalang). Ikan direbus, dikeingkan beberapa hari hingga mengeras, lalu diiris kecil-kecil. Keumamah dimasak tumis",
        "Bahan dasar kedelai hitam yang direbus bersama labu kuning, belimbing wuluh, tomat, cabai dan santan.",
        "Bahan dasar: nangka muda, daun melinjo, buah melinjo, jantung pisang, kacang panjang. Direbus dengan santan.",
    )

    private val image_food = arrayOf(
        R.drawable.bobengka,
        R.drawable.kapurung,
        R.drawable.imgabon_haruwan,
        R.drawable.imgamparan_tatak,
        R.drawable.imgbeberuk,
        R.drawable.imgemping_komak,
        R.drawable.imggeplak,
        R.drawable.imgtumis_keumamah,
        R.drawable.imgsayur_lebui,
        R.drawable.imggulai_pliek,
    )

    val listfood: ArrayList<food>
    get(){
        val list = arrayListOf<food>()
        for (position in food_name.indices){
            val Lfood = food()
            Lfood.food_name = food_name[position]
            Lfood.daerah_asal = daerh_asal_makanan[position]
            Lfood.imge_food = image_food[position]
            Lfood.FGenergi = energi[position]
            Lfood.FGprotein = protein[position]
            Lfood.FGbesi = besi[position]
            Lfood.FGlemak = lemak[position]
            Lfood.FGserat = serat[position]
            Lfood.FGkalsium = kalsium[position]
            Lfood.FGvit_c = vit_c[position]
            Lfood.bahandasar = Bahandasar[position].toString()
            list.add(Lfood)
        }
        return list
    }
}