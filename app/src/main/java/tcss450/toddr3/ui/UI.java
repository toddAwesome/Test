package tcss450.toddr3.ui;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class UI extends ActionBarActivity {
    private EditText messageEdit;
    public final static String MESG = "\"message";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui);
        String message = getIntent().getStringExtra(UI.MESG);
       // messageEdit = (EditText) findViewById(R.id.edit_message);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_ui, menu);
        return true;
    }
    //connected to the send messag button
    public void sendMessage(View v){
        String mesg = messageEdit.getText().toString();
        Toast.makeText(this, mesg, Toast.LENGTH_SHORT);
          //  .show();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(MESG, mesg);
        startActivity();
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
