package com.studing.latanks.me.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primeiraRota")
public class FirstController {

    /*
    * Metodos HTTP:
    * GET - Buscar uma informação
    * POST - Criar uma nova informação
    * PUT - Atualizar uma informação
    * DELETE - Deletar uma informação
    * PATCH - Atualizar uma informação específica
    
    */

    @GetMapping("/")
    public String helloWorld() {
        return "Hello World!";
    }
}