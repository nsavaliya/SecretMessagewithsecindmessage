package com.mdev.secretmessage

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class SecondEncryptFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second_encrypt, container, false)
        val msg2 = SecondEncryptFragmentArgs.fromBundle(requireArguments()).secondMessage

        // Printing second Message.
        val secondEncryptedView = view.findViewById<TextView>(R.id.second_encrypted_message)
        secondEncryptedView.text = msg2.reversed()

        return view
    }

}