package br.com.gabrielcaio.ConsultasPersonalizadas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gabrielcaio.ConsultasPersonalizadas.entities.Livro;
import br.com.gabrielcaio.ConsultasPersonalizadas.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
    
    @Autowired
    private LivroService livroService;
    
    @GetMapping
    public List<Livro> listarTodos() {
        return livroService.listarTodos();
    }
    
    @GetMapping("/titulo/{titulo}")
    public List<Livro> encontrarPorTitulo(@PathVariable String titulo) {
        return livroService.encontrarPorTitulo(titulo);
    }
    
    @GetMapping("/autor/{autor}")
    public List<Livro> encontrarPorAutor(@PathVariable String autor) {
        return livroService.encontrarPorAutor(autor);
    }
    
    @GetMapping("/ano/{ano}")
    public List<Livro> encontrarPorAno(@PathVariable Integer ano) {
        return livroService.encontrarPorAno(ano);
    }
    
    @GetMapping("/quantidadeDeLivrosPorAno/{ano}")
    public Long quantidadeDeLivrosPorAno(@PathVariable Integer ano) {
        return livroService.quantidadeDeLivrosPorAno(ano);
    }
}
