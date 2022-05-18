package com.example.hw17_themoviedb.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.hw17_themoviedb.R
import com.example.hw17_themoviedb.databinding.FragmentShowMovieListBinding

class ShowMovieListFragment : Fragment() {
    lateinit var binding: FragmentShowMovieListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,
            R.layout.fragment_show_movie_list,container,false)
        return binding.root
    }

}