package helloworld.labandroid.phuket.coe.psu.ac.th.actionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Intent in = getIntent();
        String Name = in.getStringExtra("Name");
        TextView nameView = (TextView) findViewById(R.id.nameView);
        nameView.setText(Name);

        String ID = in.getStringExtra("ID");
        TextView IDView = (TextView) findViewById(R.id.IDView);
        IDView.setText(ID);

        String Email = in.getStringExtra("Email");
        TextView  emailView = (TextView) findViewById(R.id.emailView);
        emailView.setText(Email);

    }
}