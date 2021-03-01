package com.royalsoft.rvrecylarviewdemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
   private var context = this@MainActivity
   private var list: ArrayList<StudentModel> = ArrayList()
   // private lateinit var context: Context

  //private lateinit var list: ArrayList<StudentModel>
private lateinit var recyclerView: RecyclerView
    private lateinit var studentAdaptar: StudentAdaptar
    private  var xx:Int=10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Name ="Hiren"


        for (I in 0 until xx){
            var obj = StudentModel()
            obj.studentName = "$Name ${I.toString()}"
            list.add(obj)

        }
        recyclerView = findViewById(R.id.rv)
        recyclerView.layoutManager =LinearLayoutManager(context,RecyclerView.VERTICAL,false)
        studentAdaptar = StudentAdaptar(context,list)
        recyclerView.adapter = studentAdaptar


    }
}