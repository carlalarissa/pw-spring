package br.edu.utfpr.pb.pw25s.aula1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("produto")
public class ProdutoController {

	@GetMapping()
	@ResponseBody
	public String getProdutos() {
		return "Produto 1, 2, 3...";
	}
	
	@GetMapping("1")
	@ResponseBody
	public String getProduto() {
		return "Produto 1";
	}
}
