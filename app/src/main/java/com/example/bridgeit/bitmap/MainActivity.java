package com.example.bridgeit.bitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import static android.R.attr.delay;

public class MainActivity extends AppCompatActivity {
ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (ImageView)findViewById(R.id.image_view);

        Bitmap bitmap = Bitmap.createBitmap(500,500, Bitmap.Config.ARGB_8888);
        bitmap.eraseColor(Color.RED);

        Canvas canvas = new Canvas(bitmap);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(6F);
        paint.setStyle(Paint.Style.STROKE);

        //line
        canvas.drawLine(0f,0f,500f,500f,paint);


        //circle
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(400f,200f,50f,paint);

        //text
        paint.setColor(Color.BLACK);
        paint.setTextSize(50F);
        canvas.drawText("Hello Graphics",0,14,90,80,paint);

        //rectangular
        paint.setColor(Color.GREEN);
        canvas.drawRect(20F, 300F, 180F, 400F, paint);

/*
        //matrix
        //canvas.setMatrix(new Matrix());
       // canvas.setMatrix(null);
        paint.setColor(Color.BLACK);
       canvas.save();
        canvas.rotate(45f,100f,350f);
        canvas.drawRect(20f,300f,180f,400f,paint);
       canvas.restore();
        paint.setColor(Color.GRAY);
        paint.setTextSize(50f);
        canvas.drawText("Hello Graphics",0,14,90,80,paint);

        float xmax=10;
        float xmin=0;
        float ymax=10;
        float ymin=0;
        float width=500;
        float height=500;
        canvas.scale(width / (xmax - xmin), -height / (ymax - ymin));
        canvas.translate(-xmin, -ymax);
        paint.setStrokeWidth(.4f);
        canvas.drawLine(0F, 0F, 10F, 0F, paint);
        canvas.drawLine(0F, 0F, 0F, 10F, paint);
        canvas.drawLine(0F, 0F, 10F, 10F, paint);
        //canvas.restore();*/
        mImageView.setImageBitmap(bitmap);


    }
}
