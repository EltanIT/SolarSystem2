package capybara.racesdispute.solarsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class PlanetActivity : AppCompatActivity() {

    lateinit var planetTextViewAc2: TextView
    var boolMediaPlayer: Boolean ?= false
    lateinit var imageViewFotoPlanet: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_planet)

        imageViewFotoPlanet = findViewById(R.id.imageViewFotoPlanet)
        planetTextViewAc2 = findViewById(R.id.planetTextView)

        var intent = Intent(intent)

        val text = intent.getStringExtra("TextViewPlanet")
        planetTextViewAc2.setText(text)

        boolMediaPlayer = intent.getBooleanExtra("boolMediaPlayer", false)
        val imageFotoPlanetId = intent.getIntExtra("imagePlanetPhoto", 1)
        imageViewFotoPlanet.setImageResource(imageFotoPlanetId)
    }

    fun ExitActivityOnClick(view: View) {
        intent = Intent(this@PlanetActivity,MainActivity::class.java)
        intent.putExtra("boolMediaPlayer", boolMediaPlayer)
        startActivity(intent)
    }

    fun StartOrStopMusic(view: View) {
        var intent = Intent(this@PlanetActivity, MyService::class.java)
        if (boolMediaPlayer == true) {
            startService(intent)
            boolMediaPlayer = false
        }
        else {
            stopService(intent)
            boolMediaPlayer = true
        }
    }
}