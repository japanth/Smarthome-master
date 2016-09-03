package com.smart.smarthome;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Created by Korn on 9/3/2016.
 */
public class ProductCompareDataAdapter extends BaseAdapter {
    ArrayList<ProductCompare> productCompares = new ArrayList<ProductCompare>();
    Context context;
    public ProductCompareDataAdapter(Context context, ArrayList<ProductCompare> productCompares){
        this.context = context;
        this.productCompares = productCompares;
    }

    public int getCount(){
        return productCompares.size();
    }

    public Object getItem(int position){
        return productCompares.get(position);
    }

    public long getItemId(int position){
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater mInflater =
                (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.product_compare_data_list, parent, false);

        TextView productName = (TextView) view.findViewById(R.id.textViewProductName);
        productName.setText(productCompares.get(position).getName());
        return view;
    }
}
