package com.example.ktln2_less1.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ktln2_less1.ui.adapters.FirstAdapter
import com.example.ktln2_less1.click.OnItemTextListener
import com.example.ktln2_less1.data.model.FirstModel
import com.example.ktln2_less1.data.repository.CatRepository
import com.example.ktln2_less1.databinding.FragmentFirstBinding

class FirstFragment : Fragment(), OnItemTextListener {

    private lateinit var binding: FragmentFirstBinding
    private val listCat = mutableListOf<FirstModel>()
    private val repository = CatRepository()
    private val adapter = FirstAdapter(listCat, this)

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        binding.rvCats.layoutManager =
            LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        listCat.addAll(repository.getListOfCatHTTP())
        binding.rvCats.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        listCat.clear()
    }

    override fun onClickListener(model: FirstModel) {
        val text = model.name
        val icon = model.icon
        findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToDetailFragment().setIcon(icon).setName(text))
    }
}