package br.edu.utfpr.pb.pw25s.aula2.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/*
@Data - Serve para implementar todos os metodos para todos os atributos da classe
@Entity - Serve para dizer que a classe vai ser persistida
@AllArgsConstructor - Serve para gerar construtor para todos os atributos com parametro
@NoArgsConstructor - Serve para gerar construtor para todos os atributos sem parametro
@Getter @Setter -  Serve para gerar e setter para cada atribudo que ele estiver
 */

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String descricao;	

}
