package com.example.androidbasics.lpu_touch

import com.example.androidbasics.R

object DepartmentsData {
    val departments = listOf(
        Department("CSE", R.drawable.lpu_cse_logo),
        Department("ECE", R.drawable.lpu_ece_logo),
        Department("EEE", R.drawable.lpu_cse_logo),
        Department("CIVIL", R.drawable.lpu_cse_logo),
        Department("CIVIL", R.drawable.lpu_cse_logo),
        Department("CIVIL", R.drawable.lpu_cse_logo),
        Department("CIVIL", R.drawable.lpu_cse_logo),
        Department("CIVIL", R.drawable.lpu_cse_logo),
        Department("CIVIL", R.drawable.lpu_cse_logo),
    )
}

data class Department (
    val departmentName: String,
    val deptResId: Int,
)