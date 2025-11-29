package com.example.assessment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {

    private List<FoodItem> foodList;

    public FoodAdapter(List<FoodItem> foodList) {
        this.foodList = foodList;
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food, parent, false);
        return new FoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        FoodItem foodItem = foodList.get(position);
        holder.foodImage.setImageResource(foodItem.getImageResId());
        holder.foodName.setText(foodItem.getName());
        holder.foodPrice.setText("$" + foodItem.getPrice());
        holder.quantity.setText(String.valueOf(foodItem.getQuantity()));

        holder.btnIncrease.setOnClickListener(v -> {
            foodItem.increaseQuantity();
            holder.quantity.setText(String.valueOf(foodItem.getQuantity()));
        });

        holder.btnDecrease.setOnClickListener(v -> {
            foodItem.decreaseQuantity();
            holder.quantity.setText(String.valueOf(foodItem.getQuantity()));
        });
    }

    @Override
    public int getItemCount() {
        return foodList.size();
    }

    static class FoodViewHolder extends RecyclerView.ViewHolder {
        ImageView foodImage;
        TextView foodName;
        TextView foodPrice;
        Button btnDecrease;
        Button btnIncrease;
        TextView quantity;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodImage = itemView.findViewById(R.id.food_image);
            foodName = itemView.findViewById(R.id.food_name);
            foodPrice = itemView.findViewById(R.id.food_price);
            btnDecrease = itemView.findViewById(R.id.btn_decrease);
            btnIncrease = itemView.findViewById(R.id.btn_increase);
            quantity = itemView.findViewById(R.id.tv_quantity);
        }
    }
}