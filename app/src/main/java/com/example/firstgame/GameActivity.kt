package com.example.firstgame

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class GameActivity : AppCompatActivity(), View.OnClickListener {
    //инициализация обьектов под вывод и переменных
    private var correctAnswer: Int = 0
    private lateinit var textPartA: TextView
    private lateinit var textPartB: TextView
    private lateinit var btnChoice1: Button
    private lateinit var btnChoice2: Button
    private lateinit var btnChoice3: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        //определим текстовые поля
        textPartA = findViewById(R.id.textView_left)
        textPartB = findViewById(R.id.textView_right)

        //определим кнопки и назначим ивент листенеры
        btnChoice1 = findViewById(R.id.button_1)
        btnChoice1.setOnClickListener(this)

        btnChoice2 = findViewById(R.id.button_2)
        btnChoice2.setOnClickListener(this)

        btnChoice3 = findViewById(R.id.button_3)
        btnChoice3.setOnClickListener(this)

        //инициализация переменных
        val partA = 9
        val partB = 9

        correctAnswer = partA * partB

        val incorrectAnswer1: Int = correctAnswer + 2
        val incorrectAnswer2: Int = correctAnswer - 3



        //заполним интерфейс
        textPartA.text = partA.toString()
        textPartB.text = partB.toString()

        btnChoice1.text = correctAnswer.toString()
        btnChoice2.text = incorrectAnswer1.toString()
        btnChoice3.text = incorrectAnswer2.toString()


    }
    override fun onClick(v: View) {
        //на основе id проверим результаты
        when(v.id) {
            R.id.button_1 -> {
                val answer = btnChoice1.text.toString().toInt()
                if(answer == correctAnswer){
                    toast("Правильно!")
                }
                else{
                    toast("Неверно.")
                }
            }

            R.id.button_2 -> {
                val answer = btnChoice2.text.toString().toInt()
                if(answer == correctAnswer){
                    toast("Правильно!")
                }
                else{
                    toast("Неверно.")
                }

            }

            R.id.button_3 -> {
                val answer = btnChoice3.text.toString().toInt()
                if(answer == correctAnswer){
                    toast("Правильно!")
                }
                else{
                    toast("Неверно.")
                }

            }
        }
    }

    private fun Context.toast(message: CharSequence) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}


