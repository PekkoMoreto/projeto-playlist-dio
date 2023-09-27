package dio.projetoplaylist.service;

import dio.projetoplaylist.model.Musica;

import java.util.List;

public interface MusicaService {
    public List<Musica> getMusicas(String musicaType);
    public Musica getMusica(Long id);
    public void postMusica(Musica musica);
    public void deleteMusica(Long id);
}
