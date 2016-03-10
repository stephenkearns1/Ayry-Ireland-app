package ayry.com.ary_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Stephen Kearns on 09/03/2016.
 */
public class UserLogin extends AppCompatActivity implements View.OnClickListener {

    Button LoginBtn;
    EditText userNameET, userPasswordET;

    public void onCreate(Bundle  savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        userNameET = (EditText) findViewById(R.id.userName);
        userPasswordET = (EditText) findViewById(R.id.userPassword);
        LoginBtn = (Button) findViewById(R.id.loginBtn);

        LoginBtn.setOnClickListener(this);
    }

    public void onClick(View v){
         switch(v.getId()){
             case R.id.loginBtn:

                 //do on click listner here

                 break;
             case R.id.tvRegister:
                 //starts the register activity
                 Intent intent = new Intent(this,UserRegister.class);
                 break;
         }
    }

}
