package ayry.com.ary_app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by ste on 09/03/2016.
 */
public class DetailsUserStoreLocal {

    public static final String SP_NAME = "UserAccountDetails";
    SharedPreferences userLocalDB;

    public DetailsUserStoreLocal(Context context){
        userLocalDB = context.getSharedPreferences(SP_NAME,0);
    }

    public void storeUserDetails(User user){
        SharedPreferences.Editor spEditor = userLocalDB.edit();
        spEditor.putString("userName", user.userName);
        spEditor.putString("name", user.name);
        spEditor.putString("email" user.email);
        spEditor.putString("password" user.password);
    }


}

