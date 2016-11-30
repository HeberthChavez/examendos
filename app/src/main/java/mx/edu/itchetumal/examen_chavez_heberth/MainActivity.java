package mx.edu.itchetumal.examen_chavez_heberth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int circCoordX = 50, circCoordY = 50;
    int puntuacion, finalpuntos, jugador2 = 0;
    public int x;
    public int y;
    public int contador = 21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layoutP = (LinearLayout) findViewById(R.id.layout_principal);
        Lienzo areaDibujo = new Lienzo(this);
        layoutP.addView(areaDibujo);


    }

    private int contador(){
        contador--;
        if (contador==10){
            Toast.makeText(this, "FIN DEL JUGADOR 1", Toast.LENGTH_SHORT).show();
            finalpuntos=puntuacion;
        }
        if (contador==0){
            Toast.makeText(this, "FIN DEL JUGADOR 2", Toast.LENGTH_SHORT).show();
            jugador2=puntuacion-finalpuntos;
            if (finalpuntos > jugador2){
                Toast.makeText(this, "CAMPEON DE TIRO CON ARCO: Jugador 1", Toast.LENGTH_LONG).show();
            }
            if (finalpuntos < jugador2) {
                Toast.makeText(this, "CAMPEON DE TIRO CON ARCO: Jugador 2", Toast.LENGTH_LONG).show();
            }
        }
        return contador;
    }

    class Lienzo extends View {

        public Lienzo(Context context) {
            super(context);
        }

        protected void onDraw(Canvas canvas) {
            int ancho = canvas.getWidth();
            int alto = canvas.getHeight();

            x = ancho / 2;
            y = alto / 2;

            Paint pincel = new Paint();
            pincel.setAntiAlias(true);

            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(3);
            canvas.drawCircle(circCoordX, circCoordY, 30, pincel);

            pincel.setStyle(Paint.Style.FILL);
            pincel.setTextSize(50);
            canvas.drawText("jugador 1: " + finalpuntos, 0, this.getMeasuredHeight() -250, pincel);
            pincel.setTextSize(50);
            canvas.drawText("jugador 2: " + jugador2, 0, this.getMeasuredHeight() -130, pincel);

//CIRCULOS
            //CIRCULOAZUL
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.BLUE);
            pincel.setStrokeWidth(2);
            canvas.drawCircle(ancho / 2, alto / 2, 400, pincel);
            pincel.setStyle(Paint.Style.STROKE);
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(2);
            canvas.drawCircle(ancho / 2, alto / 2, 400, pincel);
            pincel.setStyle(Paint.Style.FILL);
            // CIRCULONEGRO
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(5);
            canvas.drawCircle(ancho / 2, alto / 2, 320, pincel);
            pincel.setStyle(Paint.Style.STROKE);
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(5);
            canvas.drawCircle(ancho / 2, alto / 2, 320, pincel);
            //CIRCULOROJO
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.RED);
            pincel.setStrokeWidth(2);
            canvas.drawCircle(ancho / 2, alto / 2, 240, pincel);
            pincel.setStyle(Paint.Style.STROKE);
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(2);
            canvas.drawCircle(ancho / 2, alto / 2, 240, pincel);
            //CIRCULO VERDE
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.GREEN);
            pincel.setStrokeWidth(5);
            canvas.drawCircle(ancho / 2, alto / 2, 160, pincel);
            pincel.setStyle(Paint.Style.STROKE);
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(5);
            canvas.drawCircle(ancho / 2, alto / 2, 160, pincel);
            //CIRCULO AMARILLO
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.YELLOW);
            pincel.setStrokeWidth(2);
            canvas.drawCircle(ancho / 2, alto / 2, 80, pincel);
            pincel.setStyle(Paint.Style.STROKE);
            pincel.setColor(Color.BLACK);
            pincel.setStrokeWidth(2);
            canvas.drawCircle(ancho / 2, alto / 2, 80, pincel);

//NUMEROSIZQUIERDA
            //AZUL20
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("20", ancho / 2 + -380, alto / 2 + 20, pincel);
            //NEGRO40
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("40", ancho / 2 + -310, alto / 2 + 20, pincel);
            //ROJO60
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("60", ancho / 2 + -220, alto / 2 + 20, pincel);
            //VERDE80
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("80", ancho / 2 + -140, alto / 2 + 20, pincel);
//CENTROAMARILLO
            //AMARILLO100
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.BLACK);
            pincel.setTextSize(47);
            canvas.drawText("100", ancho / 2 + -37, alto / 2 + 20, pincel);
//NUMEROSDERECHA
            //AZUL20
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("20", ancho / 2 + 340, alto / 2 + 20, pincel);
            //AZUL20
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("40", ancho / 2 + 260, alto / 2 + 20, pincel);
            //AZUL20
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("60", ancho / 2 + 175, alto / 2 + 20, pincel);
            //AZUL20
            pincel.setStyle(Paint.Style.FILL);
            pincel.setColor(Color.WHITE);
            pincel.setTextSize(47);
            canvas.drawText("80", ancho / 2 + 95, alto / 2 + 20, pincel);


        }
        //marcador
        @Override
        public boolean onTouchEvent(MotionEvent evento) {
            circCoordX = (int) evento.getX();
            circCoordY = (int) evento.getY();
            if(contador >=0) {
                if (evento.getAction() == MotionEvent.ACTION_DOWN) {
                    double tino = Math.sqrt(Math.pow(circCoordX - x, 2) + Math.pow(circCoordY - y, 2));
                    contador();
                    if (tino <= 90) {
                        puntuacion=puntuacion+100;
                    }
                    if (tino > 90 & tino <= 170) {
                        puntuacion=puntuacion+80;
                    }
                    if (tino > 170 & tino <= 250) {
                        puntuacion=puntuacion+60;
                    }
                    if (tino > 250 & tino <= 330) {
                        puntuacion=puntuacion+40;
                    }
                    if (tino > 330 & tino <= 390) {
                        puntuacion=puntuacion+20;
                    }
                    if (tino > 470) {
                        puntuacion=puntuacion+0;
                    }
                }
                if (evento.getAction() == MotionEvent.ACTION_UP) {
                }
                if (evento.getAction() == MotionEvent.ACTION_MOVE) {
                }
                invalidate();
            }
            return true;
        }




    }
}