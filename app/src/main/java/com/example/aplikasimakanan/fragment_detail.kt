package com.example.aplikasimakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.aplikasimakanan.databinding.FragmentDetailBinding
import com.example.aplikasimakanan.databinding.FragmentUserBinding


class fragment_detail : Fragment() {
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(layoutInflater,container,false)
        binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTmbh.setOnClickListener {
            Toast.makeText(context,"berhasil ditambahkan",Toast.LENGTH_SHORT).show()
            this.findNavController()
                .navigate(R.id.action_fragment_detail_to_fragment_pesanan)
        }
    }
}