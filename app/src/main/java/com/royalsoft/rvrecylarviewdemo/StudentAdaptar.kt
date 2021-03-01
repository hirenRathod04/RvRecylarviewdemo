package com.royalsoft.rvrecylarviewdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StudentAdaptar(
    private var context: Context,
    private var list: ArrayList<StudentModel>
) :
    RecyclerView.Adapter<StudentAdaptar.StudentViewHolder>() {
    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvStudentName = itemView.findViewById<TextView>(R.id.tvStudentName)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {

        return StudentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_studentdetails, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        var studentDetail = list[position]
        holder.tvStudentName.text = studentDetail.studentName
    }
}