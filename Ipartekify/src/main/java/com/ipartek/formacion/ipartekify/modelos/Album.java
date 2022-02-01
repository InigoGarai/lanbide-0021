package com.ipartek.formacion.ipartekify.modelos;

import java.time.Year;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class Album {
	private Long id;
	private String nombre;
	private Year anno;
	private String foto;
	
	private Set<Cancion> canciones = new LinkedHashSet<>();
	private Artista artista;
}