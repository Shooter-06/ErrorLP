

package com.example.loginpage;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.TextView;

public class CheesePizza extends AppCompatActivity {

    Button tenAdd, tenMinus, twentyAdd, twentyMinus, thirtyAdd, thirtyMinus;
    Button smallAdd, smallMinus, mediumAdd, mediumMinus, bigAdd, bigMinus, order;

    TextView priceText;
    TextView tenCadCounter, twentyCounter, thirtyCounter;
    TextView smallCounter, mediumCounter, bigCounter;

    int tenCadCount =10;
    int twentyCount =20;
    int thirtyCount =30;

    //toppings prices
    int a=2;
    int b=3;
    int c=5;

    EditText message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheese_pizza);

        //
        tenCadCounter =findViewById(R.id.textView23);
        tenAdd =findViewById(R.id.button2);
        tenMinus =findViewById(R.id.button3);

        twentyCounter= findViewById(R.id.textView25);
        twentyAdd=findViewById(R.id.button);
        twentyMinus=findViewById(R.id.button4);

        thirtyCounter= findViewById(R.id.textView24);
        thirtyAdd=findViewById(R.id.button5);
        thirtyMinus=findViewById(R.id.button6);

        tenAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tenCadCount =tenCadCount+10;
                tenCadCounter.setText(String.valueOf(tenCadCount+"$"));
            }
        });
        tenMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(tenCadCount == 10){
                    tenCadCount =10;
                }else{
                    tenCadCount =tenCadCount-10;
                    tenCadCounter.setText(String.valueOf(tenCadCount +"$"));
                }

            }
        });

        twentyAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                twentyCount= twentyCount+20;
                twentyCounter.setText(String.valueOf(twentyCount+"$"));
            }
        });
        twentyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(twentyCount == 20){
                    twentyCount =20;
                }else{
                    twentyCount=twentyCount+20;
                    twentyCounter.setText(String.valueOf(twentyCount+"$"));
                }
            }
        });

        thirtyAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                thirtyCount=thirtyCount+30;
                thirtyCounter.setText(String.valueOf(thirtyCount+"$"));
            }
        });

        thirtyMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(thirtyCount == 30){

                }else{
                    thirtyCount=thirtyCount-30;
                    thirtyCounter.setText(String.valueOf(thirtyCount+"$"));
                }
            }
        });

        //Toppings values
        smallCounter= findViewById(R.id.textView27);
        smallAdd =findViewById(R.id.button8);
        smallMinus =findViewById(R.id.button7);

        mediumCounter= findViewById(R.id.textView29);
        mediumAdd=findViewById(R.id.button9);
        mediumMinus=findViewById(R.id.button10);

        bigCounter= findViewById(R.id.textView30);
        bigAdd=findViewById(R.id.button11);
        bigMinus=findViewById(R.id.button12);

        smallAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a++;
                smallCounter.setText(String.valueOf(a+"$"));
            }
        });

        smallMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(a == 2){
                    a=2;
                }else{
                    a--;
                    smallCounter.setText(String.valueOf(a+"$"));
                }
            }
        });

        mediumAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b++;
                mediumCounter.setText(String.valueOf(b+"$"));
            }
        });

        mediumMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(b == 3){

                }else{
                    b--;
                    mediumCounter.setText(String.valueOf(b+"$"));
                }
            }
        });

        bigAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                c++;
                bigCounter.setText(String.valueOf(c+"$"));
            }
        });

        bigCounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(c == 5){
                    c=5;
                }else{
                    c--;
                    bigCounter.setText(String.valueOf(c+"$"));
                }
            }
        });

        order =findViewById(R.id.button13);
        order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1 = Integer.parseInt(tenCadCounter.getText().toString());
                int n2 = Integer.parseInt(twentyCounter.getText().toString());
                int n3 = Integer.parseInt(thirtyCounter.getText().toString());
                int n4 = Integer.parseInt(smallCounter.getText().toString());
                int n5 = Integer.parseInt(mediumCounter.getText().toString());
                int n6 = Integer.parseInt(bigCounter.getText().toString());

                int res = n1+n2+n3+n4+n5+n6;

                String total =String.valueOf(res)+"$";

                Intent i= new Intent(getApplicationContext(), LastPage.class);
                i.putExtra("price", total);
                startActivity(i);
            }
        });
    }
}