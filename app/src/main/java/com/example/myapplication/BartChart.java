package com.example.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.BarGraphSeries;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class BartChart extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bart_chart);

        GraphView graph = findViewById(R.id.graph);
        BarGraphSeries<DataPoint> series = new BarGraphSeries<>(new DataPoint[] {
                new DataPoint(1, 2.5),
                new DataPoint(2, 1),
                new DataPoint(3, 4),
                new DataPoint(4, 2.5),
                new DataPoint(5, 5),
                new DataPoint(6, 3),
                new DataPoint(7, 4),
                new DataPoint(8, 2),
                new DataPoint(9, 1.5),
                new DataPoint(10, 3)}
        );
        graph.addSeries(series);

        series.setColor(Color.BLUE);
        series.setSpacing(50);
        series.setDrawValuesOnTop(true);
        series.setDrawValuesOnTop(true);
        series.setValuesOnTopColor(Color.RED);
        series.setValuesOnTopSize(50);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(11);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(0);
        graph.getViewport().setMaxY(6);
    }
}
