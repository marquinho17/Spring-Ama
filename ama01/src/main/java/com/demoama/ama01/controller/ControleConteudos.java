package com.demoama.ama01.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demoama.ama01.model.Conteudos;
import com.demoama.ama01.repository.RepositorioC;


@Controller
public class ControleConteudos {
    
    @Autowired
    private RepositorioC acaoCont;

    @GetMapping("/listaCont")
    public ModelAndView listarConteudo(){

        ModelAndView mv = new ModelAndView("listaCont");
        Iterable<Conteudos> listaCont = acaoCont.findAll();

        mv.addObject("listaCont", listaCont);
        return mv;
    }

    List<Conteudos> listaCont = new ArrayList<>();

    public String cont(){

       Conteudos cont1 = new Conteudos();
       
       cont1.setNomeC("Amelia");

       acaoCont.save(cont1);

       return "direct:/listaCont";
    }
    
}
