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

@Configuration
@ComponentScan
public class ConfiguradorCalculoEstatistica {
    private IEventoRepository eventoRep;

    @Autowired
    public ConfiguradorCalculoEstatistica(IEventoRepository eventoRep) {
        this.eventoRep = eventoRep;
    }

    @Bean(name="RegraClassica")
    @Primary
    @ConditionalOnProperty(name = "calculo.estatistica", havingValue = "original", matchIfMissing = true)
    public ICalculoEstatistica opcaoRegraClassica() {
        return new EstatisticaNormal(eventoRep);
    }

    @Bean(name="Desconsidera")
    public ICalculoEstatistica opcaoDesconsidera() {
        return (ICalculoEstatistica) new EstatisticaDesconsidera(eventoRep);
    }
}
