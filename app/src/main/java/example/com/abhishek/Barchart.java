package example.com.abhishek;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class Barchart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barchart);
        BarChart chart = (BarChart) findViewById(R.id.chart);

        BarData data = new BarData(getXAxisValues(), getDataSet());
        chart.setDescription("");
        chart.setData(data);
        chart.animateXY(3000, 3000);
        chart.invalidate();
    }

    private ArrayList<BarDataSet> getDataSet() {
        ArrayList<BarDataSet> dataSets = null;

        ArrayList<BarEntry> valueSet1 = new ArrayList<>();
        BarEntry v1e1 = new BarEntry(33.000f, 0);
        valueSet1.add(v1e1);
        BarEntry v1e2 = new BarEntry(29.000f, 1);
        valueSet1.add(v1e2);
        BarEntry v1e3 = new BarEntry(31.000f, 2);
        valueSet1.add(v1e3);
        BarEntry v1e4 = new BarEntry(31.000f, 3);
        valueSet1.add(v1e4);
        BarEntry v1e5 = new BarEntry(29.000f, 4);
        valueSet1.add(v1e5);
        BarEntry v1e6 = new BarEntry(30.000f, 5);
        valueSet1.add(v1e6);
        BarEntry v1e7 = new BarEntry(29.000f, 6);
        valueSet1.add(v1e7);
        BarEntry v1e8 = new BarEntry(29.000f, 7);
        valueSet1.add(v1e8);
        BarEntry v1e9 = new BarEntry(30.000f, 8);
        valueSet1.add(v1e9);
        BarEntry v1e10 = new BarEntry(31.000f, 9);
        valueSet1.add(v1e10);
        BarEntry v1e11 = new BarEntry(30.000f, 10);
        valueSet1.add(v1e11);
        BarEntry v1e12 = new BarEntry(30.000f, 11);
        valueSet1.add(v1e12);
        BarEntry v1e13 = new BarEntry(31.000f, 12);
        valueSet1.add(v1e13);
        BarEntry v1e14 = new BarEntry(30.000f, 13);
        valueSet1.add(v1e14);
        BarEntry v1e15 = new BarEntry(28.000f, 14);
        valueSet1.add(v1e15);
        BarEntry v1e16 = new BarEntry(28.000f, 15);
        valueSet1.add(v1e16);
        BarEntry v1e17 = new BarEntry(28.000f, 16);
        valueSet1.add(v1e17);
        BarEntry v1e18 = new BarEntry(27.000f, 17);
        valueSet1.add(v1e18);
        BarEntry v1e19 = new BarEntry(28.000f, 18);
        valueSet1.add(v1e19);
        BarEntry v1e20 = new BarEntry(27.000f, 19);
        valueSet1.add(v1e20);
        BarEntry v1e21 = new BarEntry(29.000f, 20);
        valueSet1.add(v1e21);
        BarEntry v1e22 = new BarEntry(29.000f, 21);
        valueSet1.add(v1e22);
        BarEntry v1e23 = new BarEntry(29.000f, 22);
        valueSet1.add(v1e23);
        BarEntry v1e24 = new BarEntry(29.000f, 23);
        valueSet1.add(v1e24);
        BarEntry v1e25 = new BarEntry(29.000f, 24);
        valueSet1.add(v1e25);
        BarEntry v1e26 = new BarEntry(28.000f, 25);
        valueSet1.add(v1e26);
        BarEntry v1e27 = new BarEntry(25.000f, 26);
        valueSet1.add(v1e27);
        BarEntry v1e28 = new BarEntry(24.000f, 27);
        valueSet1.add(v1e28);
        BarEntry v1e29 = new BarEntry(25.000f, 28);
        valueSet1.add(v1e29);
        BarEntry v1e30 = new BarEntry(27.000f, 29);
        valueSet1.add(v1e30);

        BarDataSet barDataSet1 = new BarDataSet(valueSet1, "Daily Temperature");
        barDataSet1.setColors(ColorTemplate.COLORFUL_COLORS);

        dataSets = new ArrayList<>();
        dataSets.add(barDataSet1);
        return dataSets;
    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("1");
        xAxis.add("2");
        xAxis.add("3");
        xAxis.add("4");
        xAxis.add("5");
        xAxis.add("6");
        xAxis.add("7");
        xAxis.add("8");
        xAxis.add("9");
        xAxis.add("10");
        xAxis.add("11");
        xAxis.add("12");
        xAxis.add("13");
        xAxis.add("14");
        xAxis.add("15");
        xAxis.add("16");
        xAxis.add("17");
        xAxis.add("18");
        xAxis.add("19");
        xAxis.add("20");
        xAxis.add("21");
        xAxis.add("22");
        xAxis.add("23");
        xAxis.add("24");
        xAxis.add("25");
        xAxis.add("26");
        xAxis.add("27");
        xAxis.add("28");
        xAxis.add("29");
        xAxis.add("30");
        return xAxis;
    }
}