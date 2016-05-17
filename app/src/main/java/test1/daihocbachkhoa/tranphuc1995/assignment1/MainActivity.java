package test1.daihocbachkhoa.tranphuc1995.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdapter adapter;
    ArrayList<Beverages> arlDrink;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createData();
        init();
    }
    public void init(){
        recyclerView = (RecyclerView)findViewById(R.id.recyclerViewList);
        adapter = new RecyclerViewAdapter(arlDrink);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    public void createData(){
        arlDrink = new ArrayList<Beverages>();
        Beverages coffee =  new Beverages("Coffee",R.drawable.coffee);
        arlDrink.add(coffee);
        Beverages orange = new Beverages("Pure Orangle Juice",R.drawable.orange);
        arlDrink.add(orange);
        Beverages carrot =  new Beverages("Carrot Juice", R.drawable.carrot);
        arlDrink.add(carrot);
        Beverages waterMelon =  new Beverages("Water Melon Juice", R.drawable.watermelon);
        arlDrink.add(waterMelon);
        Beverages guava =  new Beverages("Guava Juice", R.drawable.guava);
        arlDrink.add(guava);
        Beverages heniken =  new Beverages("Heineken", R.drawable.heineken);
        arlDrink.add(heniken);
    }
    public void onItemClickLisener(View view) {

    }
}
