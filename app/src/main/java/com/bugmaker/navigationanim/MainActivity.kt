package com.bugmaker.navigationanim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onBackPressed() {
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val fragment = navHostFragment.childFragmentManager.primaryNavigationFragment
        //Log.d("TAG", "onBackPressed: ${fragment?.javaClass?.name}")
        if (fragment is FragmentOne) {
            this.finish()
        }else{
            navHostFragment.navController.navigateUp()
        }
    }

}