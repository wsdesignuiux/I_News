package adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.ws.vaibhav.inews.R;

import java.util.ArrayList;

import model.Preference_light1_model;

public class Preference_light1_adapter extends RecyclerView.Adapter<Preference_light1_adapter.ViewHolder> {
    int myPos=0;
    Context context;
    ArrayList<Preference_light1_model>preference_light1_models;

    public Preference_light1_adapter(Context context, ArrayList<Preference_light1_model> preference_light1_models) {
        this.context = context;
        this.preference_light1_models = preference_light1_models;
    }

    @NonNull
    @Override
    public Preference_light1_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_preferances_light1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Preference_light1_adapter.ViewHolder holder, final int position) {

        holder.image1.setImageResource(preference_light1_models.get(position).getImage1());

        holder.text1.setText(preference_light1_models.get(position).getText1());


        if(myPos == position){
            holder.li1.setBackgroundResource(R.drawable.rect_green);
            holder.text1.setTextColor(Color.parseColor("#ffffff"));
            holder.image1.setColorFilter(ContextCompat.getColor(context, R.color.white));

        }else {
            holder.li1.setBackgroundResource(R.drawable.rect_gray);
            holder.text1.setTextColor(Color.parseColor("#2e2f41"));

            holder.image1.setColorFilter(ContextCompat.getColor(context, R.color.gray));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();
            }
        });


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                myPos = position;
                notifyDataSetChanged();
            }
        });
    }

    @Override
    public int getItemCount() {
        return preference_light1_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView image1;
        TextView text1;

        LinearLayout li1;
        public ViewHolder(View itemView) {
            super(itemView);

            image1 = itemView.findViewById(R.id.image1);
            text1 = itemView.findViewById(R.id.text1);

            li1 = itemView.findViewById(R.id.li1);
        }
    }
}
