package ayry.com.ary_app;


import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by Stephen J Kearns on 15/02/2016.
 */

public class ShopsList_Fragment extends Fragment {

     /*
          Code referance: http://guides.codepath.com/android/Google-Play-Style-Tabs-using-TabLayout
     */

    Context context = getActivity();

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        //if arguments need to be returned
        int someInt = getArguments().getInt("someInt",1);
        String someTitle = getArguments().getString("someTitle","");

        //what ever you want to do with arguments when returned....


       // populateList();


    }

    // new Instance constructor for creating fragment with arguments
    public static ShopsList_Fragment newInstance(int page, String title){
        //create new istance of the Tab_fragment1 class
        ShopsList_Fragment shopsList_fragment = new ShopsList_Fragment();
        Bundle args = new Bundle();
        args.putInt("someInt", 1);
        args.putString("someTitle", title);
        shopsList_fragment.setArguments(args);



        return shopsList_fragment;
    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        View view = inflater.inflate(R.layout.shoplist_layout, container, false);

        //Create the data source and inflate the populated list view
        ArrayList<Shop_items> listOfSops = Shop_items.getShopItems();

        //Create the adapter to convert array to view
        ShoplistAdapter adapter = new ShoplistAdapter(getActivity(),listOfSops);

        ListView listView = (ListView) view.findViewById(R.id.shoplist);
        listView.setAdapter(adapter);
        return view;
    }


   /* public void populateList(){
        //Create the data source and inflate the populated list view
        ArrayList<Shop_items> listOfSops = new ArrayList<Shop_items>();

        //Create the adapter to convert array to view
        ShoplistAdapter adapter = new ShoplistAdapter(getActivity(),listOfSops);

        ListView listView = (ListView) view.findViewById(R.id.shoplist);
        listView.setAdapter(adapter);
    } */

}