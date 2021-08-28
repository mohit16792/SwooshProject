package Controller
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.swooshproject.EXTRA_LEAGUE
import com.example.swooshproject.R
import kotlinx.android.synthetic.main.activity_league.*


class LeagueActivity : BaseActivity() {
    var selectedLeaguge=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)



    }
    fun mensLeagugeClickec(view: View) {
       womensLeagugeBtn.isChecked=false
       coedLeagugeBtn.isChecked=false
        selectedLeaguge="mens"
    }
    fun womensLeagugeClicked(view: View) {
        mensLeagugeBtn.isChecked=false
        coedLeagugeBtn.isChecked=false
        selectedLeaguge="womens"
    }
    fun coedLeaugeClicked(view: View) {
        womensLeagugeBtn.isChecked=false
        mensLeagugeBtn.isChecked=false
        selectedLeaguge="coed"
    }

    fun leagueNextClicked(view: View) {
        if(selectedLeaguge!="") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE,selectedLeaguge)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this,"please select a Leauge",Toast.LENGTH_SHORT).show()
        }
    }


}
