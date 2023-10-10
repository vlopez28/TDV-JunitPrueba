package tudai.tdv.junit.test;

import tudai.tdv.java.Padron;
import tudai.tdv.java.Persona;
import tudai.tdv.java.PersonaNoEncontradaException;
import tudai.tdv.java.YaVotoException;


public class SmokeTest {

	public static void main(String[] args) {
	
		Padron padron = new Padron();
		
		Persona p1 = new Persona("Juan", "26.150.235", "1979-01-01", 42, true);
		Persona p2 = new Persona("Pedro", "27.280.234", "1980-02-01", 41, true);
		Persona p3 = new Persona("María", "28.184.259", "1981-03-01", 47, true);
		Persona p4 = new Persona("Cecilia", "32.234.528", "1983-04-01", 38, true);
		Persona p5 = new Persona("Carlos", "33.124.235", "1985-04-01", 36, true);
		Persona p6 = new Persona("Jose", "35.345.534", "1987-04-01", 34, true);

		padron.AddVotante(p1);
		padron.AddVotante(p2);
		padron.AddVotante(p3);
		padron.AddVotante(p4);
		padron.AddVotante(p5);
		padron.AddVotante(p6);
		
		System.out.println(p1.getEdad());
		
		try {
			padron.setVoto("26.150.235");
		} catch(YaVotoException | PersonaNoEncontradaException e){
			e.printStackTrace();
		}
		//hago votar una persona que no existe
		
		try {
			padron.setVoto("26.150.3235");
		} catch(YaVotoException | PersonaNoEncontradaException e){
			e.printStackTrace();
		}
		
		//lo hago votar de vuelta
		try {
			padron.setVoto("26.150.235");
		} catch(YaVotoException | PersonaNoEncontradaException e){
			e.printStackTrace();
		}
		
		
	}

}
