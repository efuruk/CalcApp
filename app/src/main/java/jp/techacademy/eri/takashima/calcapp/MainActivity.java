package jp.techacademy.eri.takashima.calcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.view.ViewGroup;


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
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();

                if (editText1.getText().length()==0) {
                    editText1.setError("数値をお願いします");
                } else if (editText2.getText().length()==0) {
                    editText2.setError("数値をお願いします");
                } else {
                    Double A = Double.parseDouble(VALUE1);
                    Double B = Double.parseDouble(VALUE2);
                    Double result = A + B;
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VALUEC", result);
                    startActivity(intent);
                }
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();

                if (editText1.getText().length()==0) {
                    editText1.setError("数値をお願いします");
                } else if(editText2.getText().length() == 0) {
                    editText2.setError("数値をお願いします");
                } else {
                    Double A = Double.parseDouble(VALUE1);
                    Double B = Double.parseDouble(VALUE2);
                    Double result = A-B;
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VALUEC", result);
                    startActivity(intent);
                }
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();

                if(editText1.getText().length()==0) {
                    editText1.setError("数値をお願いします");
                } else if(editText2.getText().length()==0) {
                    editText2.setError("数値をお願いします");
                } else {
                    Double A = Double.parseDouble(VALUE1);
                    Double B = Double.parseDouble(VALUE2);
                    Double result = A * B;
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VALUEC", result);
                    startActivity(intent);
                }
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v){
                EditText editText1 = (EditText) findViewById(R.id.editText1);
                editText1.setInputType(InputType.TYPE_CLASS_NUMBER);
                EditText editText2 = (EditText) findViewById(R.id.editText2);
                editText2.setInputType(InputType.TYPE_CLASS_NUMBER);
                String VALUE1 = editText1.getText().toString();
                String VALUE2 = editText2.getText().toString();

                if(editText1.getText().length()==0) {
                    editText1.setError("数値をお願いします");
                } else if(editText2.getText().length()==0) {
                    editText2.setError("数値をお願いします");
                } else {
                    Double A = Double.parseDouble(VALUE1);
                    Double B = Double.parseDouble(VALUE2);
                    Double result = A/B;
                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("VALUEC", result);
                    startActivity(intent);
                }
            }
        });
    }
}

