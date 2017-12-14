package nl.rsvier.models.data;

import javax.transaction.Transactional;

import org.springframework.data.repository.*;
import org.springframework.stereotype.Repository;

import nl.rsvier.models.Klant;


@Repository
@Transactional
public interface KlantenDao extends CrudRepository<Klant, Integer> {

}
