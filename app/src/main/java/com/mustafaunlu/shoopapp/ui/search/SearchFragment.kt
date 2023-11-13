package com.mustafaunlu.shoopapp.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.mustafaunlu.shoopapp.databinding.ActivityHomeSearchFragmentBinding

class SearchFragment : Fragment() {
    private lateinit var binding: ActivityHomeSearchFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = ActivityHomeSearchFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }
}