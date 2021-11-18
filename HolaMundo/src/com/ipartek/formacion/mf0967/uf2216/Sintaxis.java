package com.ipartek.formacion.mf0967.uf2216;

/**
 * Clase para demostrar la sintaxis b�sica de Java
 * 
 * @author JavierLete
 *
 */
public class Sintaxis {
	/**
	 * M�todo de entrada de la aplicaci�n
	 * 
	 * @param args argumentos recibidos por consola
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Comentario de l�nea

		/*
		 * Comentario multi l�nea
		 */

		// TIPOS PRIMITIVOS
		byte b;
		short s;
		int i = 5;
		long l = 5L;

		float f = 0.3F;
		double d = 0.3;

		char c = '\n'; // 'g'; \n, \t, \r...

		boolean bl = true;

		// TIPOS REFERENCIA

		// Tipos primitivos encapsulados
		Byte be = null;
		Short se = null;
		Integer ie = null;
		Long le = null;

		Float fe = null;
		Double de = null;

		Character ce = null;
		Boolean ble = null;
		
		// Cadena de texto
		String nombre1 = new String("Javier");
		String nombre2 = new String("Javier");

		System.out.println(nombre1 == nombre2);
		System.out.println(nombre1.equals(nombre2));
		
		// M�todos de String
		
		System.out.println("Este es un texto".toUpperCase());

		StringBuffer log = new StringBuffer();

		log.append("l�nea1\n");
		log.append("l�nea2\n");

		String logS = log.toString();

		System.out.println(logS);

		// Conversiones de String a otro tipo
		String texto = "5";
		int enteroPrimitivo = Integer.parseInt(texto);
		
		// Conversiones de otro tipo a String
		enteroPrimitivo = 5;
		texto = String.valueOf(enteroPrimitivo);
		
		Integer enteroEncapsulado = 5;
		
		texto = enteroEncapsulado.toString();
		
	}

}
