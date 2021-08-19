package com.bugmaker.navigationanim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import com.bugmaker.navigationanim.databinding.FragmentOneBinding


class FragmentOne : Fragment(R.layout.fragment_one) {

    private var _binding:FragmentOneBinding ?= null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //默认动画
        binding.button.setOnClickListener {
            navigate(R.id.action_default)
        }

        //平移动画
        binding.button2.setOnClickListener {
            navigate(R.id.action_slide)
        }

        //缩放动画
        binding.button3.setOnClickListener {
            navigate(R.id.action_scale1)
        }

        binding.button4.setOnClickListener {
            navigate(R.id.action_scale2)
        }

        //带有弧度的缩放动画
        binding.button5.setOnClickListener {
            navigate(R.id.action_scale3)
        }

        //从下往上
        binding.button6.setOnClickListener {
            navigate(R.id.action_upup)
        }

        //疯狂旋转
        binding.button7.setOnClickListener {
            navigate(R.id.action_xxx)
        }
    }


    /**
     * fragment跳转，防止重复点击崩溃
     */
    fun navigate(destination: Int, bundle: Bundle ?= null) = NavHostFragment.findNavController(this).apply {
        currentDestination?.getAction(destination)?.let {
            navigate(destination,bundle)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}