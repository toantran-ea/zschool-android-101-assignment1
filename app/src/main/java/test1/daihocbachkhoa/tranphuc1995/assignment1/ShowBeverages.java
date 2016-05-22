package test1.daihocbachkhoa.tranphuc1995.assignment1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ShowBeverages extends AppCompatActivity {
    private TextView tvShowBeverages;
    private String listOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_beverages);
        init();
    }

    private void init() {
        tvShowBeverages = (TextView) findViewById(R.id.textView_ShowBeverages);
        Bundle bd = getIntent().getExtras();
        if (bd != null) {
            listOrder = bd.getString("listOrder");
            tvShowBeverages.setText(listOrder);
        }
    }
}
