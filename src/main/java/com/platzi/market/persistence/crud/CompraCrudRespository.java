package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CompraCrudRespository extends CrudRepository<Compra, Long> {
    Optional<List<Compra>> findByIdCliente(String clientId);
}

