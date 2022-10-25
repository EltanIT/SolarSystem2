package capybara.racesdispute.solarsystem

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.net.URI

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {

    lateinit var textPlanetViewAc1: TextView
    var boolMediaPlayer: Boolean = false
    var photoPlanetId: Int = 1

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textPlanetViewAc1 = findViewById(R.id.textPlanetAc1)

        var intent = Intent(intent)
        boolMediaPlayer = intent.getBooleanExtra("boolMediaPlayer", true)


    }

    fun StartOrStopMusic(view: View) {
        val intent = Intent(this@MainActivity, MyService::class.java)
        if (boolMediaPlayer) {
            startService(intent)
            boolMediaPlayer = false
        }
        else {
            stopService(intent)
            boolMediaPlayer = true
        }
    }

    fun intentActive(){
        val intent = Intent(this@MainActivity, PlanetActivity::class.java)
        intent.putExtra("TextViewPlanet", textPlanetViewAc1.getText())
        intent.putExtra("boolMediaPlayer", boolMediaPlayer)
        intent.putExtra("imagePlanetPhoto", photoPlanetId)
        startActivity(intent)
    }

    fun eightOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.eightText)
        photoPlanetId = R.drawable.eight_foto
        intentActive()
    }

    fun marsOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.marsText)
        photoPlanetId = R.drawable.mars_foto
        intentActive()
    }
    fun mercuriyOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.merkuriyText)
        photoPlanetId = R.drawable.mercuriy_foto
        intentActive()
    }
    fun veneraOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.veneraText)
        photoPlanetId = R.drawable.venera_foto
        intentActive()
    }
    fun uranOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.uranText)
        photoPlanetId = R.drawable.upiter_foto
        intentActive()
    }
    fun neptunOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.neptunText)
        photoPlanetId = R.drawable.neptun_foto
        intentActive()
    }
    fun saturnOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.saturnText)
        photoPlanetId = R.drawable.saturn_foto
        intentActive()
    }
    fun upiterOnClickPlanet(view: View) {
        textPlanetViewAc1.setText(R.string.upiterText)
        photoPlanetId = R.drawable.upiter_foto
        intentActive()
    }

    fun sunOnClickPlanet(view: View) {
        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=dQw4w9WgXcQ"))
        startActivity(intent)
    }


}
