package com.bcopstein.CtrlCorredorV1.negocio.repositorios;

import java.util.List;

import com.bcopstein.CtrlCorredorV1.negocio.entidades.Corredor;
import org.springframework.data.repository.CrudRepository;

public interface ICorredorRepository extends CrudRepository<Corredor, String> {
    List<Corredor> todos();
    void removeTodos();
    boolean cadastra(Corredor corredor);
}
