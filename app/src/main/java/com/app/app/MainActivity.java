package com.app.app;






import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private TextView mTextViewResult;
    private Button mButtonAdd;
    private TextView mTextView2;
    private Button mButtonSub;
    private Button mButton4;
    private Button mButton3;
    private TextView mTextView4;
    private TextView mTextView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mEditText1 = findViewById(R.id.edittext_number_1);
        mEditText2 = findViewById(R.id.edittext_number_2);
        mTextViewResult = findViewById(R.id.textview_result);
        mButtonAdd = findViewById(R.id.button_Add);
        mTextView2 = findViewById(R.id.textView2);
        mButtonSub = findViewById(R.id.button_Sub);
        mButton4 = findViewById(R.id.Button4);
        mTextView4 = findViewById(R.id.TextView4);
        mButton3 = findViewById(R.id.Button3);
        mTextView3 = findViewById(R.id.TextView3);
        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }


                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());

                int sum = num1 + num2;

                mTextViewResult.setText(String.valueOf(sum));
            }

        });
        mButtonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }


                int num3 = Integer.parseInt(mEditText1.getText().toString());
                int num4 = Integer.parseInt(mEditText2.getText().toString());

                int sub = num3 - num4;

                mTextView2.setText(String.valueOf(sub));

            }
        });
        mButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }


                int num7 = Integer.parseInt(mEditText1.getText().toString());
                int num8 = Integer.parseInt(mEditText2.getText().toString());

                int mun = num7 * num8;

                mTextView4.setText(String.valueOf(mun));

            }
        });


            }

    public void div(View view) {
        if (mEditText1.getText().toString().length() == 0) {
            mEditText1.setText("0");
        }

        if (mEditText2.getText().toString().length() == 0) {
            mEditText2.setText("0");
        }
        if (mEditText2.getText().toString().equals("0")) {
            Toast.makeText(MainActivity.this, "who is your maths teacher", Toast.LENGTH_SHORT).show();
            mTextView3.setText(String.valueOf("error"));
        } else {
            int num9 = Integer.parseInt(mEditText1.getText().toString());
            int num10 = Integer.parseInt(mEditText2.getText().toString());

            int mu = num9 / num10;

            mTextView3.setText(String.valueOf(mu));}
}
}
