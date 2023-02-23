package com.example.suspendfunction

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val TagsName:String="kotlin"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        CoroutineScope(Dispatchers.IO).launch {
            task1()
        }
        CoroutineScope(Dispatchers.IO).launch {
            task2()
        }
    }
    private suspend fun task1(){
        Log.d(TagsName,"Starting task 1")
        delay(1500)
        Log.d(TagsName,"Ending tak 1")
    }
    private suspend fun task2(){
        Log.d(TagsName,"Starting task 2")
        delay(3000)
        Log.d(TagsName,"Ending tak 2")
    }
}