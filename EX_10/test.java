package test;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class test {

	public static void main(String[] args) {
		
		String pelicula;
		
		Set<String> peliculas = new HashSet <String>();
		peliculas.add("El señor de los anillos");
		peliculas.add("Titanic");
		peliculas.add("Avatar");
		
		Iterator<String> it = peliculas.iterator();
		
		while(it.hasNext()) {
		pelicula = it.next();
		System.out.println( pelicula );
		}
		
		for (String pel: peliculas)
			System.out.println("Titulo: " + pel);
		}
		
	}