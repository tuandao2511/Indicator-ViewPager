package com.asterisk.tuandao.indicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;

/**
 * Created by SUN\ tuan-dao on 05/07/2019.
 * dao.tuan.anh@sun-asterisk.com
 */
public class Dot {

    private Paint paint;

    private PointF center;

    private int currentRadius;

    public Dot() {
        paint = new Paint();
        paint.setAntiAlias(true);
        center = new PointF();
    }

    public void setColor(int color) {
        paint.setColor(color);
    }

    public void setAlpha(int alpha) {
        paint.setAlpha(alpha);
    }

    public void setCenter(float x, float y) {
        center.set(x, y);
    }

    public int getCurrentRadius() {
        return currentRadius;
    }

    public void setCurrentRadius(int radius) {
        this.currentRadius = radius;
    }

    public void draw(Canvas canvas) {
        canvas.drawCircle(center.x, center.y, currentRadius, paint);
    }
}
