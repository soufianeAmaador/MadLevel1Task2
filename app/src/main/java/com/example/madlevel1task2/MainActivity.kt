package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submit.setOnClickListener { checkAnswer() }
    }

    private fun checkAnswer(){
        val answerTrue = "t";
        val answerFalse = "f";
        if (PT1.text.toString() == answerTrue && PT2.text.toString() == answerFalse &&
            PT3.text.toString() == answerFalse && PT4.text.toString() == answerFalse){
            Toast.makeText(this,R.string.correct,Toast.LENGTH_LONG).show()
        }else
            Toast.makeText(this,R.string.incorrect,Toast.LENGTH_LONG).show()
    }
}