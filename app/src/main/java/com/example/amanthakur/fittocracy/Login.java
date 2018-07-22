package com.example.amanthakur.fittocracy;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Login extends AppCompatActivity {
    private DatabaseReference mDatabase;
    EditText editText,editText2;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();
        mDatabase = FirebaseDatabase.getInstance().getReference();
        editText = (EditText) findViewById(R.id.editText);
        editText2 = (EditText) findViewById(R.id.editText2);
        textView = (TextView) findViewById(R.id.textView4);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Login.this,Register.class);
                startActivity(intent);
                finish();
            }
        });
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
                String phone = editText.getText().toString().trim();
                final String password = editText2.getText().toString().trim();
                if(phone.equals("")||password.equals("")){
                    //Toast.makeText(Login.this,"FILL USERNAME & PASSWORD",Toast.LENGTH_LONG).show();
                    Snackbar snackbar = Snackbar.make(view,"FILL USERNAME & PASSWORD",Snackbar.LENGTH_LONG);
                    View sbView = snackbar.getView();
                    sbView.setBackgroundColor(Color.BLACK);
                    TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                    textView.setTextColor(Color.WHITE);
                    snackbar.show();

                }
                else{
                    mDatabase = FirebaseDatabase.getInstance().getReference("users/"+phone+"/pass");
                    mDatabase.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                         String pass =    dataSnapshot.getValue().toString().trim();
                            if(password.equals(pass)){
                                Intent intent = new Intent(Login.this,MainActivity.class);
                                startActivity(intent);
                                finish();
                            }
                            else
                            {
                                //Toast.makeText(Login.this,"INVALID USERNAME/PASSWORD",Toast.LENGTH_LONG).show();
                                Snackbar snackbar = Snackbar.make(view,"Invalid Username OR Password",Snackbar.LENGTH_LONG);
                                View sbView = snackbar.getView();
                                sbView.setBackgroundColor(Color.BLACK);
                                TextView textView = (TextView) sbView.findViewById(android.support.design.R.id.snackbar_text);
                                textView.setTextColor(Color.WHITE);
                                snackbar.show();
                            }

                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {
                            Toast.makeText(Login.this,databaseError.toString(),Toast.LENGTH_LONG).show();
                        }
                    });
                }
            }
        });



    }
}
