package jlapps.games.devquiz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.os.bundleOf
import jlapps.games.devquiz.menu.api.ApiClient
import jlapps.games.devquiz.util.FragmentUtil
import jlapps.games.devquiz.util.FragmentUtil.showFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Set URL for endpoint for educational purposes
//        ApiClient.setURL(this)
        if(savedInstanceState == null) {
            title = "Score: 0"
            showFragment(
                supportFragmentManager,
                FragmentUtil.Fragments.SHOW_MENU,
                bundleOf(Pair("fade", true))
            )
        }

    }
}