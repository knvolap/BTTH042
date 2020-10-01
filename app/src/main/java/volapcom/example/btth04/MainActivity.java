package volapcom.example.btth04;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.listview);
        arr_bean=new ArrayList<ListViewBean>();
        arr_bean.add(new ListViewBean(R.drawable.androi, "Android"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_all_inclusive_24, "Visual basic"));
        arr_bean.add(new ListViewBean(R.drawable.ic_baseline_polymer_24, "Node"));
        arr_bean.add(new ListViewBean(R.drawable.phh,"PHP"));
        arr_bean.add(new ListViewBean(R.drawable.mysql, "MySQL"));
        arr_bean.add(new ListViewBean(R.drawable.php, "PHP"));
        arr_bean.add(new ListViewBean(R.drawable.mysql, "MySQL"));
        arr_bean.add(new ListViewBean(R.drawable.php, "PHP"));
        adapter=new ListViewBaseAdapter(arr_bean,this);
        lv.setAdapter(adapter);



    }
}