package com.example.indonesianfood
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class detailgizifoodActivity : AppCompatActivity() {

    companion object{
        const val EXTRA_fimg = "extra_img"
        const val EXTRA_name = "extra_name"
        const val EXTRA_daerah = "extra_daerah"
        const val EXTRA_energi = "extra_energi"
        const val EXTRA_protein = "extra_protein"
        const val EXTRA_besi = "extra_besi"
        const val EXTRA_lemak = "extra_lemak"
        const val EXTRA_serat = "extra_serat"
        const val EXTRA_kalsium = "extra_kalsium"
        const val EXTRA_vit_c = "extra_vit_c"
        const val EXTRA_deskrip = "extra_dekrip"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailgizifood)

        val FIMG : ImageView = findViewById(R.id.image_detailgizi)
        val Fname : TextView = findViewById(R.id.detail_food_name)
        val Fdaerah : TextView = findViewById(R.id.detail_asal_makanan)
        val Fenergi : TextView = findViewById(R.id.FGenergi)
        val Fprotein : TextView = findViewById(R.id.FGprotein)
        val Fbesi : TextView = findViewById(R.id.FGbesi)
        val Flemak : TextView = findViewById(R.id.FGlemak)
        val Fserat : TextView = findViewById(R.id.FGserat)
        val Fkalsium : TextView = findViewById(R.id.FGkalsium)
        val Fvitc : TextView = findViewById(R.id.FGvit_c)
        val Deskrip : TextView = findViewById(R.id.deskripFood)

        val photo = intent.getIntExtra(EXTRA_fimg, 0)
        val name = intent.getStringExtra(EXTRA_name)
        val asal = intent.getStringExtra(EXTRA_daerah)
        val energi = intent.getStringExtra(EXTRA_energi)
        val protein = intent.getStringExtra(EXTRA_protein)
        val besi = intent.getStringExtra(EXTRA_besi)
        val lemak = intent.getStringExtra(EXTRA_lemak)
        val serat = intent.getStringExtra(EXTRA_serat)
        val kalsium = intent.getStringExtra(EXTRA_kalsium)
        val vitc = intent.getStringExtra(EXTRA_vit_c)
        val deskrip = intent.getStringExtra(EXTRA_deskrip)

        Fname.text = name
        Fdaerah.text = asal
        Glide.with(this)
            .load(photo)
            .apply(RequestOptions())
            .into(FIMG)
        Fenergi.text = energi
        Fprotein.text = protein
        Fbesi.text = besi
        Flemak.text = lemak
        Fserat.text = serat
        Fkalsium.text = kalsium
        Fvitc.text = vitc
        Deskrip.text = deskrip
    }
}