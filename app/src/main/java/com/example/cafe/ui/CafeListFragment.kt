package com.example.cafe.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.cafe.adapter.CafeAdapter
import com.example.cafe.viewmodel.CafeViewModel
import android.util.Log
import com.example.cafe.R
import com.example.cafe.databinding.FragmentCafeListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class CafeListFragment : Fragment() {

    private var _binding: FragmentCafeListBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private val cafeViewModel : CafeViewModel by viewModels()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cafe_list, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.cafeViewModel = cafeViewModel
        binding.lifecycleOwner = viewLifecycleOwner
        //Log.d("Error", "${cafeViewModel.cafeList}")
        val cafeAdapter = CafeAdapter(cafeViewModel.cafeList)
        binding.cafeRv.adapter = cafeAdapter
        binding.cafeRv.layoutManager = LinearLayoutManager(requireContext())
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
        Log.d("Error", "check destroy")
    }
}