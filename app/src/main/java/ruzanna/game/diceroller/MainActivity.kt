package ruzanna.game.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        roll.setOnClickListener {
            when(Random.nextInt(1, 7)){
                1 -> imageView.setImageResource(R.drawable.dice1)
                2 -> imageView.setImageResource(R.drawable.dice2)
                3 -> imageView.setImageResource(R.drawable.dice3)
                4 -> imageView.setImageResource(R.drawable.dice4)
                5 -> imageView.setImageResource(R.drawable.dice5)
                6 -> imageView.setImageResource(R.drawable.dice6)
            }
        }
    }
}
