package basicosprofe;

import java.util.Scanner;

/**
 * 
 * LISTA DE EJERCICIOS DE REPASO A LA PARTE DE INICIACIÓN EN JAVA:
 * 
 * 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
 * PERTENECE A LA CADENA O NO perteneceACadena 
 * 
 * 2) HACER UN MÉTODO QUE RECIBA UNA
 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
 * 
 * 2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
 * 
 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1
 * 
 * 
 * 3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar
 * 
 * 4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE
 * EDAD O NO mayorDeEdad 
 * 
 * 5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA
 * SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota -
 * 
 * 
 * 6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena 
 * 
 * 7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99 deTresEnTres
 *
 *
 * // DEFINO UN MÉTODO // DARLE UN NOMBRE - camelCase // ID la entrada - // ID
 * la salida -
 *
 * //pensar el los pasos en esapñol en psuedocódigo
 */

public class EjerciciosBasicos {
	
	/** 1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA SI ESE CARACTER
	  PERTENECE A LA CADENA O NO perteneceACadena*/
	

//	public static void main(String[] args) {
//		boolean resultado = isIn("MÁLAGA", 'G');
//		System.out.println(resultado);
//		resultado = existChar("MÁLAGA", 'G');
//		System.out.println(resultado);
//		resultado = existChar("MÁLAGA", 'g');
//		System.out.println(resultado);
//		
//		String palabra = new String("Arroyo");
//		palabra = palabra.concat("De La Miel");
//		System.out.println(palabra);
//	}
	
	

	private static boolean isIn(String cadena, char car) {
		boolean in = true;

		in = cadena.contains(car + "");
//		for (int i=0; i<cadena.length(); i++) {
//			if(cadena.charAt(i)==car) {
//				in=true;
//			}
//			else {
//				in = false;
//			}
//		}
		return in;
	}
	
//	De otra forma
	
	private static boolean existChar(String cad, char car) {
		boolean aparece = false;
		int pos = 0;
		int longi = cad.length() - 1;
		
			//cad.equalsIgnoreCase(cad)!=
			//	  (pos <= longi && aparece==false)
			while (pos <= longi && !aparece) {
				aparece = cad.charAt(pos) == car ? true : false;
				pos++;
			}
		return aparece;
	}

	
	/**
	 * 2) HACER UN MÉTODO QUE RECIBA UNA
 * CADENA Y UN CARACTER Y DIGA CÚANTAS VECES APARECE ESE CARACTER EN LA CADENA
	 */


	public static int contarCaracter(String cadena, char letra) {
		int cont=0;
		int longitud=cadena.length();
		for (int i = 0; i < longitud; i++) 
        {
			// si el char el curso es igual al buscado, sumo
            if(cadena.charAt(i) == letra )
            {
                cont++;
            }
        }
         return cont;
    }
		
//	public static void main(String[] args) {
//		int veces = contarCaracter("Camperitooooo", 'o');
//		System.out.println(veces);
//		

	

	
	 /**2.1) HACER UN MÉTODO QUE RECIBA UNA CADENA Y UN CARACTER Y DIGA la última
	 * posición donde aparece ese caracter en esa cadena. Si no está, devuelve -1
	 * 
	 * "hola" a --> 3 "maja" a --> 3 "conejo" i --> -1*/
	
	 //LO HIZO EL PROFE
	public static int ultimaPosicionCaracter(String cadena, char c) {
		int posUltimo=-1;
		posUltimo= cadena.lastIndexOf(c);
		return posUltimo;
	}
	
	
	
	
/**    3) HACER UN MÉTODO QUE DADO UN NÚMERO, DIGA SI ES PAR O NO esPar*/
	    
	    public static boolean esPar(int numero) {
	        return (numero % 2 == 0);
	    }

//	    public static void main(String[] args) {
//	        int numero = 3;
//	        if (esPar(numero)) {
//	            System.out.println(numero + " es par.");
//	        } else {
//	            System.out.println(numero + " es impar.");
//	        }
//	    }
	    

   /** 4) HACER UN MÉTODO QUE LE PIDA AL USUARIO SU EDAD Y LE DIGA SI ES MAYOR DE
EDAD O NO mayorDeEdad */
	    
	    
	    public static boolean mayorEdad(int edad) {
	    	boolean es = false;
	    	if(edad>=18) {
	    		es=true;
	    		System.out.println("Si es mayor de edad");
		    	
	    	}
	    	return es;
	    }
	    
//	    public static void main(String[] args) {
//	    	boolean esONo = mayorEdad(19);
//	    	System.out.println(esONo);
//	    	
//	    }
	    
//	    LO HIZO EL PROFE
//	    public static void mayorDeEdad ()
//		{
//			Scanner scanner = null;
//			int edad = 0;
//			String mensaje = null;
//			
//				scanner = new Scanner(System.in);
//				System.out.println("Introduzca la edad");
//				edad = scanner.nextInt();
//				mensaje = (edad>=18) ? "MAYOR DE EDAD" : "MENOR DE EDAD";
//				System.out.println(mensaje);
//		}
	    
/**5) HACER UN MÉTODO QUE RECIBA UNA NOTA DE 0 A 10 Y DIGA
SI EQUIVALE A UN APROBADO, BIEN, NOTABLE, O SOBRESALIENTE clasificarNota*/
	    
	    public static String clasificaNota(int nota) {
	    	String notita=null;
	    	
	    	
	    	notita = switch(nota){
		    	case 0, 1, 2, 3, 4 ->"Suspenso";
		    	case 5 ->"Suficiente";
		    	case 6 ->"Bién";
		    	case 7,8 ->"Notable";
		    	case 9,10->"Sobresaliente";
		    	default ->"Error";
	    	};
	    	
	    return notita;
	    	
	    }
//	    public static void main(String[] args) {
//	    	String nota = clasificaNota(5);
//	    	System.out.println(nota);
//	    	
//	    }
	   /** 6) HACER UN MÉTODO QUE RECIBA UNA CADENA Y LA DEVUELVA ALREVÉS invertirCadena 
	    * */
	    
	    //LO HIZO EL PROFE
	    public static String invertirCadena (String cad)
	    {
			String cadreves = null;
			
				cadreves = new StringBuilder(cad).reverse().toString();
			
			return cadreves;
		}
		
	   /** 7) HACER UN PROGRAMA QUE MUESTRE LA SECUENCIA 3, 6, 9, 12, 15 ...99 deTresEnTres*/
	    
	  //LO HIZO EL PROFE
	    public static void mostrarSecuencia ()
		{
			for (int i=3; i<=99; i=i+3)//i+=3
			{
				System.out.print(i+", ");
			}
				
			
		}
		
	    //EJERCICIO DE LA MASA MOSCULAR
	    /**
	     * TODO
	     * HACED UNA APLICACIÓN QUE PERMITA INTRODUCIR AL USUARIO
	     * SU ESTATURA EN METROS Y SU PESO EN KG Y LE INFORME SU 
	     * INFORME DE SU ÍNDICE DE MASA CORPORAL (IMC) SEGÚN LA SIGUIENTE FÓRMULA
	     * 
	     * LA FÓRMULA DEL IMC = PESO KG / ESTATURA AL CUADRADO METROS
	     *  * SI IMC < 16 ->> su imc es DESNUTRIDO
	     * SI IMC >= 16 Y < 18  ->> su imc es DELGADO
	     * SI IMC >= 18 Y < 25  ->> su imc es IDEAL
	     * SI IMC >= 25 Y < 31  ->> su imc es SOBREPESO
	     * SI IMC >= 31 ->> su imc es OBESO
	     ADEMÁS, DE DECIRLE SU IMC NUMÉRICO Y NOMINAL,
	    pista: PARA LEER DE TECLADO USAD LA CLASE SCANNER
	      */
	    
	    
	    public static String calculaIndice(int estatura, int kg) {
	    		String IMC ="";
	    		
	    	    Scanner input = new Scanner(System.in);
	    	    double peso;
	    	    double altura;

	    	    System.out.print("Ingrese su altura en metros:");
	    	    peso = input.nextDouble();

	    	    System.out.print("Ingrese su peso en kilogramos ");
	    	    
	    	    altura = input.nextDouble();
	    	    
	    	    int imc= kg / (estatura * estatura);
	    	    
	    	    //IMC = switch(imc){
	    	    
//	    	    case 5, 4, 6->"su imc es DESNUTRIDO";
//		    	case imc >=16 && <18 -> "su imc es DELGADO";
//		    	case imc >=18 && < 25 ->"su imc es IDEAL";
//		    	case imc >=25 && < 31 ->"su imc es SOBREPESO";
//		    	case imc >=31->"su imc es OBESO";
//		    	default ->"Error";
//	    
	    	

	    	   
	    	    System.out.printf("Su índice de masa corporal es:\n", imc);
	    	    
	    	    return IMC;
	    	  }
	    	
		    public static void main(String[] args) {
		    	String IMC = calculaIndice(170,69);
		    	System.out.println(IMC);
		    	
	    	
	    
	    
}

}


