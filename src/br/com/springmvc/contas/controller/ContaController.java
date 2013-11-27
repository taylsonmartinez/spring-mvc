package br.com.springmvc.contas.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.springmvc.contas.dao.ContaDAO;
import br.com.springmvc.contas.modelo.Conta;

@Controller
public class ContaController {

	@RequestMapping("form")
	private String formulario() {
		return "conta/formulario";
	}
	
	@RequestMapping("/adicionaConta")
	public String adiciona(Conta conta){
		ContaDAO dao = new ContaDAO();
		System.out.println("Conta adicionada é: " + conta.getDescricao());
		dao.adiciona(conta);
		return "conta/conta-adicionada";
	}
	
	@RequestMapping("/listaContas")
	public ModelAndView lista(){
		
		ContaDAO dao = new ContaDAO();
		List<Conta> contas = dao.lista();
		
		ModelAndView mv = new ModelAndView("conta/lista");
		mv.addObject("todasContas", contas);
		
		return mv;
	}
}
