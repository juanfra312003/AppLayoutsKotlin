package com.example.taller_uno

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.taller_uno.databinding.ActivityMainBinding
import com.example.taller_uno.databinding.ActivityTicTacToeBinding

class TicTacToeActivity : AppCompatActivity() {
    private lateinit var binding : ActivityTicTacToeBinding

    var player = 1
    var board = charArrayOf('-', '-', '-', '-', '-','-','-','-','-')

    fun checkWinner (): Int {
        when {
            //Check the vertical ways to win
            board[0] == board[3] && board[3] == board[6] && board[6] != '-' -> {
                return 1
            }
            board[1] == board[4] && board[4] == board[7] && board[7] != '-'->{
                return 2
            }
            board[2] == board[5] && board[5] == board[8] && board[8] != '-'->{
                return 3
            }
            //Check the horizontal ways to win
            board[0] == board[1] && board[1] == board[2] && board[2] != '-'->{
                return 4
            }
            board[3] == board[4] && board[4] == board[5] && board[5] != '-'->{
                return 5
            }
            board[6] == board[7] && board[7] == board[8] && board[8] != '-'->{
                return 6
            }
            //Check the diagonal ways to win
            board[0] == board[4] && board[4] == board[8] && board[8] != '-'->{
                return 7
            }
            board[2] == board[4] && board[4] == board[6] && board[6] != '-'->{
                return 8
            }
            else -> {
                return 0
            }
        }
        return 0
    }

    fun changeColorButtons(number: Int) {
        when (number) {
            1 -> {
                binding.b1.setBackgroundColor(Color.RED)
                binding.b4.setBackgroundColor(Color.RED)
                binding.b7.setBackgroundColor(Color.RED)
            }
            2 -> {
                binding.b2.setBackgroundColor(Color.RED)
                binding.b5.setBackgroundColor(Color.RED)
                binding.b8.setBackgroundColor(Color.RED)
            }
            3 -> {
                binding.b3.setBackgroundColor(Color.RED)
                binding.b6.setBackgroundColor(Color.RED)
                binding.b9.setBackgroundColor(Color.RED)
            }
            4 -> {
                binding.b1.setBackgroundColor(Color.RED)
                binding.b2.setBackgroundColor(Color.RED)
                binding.b3.setBackgroundColor(Color.RED)
            }
            5 -> {
                binding.b4.setBackgroundColor(Color.RED)
                binding.b5.setBackgroundColor(Color.RED)
                binding.b6.setBackgroundColor(Color.RED)
            }
            6 -> {
                binding.b7.setBackgroundColor(Color.RED)
                binding.b8.setBackgroundColor(Color.RED)
                binding.b9.setBackgroundColor(Color.RED)
            }
            7 -> {
                binding.b1.setBackgroundColor(Color.RED)
                binding.b5.setBackgroundColor(Color.RED)
                binding.b9.setBackgroundColor(Color.RED)
            }
            8 -> {
                binding.b3.setBackgroundColor(Color.RED)
                binding.b5.setBackgroundColor(Color.RED)
                binding.b7.setBackgroundColor(Color.RED)
            }
        }
    }


    fun changesByClick (positionOnArray : Int) : Int {
        if (board[positionOnArray] == '-') {
            if (player == 1) {
                board[positionOnArray] = 'X'

                //See if with the movement, the player wins
                val number = checkWinner()

                //Make changes of style if the player wins
                if (number != 0) {
                    //Win text
                    binding.textWinner.text = "Player One (X) wins!!!"

                    // Do the changes of the color if the player wins and fill the board for not be available for more movements
                    changeColorButtons(number)
                    board.fill('F')
                }

                //Change the turn
                player = 2

                //Return that the player number one was who made the move and it has to be registered
                return 1
            } else {
                board[positionOnArray] = 'O'


                //See if with the movement, the player wins
                val number = checkWinner()

                //Make changes of style if the player wins
                if (number != 0) {
                    //Win text
                    binding.textWinner.text = "Player Two (O) wins!!!"

                    // Do the changes of the color if the player wins and fill the board for not be available for more movements
                    changeColorButtons(number)
                    board.fill('F')
                }

                //Change the turn
                player = 1

                //Return that the player number two was who made the move and it has to be registered
                return 2
            }
        }
        return 0
    }

    fun resetButtons (){
        //Quit the text of the buttons
        binding.b1.text = " "
        binding.b2.text = " "
        binding.b3.text = " "
        binding.b4.text = " "
        binding.b5.text = " "
        binding.b6.text = " "
        binding.b7.text = " "
        binding.b8.text = " "
        binding.b9.text = " "

        //Reset the color to the buttons
        binding.b1.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b2.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b3.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b4.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b5.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b6.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b7.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b8.setBackgroundColor(Color.parseColor("#FF06125E"))
        binding.b9.setBackgroundColor(Color.parseColor("#FF06125E"))

        //Reset the board of the game
        board.fill('-')

        binding.textWinner.text = ""
    }

    private fun putMovementInBoard(numberReturnPlayerMove : Int, buttonChange : Int){
        when (buttonChange) {
            0 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b1.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b1.text = "O"
            }
            1 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b2.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b2.text = "O"
            }
            2 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b3.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b3.text = "O"
            }
            3 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b4.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b4.text = "O"
            }
            4 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b5.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b5.text = "O"
            }
            5 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b6.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b6.text = "O"
            }
            6 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b7.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b7.text = "O"
            }
            7 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b8.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b8.text = "O"
            }
            8 -> {
                if (numberReturnPlayerMove == 1)
                    binding.b9.text = "X"
                else if (numberReturnPlayerMove == 2)
                    binding.b9.text = "O"
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTicTacToeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.b1.setOnClickListener { putMovementInBoard(changesByClick(0),0)}
        binding.b2.setOnClickListener{putMovementInBoard(changesByClick(1),1)}
        binding.b3.setOnClickListener{putMovementInBoard(changesByClick(2),2)}
        binding.b4.setOnClickListener{putMovementInBoard(changesByClick(3),3)}
        binding.b5.setOnClickListener{putMovementInBoard(changesByClick(4),4)}
        binding.b6.setOnClickListener{putMovementInBoard(changesByClick(5),5)}
        binding.b7.setOnClickListener{putMovementInBoard(changesByClick(6),6)}
        binding.b8.setOnClickListener{putMovementInBoard(changesByClick(7),7)}
        binding.b9.setOnClickListener{putMovementInBoard(changesByClick(8),8)}
        binding.textPlayAgain.setOnClickListener {resetButtons()}
    }
}