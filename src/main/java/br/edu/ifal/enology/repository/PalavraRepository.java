package br.edu.ifal.enology.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.edu.ifal.enology.model.Conteudo;
import br.edu.ifal.enology.model.Palavra;

public interface PalavraRepository extends CrudRepository<Palavra, Long> {

    List<Palavra> findByConteudos(Conteudo conteudo);
    List<Palavra> findAll();
}
