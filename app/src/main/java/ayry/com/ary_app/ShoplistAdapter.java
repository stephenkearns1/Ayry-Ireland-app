package ayry.com.ary_app;

import android.content.Context;
import android.text.Layout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Stephen Kearns on 05/03/2016.
 */
public class ShoplistAdapter extends ArrayAdapter<Shop_items> {
    private static String TAG = "checkVariable";
    public ShoplistAdapter(Context context, ArrayList<Shop_items> shops){
        super(context,0,shops);
    }

    public View getView(int postion, View conView, ViewGroup parent){
         //retrive the data from the array of shops
        Shop_items shop = getItem(postion);

        Log.i(TAG, "Shop" + shop.getTitle() + shop.getDesc());


        //check if an existing view is being used if not infalte if not
       /* if(conView == null){
            conView = LayoutInflater.from(getContext()).inflate(R.layout.shoplist_row, parent);
        }*/

        conView = LayoutInflater.from(getContext()).inflate(R.layout.shoplist_row, parent, false);

        //assign views to populate data with to holding variables
        TextView shopTitle = (TextView) conView.findViewById(R.id.shop_title);
        TextView shopDesc = (TextView) conView.findViewById(R.id.shop_description);

        //Set the views with the shop data
        shopTitle.setText(shop.getTitle());
        shopDesc.setText(shop.getDesc());

        return conView;
    }
}
