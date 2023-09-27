package dio.projetoplaylist.controller;

import dio.projetoplaylist.model.Musica;
import dio.projetoplaylist.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@ComponentScan("dio.projetoplaylist.repository")
@RequestMapping("/musicas")
public class MusicaController {
    @Autowired
    private MusicaRepository musicaRepository;

    @GetMapping
    public List<Musica>mostrarTodasAsMusicas(){
        return musicaRepository.findAll();
    }

    @PostMapping
    public Musica adicionarMusica(@RequestBody Musica musica){
        return musicaRepository.save(musica);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarMusica(@PathVariable Long id){
        musicaRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
