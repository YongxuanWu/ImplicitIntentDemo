实验内容
---
    1、本实验通过自定义WebView加载URL来验证隐式Intent的使用
    2、实验包含两个应用：
       第一个应用：获取URL地址并启动隐式Intent的调用
       第二个应用：自定义WebView来加载URL
    3、本项目为第一个应用ImplicitIntentDemo——新建一个工程用来获取URL地址并启动Intent，即输入URL网址，点击按钮，将发起浏览网页的行为
关键代码
---
```
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
```
结果截图
---
![image](https://github.com/YongxuanWu/MyBrowser/blob/master/app/src/main/res/pictures/Screenshot_20190504_184809.jpg)
![image](https://github.com/YongxuanWu/MyBrowser/blob/master/app/src/main/res/pictures/Screenshot_20190504_184832.jpg)
