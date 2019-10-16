package com.cookandroid.project4_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnMod;
    TextView textResult;
    String num1, num2;
    //Integer result;
    Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기(수정)");//제목 표시줄 변경

        edit1=(EditText)findViewById(R.id.Edit1);
        edit2=(EditText)findViewById(R.id.Edit2);
        btnAdd=(Button)findViewById(R.id.BtnAdd);
        btnSub=(Button)findViewById(R.id.BtnSub);
        btnMul=(Button)findViewById(R.id.BtnMul);
        btnDiv=(Button)findViewById(R.id.BtnDiv);
        btnMod=(Button)findViewById(R.id.BtnMod);
        textResult=(TextView)findViewById(R.id.Text_Result);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(TextUtils.isEmpty(num1)||TextUtils.isEmpty(num2)){
                    Toast.makeText(getApplicationContext(),"값을 입력하지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) + Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(TextUtils.isEmpty(num1)||TextUtils.isEmpty(num2)){
                    Toast.makeText(getApplicationContext(),"값을 입력하지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) - Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(TextUtils.isEmpty(num1)||TextUtils.isEmpty(num2)){
                    Toast.makeText(getApplicationContext(),"값을 입력하지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) * Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(TextUtils.isEmpty(num1)||TextUtils.isEmpty(num2)){
                    Toast.makeText(getApplicationContext(),"값을 입력하지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else if(edit2.getText().toString().equals("0")){
                    Toast.makeText(getApplicationContext(),"0으로 나눌 수 없습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) / Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnMod.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                if(TextUtils.isEmpty(num1)||TextUtils.isEmpty(num2)){
                    Toast.makeText(getApplicationContext(),"값을 입력하지 않았습니다.",Toast.LENGTH_SHORT).show();
                }
                else {
                    result = Double.parseDouble(num1) % Double.parseDouble(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        /* -- touch로 만듦
        btnAdd.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)+Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });

        btnSub.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)-Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });

        btnMul.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)*Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });

        btnDiv.setOnTouchListener(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                num1=edit1.getText().toString();
                num2=edit2.getText().toString();
                result=Integer.parseInt(num1)/Integer.parseInt(num2);
                textResult.setText("계산 결과 : "+result.toString());
                return false;
            }
        });
        */
    }
}
