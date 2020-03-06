package br.edu.utfpr.pb.pw25s.aula1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	
public class IndexController {
// @controller é anotação para dizer que class recebe requisições http
//	é necessário passar o caminho onde ele responde
	
	@GetMapping
	@ResponseBody
	public String index() {
		return "hello world!";
	}
	
	@GetMapping("teste")
	@ResponseBody
	public String teste() {
		return "agora é o teste";
	}
	
	@GetMapping("sobre")
	@ResponseBody
	public String sobre() {
		return "disciplina de pw";
	}
	
}
