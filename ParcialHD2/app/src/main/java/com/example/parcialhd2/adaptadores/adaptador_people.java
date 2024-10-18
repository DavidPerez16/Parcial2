package com.example.parcialhd2.adaptadores;



import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.parcialhd2.R;
import com.example.parcialhd2.clases.people;
import com.squareup.picasso.Picasso;

import java.util.List;

public class adaptador_people extends RecyclerView.Adapter<adaptador_people.ViewHolder>{

    private List<people> datos;
    private Context context;

    public adaptador_people(Context context, List <people> datos) {
        this.datos = datos;
        this.context=context;

    }

    @NonNull
    @Override
    public adaptador_people.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(com.example.parcialhd2.R.layout.item_people,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull adaptador_people.ViewHolder holder, int position) {
        people dato = datos.get(position);
        holder.bind(dato);

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView txt_name,txt_status, txt_type;
        ImageView img_people;
        CardView cardView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt_name= itemView.findViewById(R.id.txt_name);
            txt_status= itemView.findViewById(R.id.txt_status);
            txt_type = itemView.findViewById(R.id.txt_type);
            img_people= itemView.findViewById(R.id.img_people);
            cardView= itemView.findViewById(R.id.card_view);
        }

        public void bind(people dato){
            txt_name.setText(dato.getName());
            txt_status.setText(dato.getStatus());
            txt_type.setText(dato.getType());
            //imgaes
            Picasso.get().load(dato.getImagen()).into(img_people);

        }
    }


}
