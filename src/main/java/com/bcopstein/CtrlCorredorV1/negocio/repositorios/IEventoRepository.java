package com.bcopstein.CtrlCorredorV1.negocio.repositorios;

import com.bcopstein.CtrlCorredorV1.negocio.entidades.Corredor;
import java.util.List;

import com.bcopstein.CtrlCorredorV1.negocio.entidades.Evento;
import org.springframework.data.repository.CrudRepository;

public interface IEventoRepository extends CrudRepository<Corredor, String> {
    List<Evento> todos();
    boolean cadastra(Evento evento);
}
