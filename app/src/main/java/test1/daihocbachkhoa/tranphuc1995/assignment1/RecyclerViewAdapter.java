package test1.daihocbachkhoa.tranphuc1995.assignment1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tran_phuc on 5/16/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private ArrayList<Beverages> arlDrink = new ArrayList<>();
    public RecyclerViewAdapter (ArrayList<Beverages> arlDrink){
        this.arlDrink = arlDrink;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.recyclerview_item,parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.tvBeverages.setText(arlDrink.get(position).getDrinkName());
        holder.imgBeverages.setImageResource(arlDrink.get(position).getImgBeverages());
    }
    @Override
    public int getItemCount() {
        return arlDrink.size();
    }
    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvBeverages;
        ImageView imgBeverages;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvBeverages = (TextView) itemView.findViewById(R.id.textView_Beverages);
            imgBeverages = (ImageView)itemView.findViewById(R.id.imageView_Beverages);
        }

    }
}