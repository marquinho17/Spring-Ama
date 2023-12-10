package com.demoama.ama01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demoama.ama01.repository.Repositorio;
import com.demoama.ama01.model.Usuario;


@Controller
public class ControleUsuarios {
    
    @GetMapping("/usuario")
    public String usuario(){
        return "usuario";
    }

    @Autowired
    private Repositorio acaoUser;

    @GetMapping("/listaUsuario")
    public ModelAndView listarUsuario(){

        ModelAndView mv = new ModelAndView("listaUsuario");
        Iterable<Usuario> listaUsuario = acaoUser.findAll();

        mv.addObject("listaUsuario", listaUsuario);
        return mv;
    }

    List<Usuario> listaUsuario = new ArrayList<>();
    
    @PostMapping("/usuario")
    public String user(@RequestParam String nome, 
                       @RequestParam String telefone, 
                       @RequestParam String cpf, 
                       @RequestParam String rua, 
                       @RequestParam String bairro, 
                       @RequestParam String cidade, 
                       @RequestParam String numero, 
                       @RequestParam String nomeCompleto){

        Usuario usuaria = new Usuario();

        usuaria.setNome(nome);
        usuaria.setTelefone(telefone);
        usuaria.setCpf(cpf);
        usuaria.setRua(rua);
        usuaria.setBairro(bairro);
        usuaria.setCidade(cidade);
        usuaria.setNumero(numero);
        usuaria.setNomeCompleto(nomeCompleto);

        acaoUser.save(usuaria);

        return "redirect:/listaUsuario";
    }

}
