package com.sha1028en.exampleviewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sha1028en.exampleviewmodel.databinding.ActivityMainBinding
import com.sha1028en.exampleviewmodel.ui.main.MainFragment

class MainActivity : AppCompatActivity() {
    private val bind by lazy { ActivityMainBinding.inflate( this.layoutInflater) }

    override fun onCreate( savedInstanceState: Bundle?) {
        super.onCreate( savedInstanceState)
        setContentView( this.bind.root)

        // Append Fragment
        if ( savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace( R.id.ActivityMain_root, MainFragment())
                .commitNow()

        }
    }
}