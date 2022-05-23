package controllers;

import java.util.ArrayList;

public class ProcessaManutencoes {

	public static ArrayList<Manutencao> manutencoes = new ArrayList<>();
	private static ManutencaoDAO md = new ManutencaoDAO();
	
	public static void salvar() {
		manutencoes = md.ler
	}
		
	public static void abrir() {
		manutencoes = md.escrever
	}
}
