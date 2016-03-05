package ayry.com.ary_app;


import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by Stephen J Kearns on 15/02/2016.
 */

public class Tab_Fragment1 extends Fragment {

     /*
          Code referance: http://guides.codepath.com/android/Google-Play-Style-Tabs-using-TabLayout
     */

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //if arguments need to be returned
        int someInt = getArguments().getInt("someInt",1);
        String someTitle = getArguments().getString("someTitle","");

        //what ever you want to do with arguments when returned
    }

    // new Instance constructor for creating fragment with arguments
    public static Tab_Fragment1 newInstance(int page, String title){
        //create new istance of the Tab_fragment1 class
        Tab_Fragment1 tab_fragment1 = new Tab_Fragment1();
        Bundle args = new Bundle();
        args.putInt("someInt", 1);
        args.putString("someTitle", title);
        tab_fragment1.setArguments(args);

        return tab_fragment1;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment2_layout, container, false);

        return view;
    }


}