package com.mdev.secretmessage

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.findNavController

class MessageFragment : Fragment() {

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_message, container, false)
        val next = view.findViewById<Button>(R.id.next)

        //  Messages
        val message= view.findViewById<EditText>(R.id.message)
        val message2 = view.findViewById<EditText>(R.id.msg2)

        next.setOnClickListener {
            val message = message.text.toString()
            val message2 = message2.text.toString()

            // Pass both the values to Next Fragment. (EncryptFragment)
            val action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message, message2)
            view.findNavController().navigate(action)

            // view.findNavController().navigate(R.id.action_messageFragment_to_encryptFragment)
        }

        return view
    }
}