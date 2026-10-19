package com.example.demo.controller;

import com.example.demo.model.Musica;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MusicaController {
    List<Musica> musicas = new ArrayList<>();
    public MusicaController() {
        musicas.add(new Musica(1, "Pássaro de Fogo", "Paula Fernandes", 4, "Sertanejo"));
        musicas.add(new Musica(2, "My Way", "Frank Sinatra", 6, "Pop Americano"));
        musicas.add(new Musica(3, "Numb", "Linkin Park", 5, "Rock"));
    }

    @GetMapping("/primeiramusica")
    public Musica obterPrimeiraMusica(){
        return musicas.get(0);
    }

    @GetMapping("/listarmusicas")
    public List<Musica> obterListaMusicas(){
        return  musicas;
    }
}
