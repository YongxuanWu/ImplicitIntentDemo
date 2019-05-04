package com.example.tree.implicitintentdemo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn=findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText edtxt=findViewById(R.id.edt);
                Intent intent=new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                String data=edtxt.getText().toString();
                Uri uri= Uri.parse(data);
                intent.setData(uri);

                if(intent.resolveActivity(getPackageManager())!=null){
                    startActivity(intent);
                }



            }
        });
    }
}
