package com.example.cmput301w23t30;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.shapes.Shape;
import android.util.Log;

public class Hexagon extends Shape {
    private int x;
    private int y;

    @Override
    public void draw(Canvas canvas, Paint paint) {
        Log.d("Hexagon", "Yayyy");
    }
}
