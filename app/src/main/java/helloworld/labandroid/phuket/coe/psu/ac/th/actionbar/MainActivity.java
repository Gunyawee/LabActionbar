package helloworld.labandroid.phuket.coe.psu.ac.th.actionbar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.NoCopySpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("ACtionBar");
        toolbar.setSubtitle("welcome");


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.profile){

            Toast.makeText(this,"MY PROFILE",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Main6Activity.class));

        }

        else if(id == R.id.search)
        {
            Toast.makeText(this,"CHECK IN",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Main3Activity.class));
        }

        else if(id == R.id.edit)
        {
            Toast.makeText(this,"EDIT CHECKED",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Main4Activity.class));
        }

        else if(id == R.id.delete)
        {
            Toast.makeText(this,"DELETE CHECKED",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, Main5Activity.class));
        }
        else if (id == R.id.home)
        {
            Toast.makeText(this,"VOCAB",Toast.LENGTH_LONG).show();
            startActivity(new Intent(this, BaseActivity.class));
        }


        return super.onOptionsItemSelected(item);
    }
}
