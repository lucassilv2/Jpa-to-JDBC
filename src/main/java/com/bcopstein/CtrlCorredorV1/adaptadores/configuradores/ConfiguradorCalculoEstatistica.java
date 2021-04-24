package com.bcopstein.CtrlCorredorV1.adaptadores.configuradores;

import com.bcopstein.CtrlCorredorV1.aplicacao.servicos.EstatisticaDesconsidera;
import com.bcopstein.CtrlCorredorV1.aplicacao.servicos.EstatisticaNormal;
import com.bcopstein.CtrlCorredorV1.aplicacao.servicos.ICalculoEstatistica;
import com.bcopstein.CtrlCorredorV1.negocio.repositorios.IEventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan
@EnableJpaRepositories
public class ConfiguradorCalculoEstatistica {
    private IEventoRepository eventoRep;

    @Autowired
    public ConfiguradorCalculoEstatistica(IEventoRepository eventoRep) {
        this.eventoRep = eventoRep;
    }
}
