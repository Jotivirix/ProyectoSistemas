import java.awt.Color;

import javax.swing.GrayFilter;

import acm.graphics.GRect;
import acm.program.GraphicsProgram;
/*
 * 
 * AUTOR: JAIME MARTÕNEZ ORTEGA
 * 
 */
//A VER SI VA EL PUTOO CLAZPAZZzZz
public class CuerpoRobot extends GraphicsProgram{
	GRect cuerpo;
	GRect brazoDer;
	GRect brazoIzq;
	GRect cuello2;

	public void init(){
		setSize(800,600);
		cuerpo = new GRect(150, 200);
		brazoDer = new GRect(50,230);
		brazoIzq = new GRect(50, 230);
		cuello2 = new GRect (40,10);
	}
	public void run(){
//Dibujo el cuerpo
		cuerpo.setFilled(true);
		cuerpo.setFillColor(Color.GRAY);
		add(cuerpo,
				getWidth()/2 - cuerpo.getWidth()/2,
				getHeight()/2 - cuerpo.getHeight()/2);

//Dibujo brazo derecho
		brazoDer.setFilled(true);
		brazoDer.setFillColor(Color.BLUE);
		add(brazoDer,
				getWidth()/2+cuerpo.getWidth()/2,
				getHeight()/2 - cuerpo.getHeight()/2);

//Dibujo brazo izquierdo
		brazoIzq.setFilled(true);
		brazoIzq.setFillColor(Color.BLUE);
		add(brazoIzq,
				getWidth()/2-cuerpo.getWidth()/2- brazoIzq.getWidth(),
				getHeight()/2 - cuerpo.getHeight()/2);

//Dibujo parte del cuello2, la que va unida al cuerpo
		cuello2.setFilled(true);
		cuello2.setFillColor(Color.GRAY);
		add(cuello2,
				getWidth()/2 - cuello2.getWidth()/2,
				getHeight()/2 - cuerpo.getHeight()/2-cuello2.getHeight());
	}
}
