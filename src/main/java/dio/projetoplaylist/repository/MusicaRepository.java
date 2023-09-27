package dio.projetoplaylist.repository;

import dio.projetoplaylist.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public interface MusicaRepository extends JpaRepository<Musica, Long> {

}
