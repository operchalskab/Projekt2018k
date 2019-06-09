package pl.edu.wszib.projekt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import pl.edu.wszib.projekt.domain.Climber;

import java.util.List;

@Repository
public interface ClimberDao extends CrudRepository<Climber,Integer> {

//    List<Climber> findAll();

}

