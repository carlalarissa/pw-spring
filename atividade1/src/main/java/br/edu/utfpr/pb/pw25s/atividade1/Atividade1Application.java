package br.edu.utfpr.pb.pw25s.atividade1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.edu.utfpr.pb.pw25s.atividade1.model.Autor;
import br.edu.utfpr.pb.pw25s.atividade1.model.Cidade;
import br.edu.utfpr.pb.pw25s.atividade1.model.Editora;
import br.edu.utfpr.pb.pw25s.atividade1.model.Genero;
import br.edu.utfpr.pb.pw25s.atividade1.model.Livro;


@SpringBootApplication
public class Atividade1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Atividade1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Autor a1 = new Autor();
		a1.setNome("Autor Teste");
		
		Cidade c1 = new Cidade();
		c1.setNome("Cidade Teste");
		
		Editora e1 = new Editora();
		e1.setNome("Editora Teste");
		
		Genero g1 = new Genero();
		g1.setDescricao("Genero Teste");
		
		Livro l1 = new Livro();
		l1.setTitulo("Livro Teste");
		l1.setIsbn(1243456L);
		l1.setAno(2019);
		l1.setAutor(a1);
		l1.setCidade(c1);
		l1.setEditora(e1);
		l1.setGenero(g1);
		l1.setValor(200.00);
	}
}
