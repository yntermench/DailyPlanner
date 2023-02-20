package com.example.dailyplanner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val state_res:RecyclerView=findViewById((R.id.rec_view1))
        state_res.adapter=State_adapter(this, StateList().list)
        val block_res:RecyclerView=findViewById((R.id.rec_view2))
        block_res.adapter=Block_adapter(this, BlockList().list)
    }
}