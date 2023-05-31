package com.example.aplikasimakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.aplikasimakanan.databinding.FragmentMakananBinding
import com.example.aplikasimakanan.databinding.FragmentMinumanBinding

class fragment_makanan : Fragment() {
    private lateinit var binding: FragmentMakananBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMakananBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.kedua.setOnClickListener {
            this.findNavController()
                .navigate(R.id.action_fragment_makanan_to_fragment_detailmkn)
        }
    }
}