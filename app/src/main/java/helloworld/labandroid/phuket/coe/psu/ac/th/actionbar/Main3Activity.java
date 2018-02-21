
package helloworld.labandroid.phuket.coe.psu.ac.th.actionbar;

        import android.content.Intent;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Switch;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button Submit = (Button) findViewById(R.id.submit);
        Submit.setOnClickListener(this);

    }

    public void onClick(View v) {
        //get string
        EditText EditName = (EditText) findViewById(R.id.name);
        EditText EditID = (EditText) findViewById(R.id.ID);
        EditText Editemail = (EditText) findViewById(R.id.email);
        String Name = EditName.getText().toString();
        String ID = EditID.getText().toString();
        String Email = Editemail.getText().toString();

        //set to View anther page

        switch(v.getId()) {
            case R.id.submit:

                Intent in = new Intent(this, Main2Activity.class);
                in.putExtra("Name", "" + Name + "");
                in.putExtra("ID", "" + ID + "");
                in.putExtra("Email", "" + Email + "");
                startActivity(in);
                break;
            default:
                break;

        }
    }
}


