package test1.daihocbachkhoa.tranphuc1995.assignment1;

import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by tran_phuc on 5/16/2016.
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private ArrayList<Beverage> arlDrink = new ArrayList<>();
    ArrayList<Order> arlCheckBeverages = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<Beverage> arlDrink) {
        this.arlDrink = arlDrink;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.recyclerview_item, parent, false);
        return new RecyclerViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final RecyclerViewHolder holder, final int position) {
        holder.edtNumberOfOrder.setVisibility(View.GONE);
        holder.tvNumberOfOrder.setVisibility(View.GONE);
        holder.tvBeverages.setText(arlDrink.get(position).getDrinkName());
        holder.imgBeverages.setImageResource(arlDrink.get(position).getImgBeverages());
        holder.chbCheckBeverages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (holder.chbCheckBeverages.isChecked()) {
                    holder.edtNumberOfOrder.setVisibility(View.VISIBLE);
                    holder.tvNumberOfOrder.setVisibility(View.VISIBLE);
                    Order order = new Order(arlDrink.get(position).getDrinkName(), holder.edtNumberOfOrder.getText().toString());
                    arlCheckBeverages.add(order);
                } else if (!holder.chbCheckBeverages.isChecked()) {
                    holder.edtNumberOfOrder.setVisibility(View.GONE);
                    holder.tvNumberOfOrder.setVisibility(View.GONE);
                    for (int i = 0; i < arlCheckBeverages.size(); i++) {
                        if (arlCheckBeverages.get(i).getCheckBeverages().equals(arlDrink.get(position).getDrinkName())) {
                            arlCheckBeverages.remove(i);
                            break;
                        }
                    }
                }
            }
        });
        holder.edtNumberOfOrder.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                arlCheckBeverages.get(position).setNumberOfOrder(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return arlDrink.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView tvBeverages;
        private ImageView imgBeverages;
        private CheckBox chbCheckBeverages;
        private EditText edtNumberOfOrder;
        private TextView tvNumberOfOrder;

        public RecyclerViewHolder(View itemView) {
            super(itemView);
            tvBeverages = (TextView) itemView.findViewById(R.id.textView_Beverages);
            imgBeverages = (ImageView) itemView.findViewById(R.id.imageView_Beverages);
            chbCheckBeverages = (CheckBox) itemView.findViewById(R.id.checkBox_CheckBeverages);
            edtNumberOfOrder = (EditText) itemView.findViewById(R.id.editText_NumberOfOrder);
            tvNumberOfOrder = (TextView) itemView.findViewById(R.id.textView_NumberOfOrder);
        }
    }
}