package com.example.aplikasimakanan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.example.aplikasimakanan.databinding.FragmentUserBinding

class fragmentuser : Fragment() {
    private lateinit var binding: FragmentUserBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUserBinding.inflate(layoutInflater,container,false)
        val view = inflater.inflate(R.layout.fragment_user, container, false)
        val button = view.findViewById<Button>(R.id.btn_logout)
        button.setOnClickListener {
            Toast.makeText(context,"anda telah berhasi logout",Toast.LENGTH_SHORT).show()
        }
        // Inflate the layout for this fragment
        return view
    }

}