package test1.daihocbachkhoa.tranphuc1995.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerViewAdapter adapter;
    private List<Beverage> arlDrink = new ArrayList<>();
    private Button btnConfirmOrder;
    private StringBuilder orderBeverages = new StringBuilder();
    private EditText edtNumberOfOrder;
    private ArrayList<String> arlNumberOfOrder = new ArrayList<>();
    private CreateData createData = new CreateData();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        confirmOrder();
    }

    private void init() {
        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewList);
        btnConfirmOrder = (Button) findViewById(R.id.button_Confirm);
        edtNumberOfOrder = (EditText) findViewById(R.id.editText_NumberOfOrder);
        arlDrink = createData.createDataBeverages();
        adapter = new RecyclerViewAdapter((ArrayList) arlDrink);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void confirmOrder() {
        btnConfirmOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                orderBeverages.setLength(0);
                for (int i = 0; i < adapter.arlCheckBeverages.size(); i++) {
                    orderBeverages.append(adapter.arlCheckBeverages.get(i).getCheckBeverages() + "  x");
                    orderBeverages.append(adapter.arlCheckBeverages.get(i).getNumberOfOrder());
                    orderBeverages.append("\n");
                }
                if (orderBeverages.length() > 0) {
                    orderBeverages.setLength(orderBeverages.length() - 1);
                }
                if (adapter.arlCheckBeverages.size() > 0) {
                    showBeverages(orderBeverages.toString());
                } else {
                    Toast.makeText(MainActivity.this, "Please order Beverage !", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void showBeverages(String listOrder) {
        Intent it = new Intent(MainActivity.this, ShowBeverages.class);
        it.putExtra("listOrder", listOrder);
        startActivity(it);
    }
}
