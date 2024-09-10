package com.example.coralinspiracion;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import java.util.List;

public class CoroAdapter extends RecyclerView.Adapter<CoroAdapter.CoroViewHolder> {

    private List<Coro> coros;
    private Context context;

    public CoroAdapter(List<Coro> coros, Context context) {
        this.coros = coros;
        this.context = context;
    }

    @NonNull
    @Override
    public CoroViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coro, parent, false);
        return new CoroViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CoroViewHolder holder, int position) {
        Coro coro = coros.get(position);
        holder.logoImageView.setImageResource(coro.getLogo());
        holder.nombreTextView.setText(coro.getNombre());
        holder.interpretesTextView.setText(coro.getInterpretes());

        // Manejar clic en el CardView
        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, DetalleCoroActivity.class);
            intent.putExtra("NOMBRE_CORO", coro.getNombre());
            context.startActivity(intent);

            // Agregar un Toast para debug
        });
    }

    @Override
    public int getItemCount() {
        return coros.size();
    }

    static class CoroViewHolder extends RecyclerView.ViewHolder {
        ImageView logoImageView;
        TextView nombreTextView;
        TextView interpretesTextView;

        CoroViewHolder(View itemView) {
            super(itemView);
            logoImageView = itemView.findViewById(R.id.logoImageView);
            nombreTextView = itemView.findViewById(R.id.nombreTextView);
            interpretesTextView = itemView.findViewById(R.id.interpretesTextView);
        }
    }
}