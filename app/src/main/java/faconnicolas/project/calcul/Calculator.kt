package faconnicolas.project.calcul

import android.annotation.SuppressLint
import android.widget.TextView

class Calculator {

    var number: Int = 0

    var op: Char = ' '

    @SuppressLint("SetTextI18n")
    public fun addDigit(text: TextView?, digit: Int) {
        text?.let {
            text.text = text.text.toString() + digit.toString()
        }
    }

    public fun reset() {
        op = ' '
        number = 0
    }

}
