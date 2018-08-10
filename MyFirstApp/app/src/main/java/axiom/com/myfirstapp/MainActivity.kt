package axiom.com.myfirstapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.IntegerRes
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var textView:TextView = findViewById(R.id.tvValueId);
        var btnInc: Button = findViewById(R.id.btnIncrementId);
        var btnDec:Button = findViewById(R.id.btnDecrementId);
        var btnReset:Button = findViewById(R.id.btnResetId);

        btnInc.setOnClickListener({
            var value:String = textView.text.toString()
            var intValue:Int = value.toInt()+1
            Log.e("value",":::" + intValue)
            textView.setText(intValue.toString())
        })

        btnDec.setOnClickListener({
            var value:String = textView.text.toString()
            if(value.toInt()==0){
                Toast.makeText(applicationContext,"Value can't be lesser than 0",Toast.LENGTH_LONG).show();
            }
            else{
                var intValue:Int = value.toInt()-1
                textView.setText(intValue.toString())
            }
        })
        btnReset.setOnClickListener({
            textView.setText("0")
        })
    }
}
