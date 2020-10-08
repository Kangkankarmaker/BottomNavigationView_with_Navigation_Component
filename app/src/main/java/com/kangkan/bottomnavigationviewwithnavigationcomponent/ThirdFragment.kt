package com.kangkan.bottomnavigationviewwithnavigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_third.view.*


class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val  view=inflater.inflate(R.layout.fragment_third, container, false)

        view.txt3.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_thirdFragment_to_firstFragment) }

        return view
    }

}