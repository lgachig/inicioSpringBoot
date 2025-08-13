package uce.edu.ec.iniciospringboot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uce.edu.ec.iniciospringboot.Model.Libros;

@Repository
public interface LibrosRepository extends JpaRepository<Libros, Integer> {
}
