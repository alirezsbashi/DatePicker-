package arb.test.datepicker

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn.setOnClickListener {
            Toast.makeText(this,"${datePicker.year} / ${datePicker.month} / ${datePicker.dayOfMonth}",Toast.LENGTH_LONG).show()
            tv.text = "${datePicker.year} / ${datePicker.month} / ${datePicker.dayOfMonth}"
        }
    }
}
