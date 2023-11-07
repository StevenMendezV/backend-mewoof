package com.example.mewoofBCK.Repository;

import com.example.mewoofBCK.Entity.NecesidadesDinero;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NecesidadDineroRepository extends ListCrudRepository<NecesidadesDinero, Integer> {

}
