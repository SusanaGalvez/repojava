package basicos;

public class PruebaTest {

	public static void main(String[] args) {
		System.out.println("HOLA MÁLAGA");
		
		//for (int a=0; (a%6)<6; a++)
		//{
		//System.out.println (a);
		//}
		
		Object cadena = "HOLA";
		
		if(cadena instanceof String saludo) //matern matching
			{
			saludo.length();
			String palabra = (String)cadena;
			int longi = palabra.length();
			System.out.println ("Cadena es un string");
			}else {
			System.out.println ("Cadena no es un string");
		}

	}
}
