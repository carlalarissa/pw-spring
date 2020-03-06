package br.edu.utfpr.pb.pw25s.aula2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.utfpr.pb.pw25s.aula2.model.Categoria;

// JpaRepository facilita para persistir dados
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
