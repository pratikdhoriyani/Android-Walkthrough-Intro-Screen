package coding.insight.walkthrough;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import coding.insight.walkthrough.Adapter.Adapter_walkthrough;
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity {

    public ViewPager viewpager;

    Adapter_walkthrough adapter_walkthrough;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewpager = findViewById(R.id.viewpager);

        CircleIndicator indicator = findViewById(R.id.indicator);

        adapter_walkthrough = new Adapter_walkthrough(getSupportFragmentManager());

        viewpager.setAdapter(adapter_walkthrough);

        indicator.setViewPager(viewpager);

        adapter_walkthrough.registerDataSetObserver(indicator.getDataSetObserver());
    }
}
