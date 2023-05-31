package com.example.aplikasimakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.aplikasimakanan.databinding.FragmentUserBinding

class fragmentpesanan : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_pesanan, container, false)
        val button = view.findViewById<Button>(R.id.btn_byr)
        button.setOnClickListener {
            Toast.makeText(context,"berhasil dibayar",Toast.LENGTH_SHORT).show()
        }
        // Inflate the layout for this fragment
        return view
    }
}