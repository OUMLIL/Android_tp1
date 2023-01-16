package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondFragment : Fragment() {

    private var recyclerView: RecyclerView? = null
    private var my_adapter: CustomAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
       // val cameraIntent = Intent("android.media.action.IMAGE_CAPTURE")
       // startActivity(cameraIntent)

        recyclerView = view.findViewById(R.id.recycler_view)
        recyclerView?.layoutManager = LinearLayoutManager(activity)

        my_adapter = CustomAdapter(arrayOf<String>("str1", "str2", "str3", "str4", "str5"))
        recyclerView?.adapter = my_adapter
    }
}


// add a recycler view to the secondfragment
// create the cell: new layout -> cellule
// creer l'Adapter