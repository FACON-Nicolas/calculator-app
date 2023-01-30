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

    fun setOp(op: Char) {
        if (this.op != ' ' && text.text != "") {
            compute(text.text.toString().toInt())
        }
        this.op = op
        if (text.text != "") number = text.text.toString().toInt()
        text.text = ""
    }

    fun compute(num: Int) {
        var value = 0
        try {
            value = when (op) {
                '+' -> number + num
                '-' -> number - num
                '/' -> number / num
                '*' -> number * num
                else -> 0
            }
            text.text = value.toString()
            op = ' '
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

}
