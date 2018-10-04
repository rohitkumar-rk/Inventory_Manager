package android.example.android.inventory;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ItemsAdapter extends ArrayAdapter<Items> {


    public ItemsAdapter(@NonNull Activity context, ArrayList<Items> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null){
            listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        Items currentItem = getItem(position);
        TextView nameTextView = listItemView.findViewById(R.id.nameTextView);
        TextView quantityTextView = listItemView.findViewById(R.id.quantityTextView);
        TextView priceTextView = listItemView.findViewById(R.id.priceTextView);

        ImageView imageView = listItemView.findViewById(R.id.productImage);

        nameTextView.setText(currentItem.getProductName()+"");
        quantityTextView.setText(currentItem.getQuantity()+"");
        priceTextView.setText(currentItem.getPrice()+"");
        imageView.setImageResource(currentItem.getImageResourceId());


        return listItemView;
    }
}
