package faconnicolas.project.calcul

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var ac: Button? = null;
    private var zero: Button? = null;
    private var one: Button? = null;
    private var two: Button? = null;
    private var three: Button? = null;
    private var four: Button? = null;
    private var five: Button? = null;
    private var six: Button? = null;
    private var seven: Button? = null;
    private var eight: Button? = null;
    private var nine: Button? = null;
    private var revert: Button? = null;
    private var percent: Button? = null;
    private var divide: Button? = null;
    private var multiply: Button? = null;
    private var minus: Button? = null;
    private var virgule: Button? = null;
    private var equal: Button? = null;
    private var plus: Button? = null;

    private var text: TextView? = null;

    private var op: Char = ' '
    private var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        initView()
    }

    public fun initView() {
        ac = findViewById(R.id.AC)
        zero = findViewById(R.id.zero)
        one = findViewById(R.id.one)
        two = findViewById(R.id.two)
        three = findViewById(R.id.three)
        four = findViewById(R.id.four)
        five = findViewById(R.id.five)
        six = findViewById(R.id.six)
        seven = findViewById(R.id.seven)
        eight = findViewById(R.id.eight)
        nine = findViewById(R.id.nine)
        revert = findViewById(R.id.revert)
        percent = findViewById(R.id.percent)
        divide = findViewById(R.id.divide)
        multiply = findViewById(R.id.multiply)
        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        equal = findViewById(R.id.equal)
        virgule = findViewById(R.id.virgule)
        ac = findViewById(R.id.AC)

        text = findViewById(R.id.text)
    }

    public fun assignBehavior() {

    }

    public fun addDigit(digit: Int) {
        text?.text = digit.toString() + text?.text
    }

    public fun chooseOperator(myOperator: Char) {

    }


}