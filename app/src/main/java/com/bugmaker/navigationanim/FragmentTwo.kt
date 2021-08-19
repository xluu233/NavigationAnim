package com.bugmaker.navigationanim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.navigation.fragment.navArgs


class FragmentTwo : Fragment(R.layout.fragment_two) {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initParams()
    }

    //val args: FragmentTwo by navArgs()

    private fun initParams() {

    }

}