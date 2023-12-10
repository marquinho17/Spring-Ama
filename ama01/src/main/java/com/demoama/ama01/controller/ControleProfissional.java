package com.demoama.ama01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demoama.ama01.model.Profissionais;
import com.demoama.ama01.repository.RepositorioP;

@Controller
public class ControleProfissional {
    @GetMapping("/profissionais")
    public String profissionais(){
        return "profissionais";
    }

    @Autowired
    private RepositorioP acaoProf;

    @GetMapping("/listaProf")
    public ModelAndView listarProf(){

        ModelAndView mp = new ModelAndView("listaProf");
        Iterable<Profissionais> listaProf = acaoProf.findAll();

        mp.addObject("listaProf", listaProf);
        return mp;
    }

    List<Profissionais> listaProf = new ArrayList<>();

    @PostMapping("/profissionais")
    public String prof(@RequestParam String nome, 
                       @RequestParam String profissao,
                       @RequestParam String telefone, 
                       @RequestParam String cpf, 
                       @RequestParam String rua, 
                       @RequestParam String bairro, 
                       @RequestParam String cidade, 
                       @RequestParam String premium,
                       @RequestParam String numero, 
                       @RequestParam String estrelas,
                       @RequestParam String imagem){

        Profissionais prof = new Profissionais();

        prof.setNome(nome);
        prof.setProfissao(profissao);
        prof.setTelefone(telefone);
        prof.setCpf(cpf);
        prof.setRua(rua);
        prof.setBairro(bairro);
        prof.setCidade(cidade);
        prof.setPremium(premium);
        prof.setNumero(numero);
        prof.setEstrelas(estrelas);
        prof.setImagem(imagem);

        acaoProf.save(prof);

        return "redirect:/listaProf";
    }
}
