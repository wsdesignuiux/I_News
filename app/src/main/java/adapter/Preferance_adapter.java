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

import model.Preferance_model;

public class Preferance_adapter extends RecyclerView.Adapter<Preferance_adapter.ViewHolder> {
int myPos=0;
    Context context;
    ArrayList<Preferance_model>preferance_models;

    public Preferance_adapter(Context context, ArrayList<Preferance_model> preferance_models) {
        this.context = context;
        this.preferance_models = preferance_models;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_preferances1,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {

        holder.tv1.setText(preferance_models.get(position).getTv1());

        holder.image1.setImageResource(preferance_models.get(position).getImage1());


        if(myPos == position){
            holder.li1.setBackgroundResource(R.drawable.rect_green);
            holder.tv1.setTextColor(Color.parseColor("#ffffff"));
            holder.image1.setColorFilter(ContextCompat.getColor(context, R.color.white));


        }else {
            holder.li1.setBackgroundResource(R.drawable.rect_white);
            holder.tv1.setTextColor(Color.parseColor("#2e2f41"));
            holder.image1.setColorFilter(ContextCompat.getColor(context, R.color.gray));

       }

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
        return preferance_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv1;
        ImageView image1;
        LinearLayout li1;

        public ViewHolder(View itemView) {
            super(itemView);

            tv1 = itemView.findViewById(R.id.tv1);

            image1 = itemView.findViewById(R.id.image1);

            li1 = itemView.findViewById(R.id.li1);
        }
    }
}
