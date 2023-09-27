package dio.projetoplaylist.service.impl;

import dio.projetoplaylist.model.Musica;
import dio.projetoplaylist.repository.MusicaRepository;
import dio.projetoplaylist.service.MusicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MusicaServiceImpl implements MusicaService {
    @Autowired
    private MusicaRepository musicaRepository;

    public List<Musica> getMusicas(String musicaType){
        return musicaRepository.findAll();
    }

    public Musica getMusica(Long id){
        return musicaRepository.getById(id);
    }

    public void postMusica(Musica musica){
        musicaRepository.save(musica);
    }

    public void deleteMusica(Long id){
        Musica musicaASerDeletada =  musicaRepository.getById(id);
        musicaRepository.delete(musicaASerDeletada);
    }
}
