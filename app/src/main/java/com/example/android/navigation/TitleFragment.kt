package com.example.android.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.navigation.databinding.FragmentTitleBinding

class TitleFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_title, container, false)
        val binding: FragmentTitleBinding = DataBindingUtil.inflate(
                inflater,
                R.layout.fragment_title,
                container,
                false
        )

        // defino el listener del click del boton y navego a la siguiente pantalla a traves del id del action
        // binding.playButton.setOnClickListener { Navigation.findNavController(it).navigate(R.id.action_titleFragment_to_gameFragment) }
        // or
        // binding.playButton.setOnClickListener { view: View -> view.findNavController().navigate(R.id.action_titleFragment_to_gameFragment) }
        // or
        binding.playButton.setOnClickListener( Navigation.createNavigateOnClickListener(R.id.action_titleFragment_to_gameFragment) )

        return binding.root
    }

}