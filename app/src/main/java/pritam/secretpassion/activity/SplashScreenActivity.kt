package pritam.secretpassion.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.google.firebase.auth.FirebaseAuth
import pritam.secretpassion.MainActivity
import pritam.secretpassion.R
import pritam.secretpassion.auth.LoginActivity

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val user = FirebaseAuth.getInstance().currentUser

        Handler(Looper.getMainLooper()).postDelayed({
            if (user == null)
                startActivity(Intent(this, LoginActivity::class.java))
            else
//                  startActivity(Intent(this,MainActivity::class.java))
                startActivity(Intent(this, MainActivity::class.java))
            finish()
        },2000)

    }
}