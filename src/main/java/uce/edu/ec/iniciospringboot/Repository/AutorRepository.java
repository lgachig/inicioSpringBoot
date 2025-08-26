package uce.edu.ec.iniciospringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uce.edu.ec.iniciospringboot.Model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {
}
