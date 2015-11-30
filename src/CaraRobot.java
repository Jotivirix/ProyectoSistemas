/*
 * Autor: Guillermo Blasco
 * 
 * Esta clase define la cara del robot
 */



import java.awt.Color;

import acm.graphics.*;
import acm.program.*;

public class CaraRobot extends GraphicsProgram{
	
	public static int ANCHO_PANTALLA = 800;
	public static int ALTO_PANTALLA = 600;
	
	public static int ANCHO_CARA = 100;
	public static int ALTO_CARA = 100;
	
	public static int OJO = 30;
	
	public static int ANCHO_BOCA = 50;
	public static int ALTO_BOCA = 15;
	
	public static int ANCHO_CUELLO1 = 40;
	public static int ALTO_CUELLO1 = 10;
	
	public static int ANCHO_OREJA = 15;
	public static int ALTO_OREJA = 40;
	
	public void init() {
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
		
		
	}
	
	public void run() {
		
		/**
		 * Creo la cara y la a�ado
		 */
		GRect cara = new GRect(ANCHO_CARA, ALTO_CARA);
		cara.setLocation(ANCHO_PANTALLA/2 - ANCHO_CARA/2, 0);
		cara.setFilled(true);
		cara.setFillColor(Color.LIGHT_GRAY);
		add(cara);
		
		/**
		 * Creo la primera parte del cuello y lo a�ado
		 */
		GRect cuello1 = new GRect(ANCHO_CUELLO1, ALTO_CUELLO1);
		cuello1.setLocation(ANCHO_PANTALLA/2 - ANCHO_CUELLO1/2, ALTO_CARA);
		cuello1.setFilled(true);
		cuello1.setFillColor(Color.GRAY);
		add(cuello1);
		
		/**
		 * Creo el ojo izquierdo y lo a�ado
		 */
		GOval ojo1 = new GOval(OJO, OJO);
		ojo1.setFilled(true);
		ojo1.setFillColor(Color.YELLOW);
		add(ojo1, ANCHO_PANTALLA/2 - 1.2*OJO , OJO/2);
		
		/**
		 * Creo la pupila del ojo izquierdo y la a�ado
		 */
		GOval pupila1 = new GOval(5, 5);
		pupila1.setFilled(true);
		pupila1.setFillColor(Color.BLACK);
		add(pupila1, ANCHO_PANTALLA/2 - 1.2*OJO + OJO/2 , OJO);
		
		/**
		 * Creo el ojo derecho y lo a�ado
		 */
		GOval ojo2 = new GOval(OJO, OJO);
		ojo2.setFilled(true);
		ojo2.setFillColor(Color.YELLOW);
		add(ojo2, ANCHO_PANTALLA/2 + OJO/4, OJO/2);
		
		/**
		 * Creo la pupila del ojo derecho y la a�ado
		 */
		GOval pupila2 = new GOval(5, 5);
		pupila2.setFilled(true);
		pupila2.setFillColor(Color.BLACK);
		add(pupila2, ANCHO_PANTALLA/2 + OJO/4 + OJO/2 , OJO);
		
		/**
		 * Creo la boca y la a�ado
		 */
		GRect boca = new GRect(ANCHO_BOCA, ALTO_BOCA);
		boca.setLocation(ANCHO_PANTALLA/2 - ANCHO_BOCA/2, ALTO_CARA/2 + ALTO_BOCA);
		boca.setFilled(true);
		boca.setFillColor(Color.BLACK);
		add(boca);
		
		/**
		 * Creo la oreja izqueirda y la a�ado
		 */
		GRect oreja1 = new GRect(ANCHO_OREJA, ALTO_OREJA);
		oreja1.setLocation(ANCHO_PANTALLA/2 - ANCHO_CARA/2 - ANCHO_OREJA, ALTO_CARA/2 - ALTO_OREJA/2);
		oreja1.setFilled(true);
		oreja1.setFillColor(Color.BLACK);
		add(oreja1);
		
		/**
		 * Creo la oreja derecha y la a�ado
		 */
		GRect oreja2 = new GRect(ANCHO_OREJA, ALTO_OREJA);
		oreja2.setLocation(ANCHO_PANTALLA/2 + ANCHO_CARA/2, ALTO_CARA/2 - ALTO_OREJA/2);
		oreja2.setFilled(true);
		oreja2.setFillColor(Color.BLACK);
		add(oreja2);
	}

}
