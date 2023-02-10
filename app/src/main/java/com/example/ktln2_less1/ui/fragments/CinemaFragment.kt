package com.example.ktln2_less1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ktln2_less1.ui.adapters.ThirdAdapter
import com.example.ktln2_less1.data.model.FirstModel
import com.example.ktln2_less1.data.repository.CinemaRepository
import com.example.ktln2_less1.databinding.FragmentThirdBinding

class CinemaFragment : Fragment() {

    private lateinit var binding: FragmentThirdBinding
    private val listCinema = mutableListOf<FirstModel>()
    private val repository = CinemaRepository()
    private val adapter = ThirdAdapter(listCinema)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvCinema.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCinema.addAll(repository.getListOfCinema())
        binding.rvCinema.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        listCinema.clear()
    }
}