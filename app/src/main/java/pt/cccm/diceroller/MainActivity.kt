package pt.cccm.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import pt.cccm.diceroller.databinding.ActivityMainBinding
import kotlin.random.Random
import java.util.*
import java.util.Random as JavaUtilRandom


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val rollButton = binding.rollButton
        rollButton.setOnClickListener{
            rollDice()        }
    }

    private fun rollDice() {
        val randomInt = Random.nextInt(6) + 1
        val drawableResource= when(randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        val diceImage = binding.diceImage
        diceImage.setImageResource(drawableResource)
    }
}