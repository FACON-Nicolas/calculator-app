package faconnicolas.project.calcul

import android.annotation.SuppressLint
import android.text.TextUtils.substring
import android.widget.TextView

class Calculator(text: TextView?) {

    private var number: Double = 0.0
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
        number = 0.0
        text.text = ""
    }

    fun setOp(op: Char) {
        if (this.op != ' ' && text.text != "") {
            compute(text.text.toString().toDouble())
        }
        this.op = op
        if (text.text != "") number = text.text.toString().toDouble()
        text.text = ""
    }

    fun compute(num: Double) {
        var value = 0.0
            value = when (op) {
                '+' -> number + num
                '-' -> number - num
                '/' -> {
                    try {
                        number / num
                    } catch (e: Exception) {
                        0.0
                    }
                }
                '*' -> number * num
                else -> text.text.toString().toDouble()
            }
            text.text = value.toString()
            op = ' '
            number = value
    }

    @SuppressLint("SetTextI18n")
    fun addDot() {
        if (text.text.toString().contains('.')) return
        text.text = text.text.toString() + "."
    }

    @SuppressLint("SetTextI18n")
    fun revert() {
        if (text.text.toString()[0] == '-') {
            text.text = substring(text.text.toString(), 1, text.text.length)
        } else text.text = '-' + text.text.toString()
    }

    fun percent() {
        if (number == 0.0 && text.text.isNotEmpty()) number = text.text.toString().toDouble()
        number /= 100
        text.text = number.toString()
    }

}
