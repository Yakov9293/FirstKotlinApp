package com.example.firstkotlinapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction()

        val listOfTasks = supportFragmentManager.findFragmentByTag("LIST_OF_TASK") as? ListOfTasks
            ?: ListOfTasks()

        transaction.replace(R.id.frame_content, listOfTasks, "LIST_OF_TASK")
        transaction.addToBackStack(null)
        transaction.commit()

    }


}
