package faconnicolas.project.calcul

import android.widget.TextView

class Calculator {

    var number: Int = 0

    var op: Char = ' '

    public fun addDigit(text: TextView?, digit: Int) {
        text?.text = digit.toString() + text?.text
    }

    public fun reset() {
        op = ' '
        number = 0
    }

}