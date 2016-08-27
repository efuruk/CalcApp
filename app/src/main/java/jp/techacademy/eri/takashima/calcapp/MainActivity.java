package jp.techacademy.eri.takashima.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View.OnClickListener;


public class MainActivity extends AppCompatActivity {

    TextView mTextView;
    EditText mEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);

                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();
                Double A = Double.parseDouble(VALUE1);
                Double B = Double.parseDouble(VALUE2);
                Double C = A + B;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("VALUEC", C);
                startActivity(intent);
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);

                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();
                Double A = Double.parseDouble(VALUE1);
                Double B = Double.parseDouble(VALUE2);
                Double C = A - B;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("VALUEC", C);
                startActivity(intent);
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);

                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();
                Double A = Double.parseDouble(VALUE1);
                Double B = Double.parseDouble(VALUE2);
                Double C = A*B;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("VALUEC", C);
                startActivity(intent);
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                EditText editText2 = (EditText) findViewById(R.id.editText2);

                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();
                Double A = Double.parseDouble(VALUE1);
                Double B = Double.parseDouble(VALUE2);
                Double C = A/B;
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("VALUEC", C);
                startActivity(intent);
            }
        });
    }
}
