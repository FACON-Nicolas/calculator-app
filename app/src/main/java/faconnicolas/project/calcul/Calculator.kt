package faconnicolas.project.calcul

import android.annotation.SuppressLint
import android.widget.TextView

class Calculator(text: TextView?) {

    private var number: Int = 0
    private lateinit var text: TextView;
    private var op: Char = ' '

    init {
        text?.let {
            this.text = text
        }
    }

    @SuppressLint("SetTextI18n")
    fun addDigit(digit: Int) {
        text.text = text.text.toString() + digit.toString()
    }

    fun reset() {
        op = ' '
        number = 0
        text.text = ""
    }

}
