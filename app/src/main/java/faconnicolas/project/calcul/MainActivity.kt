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

    private lateinit var calculator: Calculator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        initView()
        assignBehavior()
    }

    private fun initView() {
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
        calculator = Calculator(text)

    }

    private fun assignBehavior() {
        ac?.setOnClickListener { view -> calculator.reset() }
        zero?.setOnClickListener { view -> calculator.addDigit(0) }
        one?.setOnClickListener { view -> calculator.addDigit(1) }
        two?.setOnClickListener { view -> calculator.addDigit(2) }
        three?.setOnClickListener { view -> calculator.addDigit(3) }
        four?.setOnClickListener { view -> calculator.addDigit(4) }
        five?.setOnClickListener { view -> calculator.addDigit(5) }
        six?.setOnClickListener { view -> calculator.addDigit(6) }
        seven?.setOnClickListener { view -> calculator.addDigit(7) }
        eight?.setOnClickListener { view -> calculator.addDigit(8) }
        nine?.setOnClickListener { view -> calculator.addDigit(9) }
        multiply?.setOnClickListener { view -> calculator.setOp('*') }
        divide?.setOnClickListener { view -> calculator.setOp('/') }
        plus?.setOnClickListener { view -> calculator.setOp('+') }
        minus?.setOnClickListener { view -> calculator.setOp('-') }
        equal?.setOnClickListener { view -> calculator.compute(text?.text.toString().toDouble()) }
        virgule?.setOnClickListener { view -> calculator.addDot() }
        revert?.setOnClickListener { view -> calculator.revert() }
        percent?.setOnClickListener { view -> calculator.percent() }
    }
}