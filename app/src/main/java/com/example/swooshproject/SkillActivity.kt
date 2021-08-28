package com.example.swooshproject
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SkillActivity : BaseActivity() {
   var leaguge=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        leaguge= intent.getStringExtra(EXTRA_LEAGUGE).toString()
        Toast.makeText(this,leaguge,Toast.LENGTH_LONG).show()
    }
}
