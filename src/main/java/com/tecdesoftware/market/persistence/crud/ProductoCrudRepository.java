package com.tecdesoftware.market.persistence.crud;

import com.tecdesoftware.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

// Métodos abstractos que en otras clases se implementarán mejor.
public interface ProductoCrudRepository extends CrudRepository<Producto, Long> {

}
