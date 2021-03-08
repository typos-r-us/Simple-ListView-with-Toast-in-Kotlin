package com.kennethmwenda.listview1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //
        val listView = findViewById<ListView>(R.id.lv_ListView1)
        val names = arrayOf("Thomas Mulei","Samuel Ng'ang'a","Lillian Waithera","Rebbecca Mwende",
            "Salome Rabera","Michael Muiru","Benson Gitahi", "Stella Anyango","Moses Wanjigi","Sabbah Abdul",
            "Tom Wellens","Martha Kaur","Kimani Waithaka","Mercy Njeru","Anthony Mate","Steven Smart","Amolo Dada","Sharon Muniu","Jaqueline Njeri","Joyce Msichana",
            "Mathieu Mutiso","Kinoti Kibaara")
        // Create an adapter
        // val  arrayAdapter:ArrayAdapter<String> = ArrayAdapter(context = this,resource = android.R.layout.simple_list_item_1,textViewResourceId = names)
        val  arrayAdapter:ArrayAdapter<String> = ArrayAdapter(this,android.R.layout.simple_list_item_1,names)
        listView.adapter = arrayAdapter
        // set on item click listener
        listView.setOnItemClickListener{ _: AdapterView<*>?, _: View?, position: Int, _: Long ->
            Toast.makeText(this, "Person Selected: "+names[position],Toast.LENGTH_LONG).show()
        }
    }
}