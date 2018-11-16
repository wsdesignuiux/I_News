package adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.ws.vaibhav.inews.NewsFeedWhiteActivity;
import com.ws.vaibhav.inews.News_Detail_Page3Activity;
import com.ws.vaibhav.inews.News_Detail_Page_LightMode3Activity;
import com.ws.vaibhav.inews.News_feed2Activity;
import com.ws.vaibhav.inews.Preferences1Activity;
import com.ws.vaibhav.inews.Preferences_Light_Mode1Activity;
import com.ws.vaibhav.inews.R;

import java.util.ArrayList;

import model.List_recycle_model;

public class List_recycle_adapter extends RecyclerView.Adapter<List_recycle_adapter.ViewHolder> {

    Context context;
    ArrayList<List_recycle_model>list_recycle_models;

    public List_recycle_adapter(Context context, ArrayList<List_recycle_model> list_recycle_models) {
        this.context = context;
        this.list_recycle_models = list_recycle_models;
    }

    @NonNull
    @Override
    public List_recycle_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycle,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull List_recycle_adapter.ViewHolder holder, final int position) {

        holder.text_list.setText(list_recycle_models.get(position).getText_list());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (position == 0) {
                    Intent i = new Intent(context, Preferences1Activity.class);
                    context.startActivity(i); }

                else if (position == 1) {
                    Intent i = new Intent(context, Preferences_Light_Mode1Activity.class);
                    context.startActivity(i); }

                else if (position == 2) {
                    Intent i = new Intent(context, News_Detail_Page3Activity.class);
                    context.startActivity(i); }


                else if (position == 3) {
                    Intent i = new Intent(context, News_Detail_Page_LightMode3Activity.class);
                    context.startActivity(i); }
                else if (position == 4) {
                    Intent i = new Intent(context, News_feed2Activity.class);
                    context.startActivity(i); }
                else if (position == 5) {
                    Intent i = new Intent(context, NewsFeedWhiteActivity.class);
                    context.startActivity(i); }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list_recycle_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView text_list;
        public ViewHolder(View itemView) {
            super(itemView);

            text_list = itemView.findViewById(R.id.text_list);
        }
    }
}
