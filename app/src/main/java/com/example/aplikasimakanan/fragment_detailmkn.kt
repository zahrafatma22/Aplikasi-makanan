package com.example.aplikasimakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.aplikasimakanan.databinding.FragmentDetailBinding
import com.example.aplikasimakanan.databinding.FragmentDetailmknBinding


class fragment_detailmkn : Fragment() {
    private lateinit var binding: FragmentDetailmknBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailmknBinding.inflate(layoutInflater,container,false)
        binding = FragmentDetailmknBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTmbh.setOnClickListener {
            Toast.makeText(context,"berhasil ditambahkan", Toast.LENGTH_SHORT).show()
            this.findNavController()
                .navigate(R.id.action_fragment_detailmkn_to_fragment_pesanan)
        }
    }
}