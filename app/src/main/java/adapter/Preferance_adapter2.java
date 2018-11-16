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

import model.Preferance_model2;

public class Preferance_adapter2 extends RecyclerView.Adapter<Preferance_adapter2.ViewHolder> {
int myPos=0;
    Context context;
    ArrayList<Preferance_model2> preferance_model2;

    public Preferance_adapter2(Context context, ArrayList<Preferance_model2> preferance_model2) {
        this.context = context;
        this.preferance_model2 = preferance_model2;
    }

    @NonNull
    @Override
    public Preferance_adapter2.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_preferences2, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Preferance_adapter2.ViewHolder holder, final int position) {
        holder.tv2.setText(preferance_model2.get(position).getTv2());
        holder.image2.setImageResource(preferance_model2.get(position).getImage2());

    }

    @Override
    public int getItemCount() {
        return preferance_model2.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView tv2;
        ImageView image2;
        LinearLayout li2;

        public ViewHolder(View itemView) {
            super(itemView);

            tv2 = itemView.findViewById(R.id.tv2);
            image2 = itemView.findViewById(R.id.image2);
            li2 = itemView.findViewById(R.id.li2);
        }
    }
}
