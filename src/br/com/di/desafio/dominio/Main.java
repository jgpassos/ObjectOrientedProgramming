package br.com.di.desafio.dominio;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		curso1.setTitulo("Java");
		curso1.setDescricao("Linguagem de programa��o");
		curso1.setCargaHoraria(20);
		
		Curso curso2 = new Curso();
		curso2.setTitulo("PHP");
		curso2.setDescricao("Linguagem de programa��o");
		curso2.setCargaHoraria(10);
		
//		System.out.println(curso1);
//		System.out.println(curso2);
		
		Conteudo conteudo = new Curso();
		
		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria de Java");
		mentoria.setDescricao("Professor Carlos");
		mentoria.setData(LocalDate.now());
		
//		System.out.println(mentoria);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Code Girls");
		bootcamp.setDescricao("Bootcamp de Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);
		
		Dev dev1 = new Dev();
		dev1.setNome("Julia");
		dev1.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Julia: " + dev1.getConteudosInscritos());
		System.out.println("Conte�dos Concluidos Julia: " + dev1.getConteudosConcluidos());
		
		
		Dev dev2 = new Dev();
		dev2.setNome("Camila");
		dev2.inscreverBootcamp(bootcamp);
		System.out.println("Conte�dos Inscritos Camila: " + dev2.getConteudosInscritos());
	}

}
