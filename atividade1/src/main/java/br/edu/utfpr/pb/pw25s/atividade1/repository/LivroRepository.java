package br.edu.utfpr.pb.pw25s.atividade1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.pw25s.atividade1.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {

//	1. Retornar os Livros pesquisando por parte do nome do autor e 
//	ordenando por ano.
//	List<Livro> findByNomeLikeOrderByAnoDesc(String nome);
	
//	2. Retornar os livros filtrando por ano.
//	List<Livro> findByAnoEqual(Integer ano);
//	
////	3. Retornar os livros filtrando pela descrição do
////	gênero e ordenando por ano.
//	List<Livro> findByGeneroDescricaoContains(String genero);
//	
////	4. Retornar os livros filtrando a mesma string pelo ISBN ou Título e 
////	ordenar por ano
//	List<Livro> findByIsbnContainsOrTituloContainsOrderByAnoDesc(String isbn, String titulo);
//	
////	5.Retornar os livros com valores maiores que...
//	List<Livro> findByValorGreaterThan(Double valor);
//	
////	6. Retornar os livros com valores entre A* e B* ordenados por ano
//	List<Livro> findByValorBetweenOrderByAnoDesc(Double valor1, Double valor2);
//	
}
