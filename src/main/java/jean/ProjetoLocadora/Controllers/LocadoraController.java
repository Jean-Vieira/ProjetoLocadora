package jean.ProjetoLocadora.Controllers;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jean.ProjetoLocadora.Models.Filmes;
import jean.ProjetoLocadora.Repositories.FilmesRepository;
import jean.ProjetoLocadora.Services.FilmesService;

@Controller
public class LocadoraController {
	
	@RequestMapping("/index")
	public String index() {
		return "index";
		
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
		
	}
	
	@RequestMapping("/formAdmin")
	public String formAdmin() {
		return "formAdmin";
		
	}
	
	@RequestMapping("/formClientes")
	public String formClientes() {
		return "formClientes";
		
	}
	
	@RequestMapping("/formFilmes")
	public String formFilmes() {
		return "formFilmes";
		
	}
	
	@RequestMapping("/formLocacoes")
	public String formLocacoes() {
		return "formLocacoes.html";
		
	}
	@RequestMapping("/locacoes")
	public String locacoes() {
		return "locacoes";
		
	}

	private FilmesService filmesService;
	
	public LocadoraController(FilmesService filmesService) {
		this.filmesService = filmesService;
	}

	@GetMapping("/listarFilmes")
	public String listarFilmes(Model model) {
		
		model.addAttribute("filmes", filmesService.ListarTodos());
		
		return "listarFilmes";
	}
	
	@GetMapping("/listarClientes")
	public String listarClientes(Model model) {
		
		model.addAttribute("filmes", filmesService.ListarTodos());
		
		return "listarFilmes";
	}
	
	/*@GetMapping("/novo")
	public String novo(Model model) {
		model.addAttribute("filmes", new Filmes());
		return "texto";
		
	}*/
	
	@PostMapping("/salvar")
	public String salvar(Filmes filmes){
		filmesService.salvar(filmes);
		return "/formFilmes";
	}
	

}
