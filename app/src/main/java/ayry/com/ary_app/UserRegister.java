package ayry.com.ary_app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ste on 09/03/2016.
 */
public class UserRegister  extends AppCompatActivity implements View.OnClickListener {

    Button regBtn;
    EditText userNameET, userPasswordET, userEmailET, etName;

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_register_layout);

        etName = (EditText) findViewById(R.id.etNameReg);
        userNameET = (EditText) findViewById(R.id.etUserNameReg);
        userEmailET = (EditText) findViewById(R.id.etUserEmailReg);
        userPasswordET = (EditText) findViewById(R.id.userPassword);
        regBtn = (Button) findViewById(R.id.RegBtn);

        regBtn.setOnClickListener(this);
    }

    public void onClick(View v){
        switch(v.getId()){
            case R.id.RegBtn:

                //do on click listner here

                break;

            case R.id.tvLogin:
                Intent intent = new Intent(this,UserLogin.class);
                //Return to login page
                break;
        }
    }

}
