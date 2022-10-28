package com.example.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.practika18_19.MAIN
import com.example.practika18_19.R
import com.example.practika18_19.databinding.FragmentOneBinding


class OneFragment : Fragment() {

    lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding = FragmentOneBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.BtnOne.setOnClickListener{
            MAIN.navControler.navigate(R.id.action_oneFragment_to_twoFragment)
        }

    }
}