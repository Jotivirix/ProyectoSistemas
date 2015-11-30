/*
 * AUTOR: Jose Ignacio Navas Sanz
 * 
 * CURSO: 1º DAM
 * 
 * RobotACM consiste en crear un robot mediante
 * un proyecto de equipo en el cual cada miembro
 * debe realizar una parte del robot.
 * 
 * En mi caso he de realizar las piernas
 * 
 * Fijaremos un tamaño de ventana de 800x600
 */
import java.awt.Color;

import acm.graphics.GLabel;
import acm.graphics.GRect;
import acm.program.GraphicsProgram;



public class PiesYPiernasRobot extends GraphicsProgram{
	
	public static int ANCHO_PANTALLA = 800;
	public static int ALTO_PANTALLA = 600;
	
	public static final int ANCHO_PIE = 45;
	public static final int ALTO_PIE = 45;
	
	public static final int ALTO_PIERNA = 150;
	public static final int ANCHO_PIERNA = 40;
	
	GRect pierna;
	GRect pie;
	
	public void init(){
		setSize(ANCHO_PANTALLA, ALTO_PANTALLA);
		
		GRect piernaD = new GRect (ANCHO_PIERNA,ALTO_PIERNA);
		piernaD.setFillColor(Color.GRAY);
		piernaD.setFilled(true);
		add(piernaD);
		GRect piernaI = new GRect (ANCHO_PIERNA, ALTO_PIERNA);
		piernaI.setFillColor(Color.GRAY);
		piernaI.setFilled(true);
		add(piernaI,ANCHO_PIERNA,0);
		
		piernaI.setLocation(ANCHO_PANTALLA/2-ANCHO_PIERNA, ALTO_PANTALLA-ALTO_PIE-ALTO_PIERNA-ALTO_PIE/2);
		piernaD.setLocation(ANCHO_PANTALLA/2, ALTO_PANTALLA-ALTO_PIE-ALTO_PIERNA-ALTO_PIE/2);
		
		
		GRect pieD = new GRect (ANCHO_PIE, ALTO_PIE);
		pieD.setFilled(true);
		pieD.setFillColor(Color.BLUE);
		add(pieD);
		pieD.setLocation(piernaD.getX(),piernaD.getY()+ALTO_PIERNA);
		GRect pieI = new GRect (ANCHO_PIE, ALTO_PIE);
		pieI.setFilled(true);
		pieI.setFillColor(Color.BLUE);
		add(pieI);
		pieI.setLocation(pieD.getX()-ANCHO_PIE, piernaI.getY()+ALTO_PIERNA);
		
		GLabel prueba = new GLabel ("PRUEBA");
		add(prueba);
	}
}
