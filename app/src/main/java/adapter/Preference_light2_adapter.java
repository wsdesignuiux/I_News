package adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ws.vaibhav.inews.R;

import java.util.ArrayList;

import model.Preferences_light2_model;

public class Preference_light2_adapter extends RecyclerView.Adapter<Preference_light2_adapter.ViewHolder> {

    Context context;
    ArrayList<Preferences_light2_model>preferences_light2_models;

    public Preference_light2_adapter(Context context, ArrayList<Preferences_light2_model> preferences_light2_models) {
        this.context = context;
        this.preferences_light2_models = preferences_light2_models;
    }

    @NonNull
    @Override
    public Preference_light2_adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_preferences_light2,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Preference_light2_adapter.ViewHolder holder, int position) {

        holder.image2.setImageResource(preferences_light2_models.get(position).getImage2());

        holder.text2.setText(preferences_light2_models.get(position).getText2());
    }

    @Override
    public int getItemCount() {
        return preferences_light2_models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


        ImageView image2;
        TextView text2;
        public ViewHolder(View itemView) {
            super(itemView);

            image2 = itemView.findViewById(R.id.image2);
            text2 =itemView.findViewById(R.id.text2);
        }
    }
}
