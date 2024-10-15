package com.example.androidbasics.lpu_touch

import android.os.Bundle
import android.view.LayoutInflater
import android.widget.GridLayout
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.androidbasics.R

class LpuTouchHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lpu_touch_home)

        val lpuGrid = findViewById<GridLayout>(R.id.lpu_touch_grid)
        val inflater = LayoutInflater.from(this)

        DepartmentsData.departments.forEach { department: Department ->
            val departmentView = inflater.inflate(R.layout.component_lpu_card, lpuGrid, false) as CardView

            val departmentImg = departmentView.findViewById<ImageView>(R.id.department_img)
            departmentImg.setImageResource(department.deptResId)

            lpuGrid.addView(departmentView)

        }
    }
}