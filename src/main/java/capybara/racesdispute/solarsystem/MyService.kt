package capybara.racesdispute.solarsystem

import android.app.Service
import android.app.Service.START_STICKY
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.os.IBinder
import androidx.core.app.ServiceCompat.START_STICKY

class MyService : Service() {

    var mMediaPlayer: MediaPlayer ?= null

    override fun onBind(intent: Intent): IBinder {
        TODO("Return the communication channel to the service.")
    }

    override fun onCreate() {
        super.onCreate()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        super.onStart(intent, startId)
        mMediaPlayer = MediaPlayer.create(this, R.raw.music_morowind)
        mMediaPlayer!!.isLooping = true
        mMediaPlayer!!.start()
        return START_STICKY
    }


    override fun onDestroy() {
        super.onDestroy()

        mMediaPlayer!!.pause()
    }
}