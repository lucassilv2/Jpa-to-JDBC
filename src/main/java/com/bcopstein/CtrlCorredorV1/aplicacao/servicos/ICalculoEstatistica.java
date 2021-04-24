package com.bcopstein.CtrlCorredorV1.aplicacao.servicos;

import com.bcopstein.CtrlCorredorV1.aplicacao.dtos.EstatisticasDTO;
import org.springframework.stereotype.Service;

@Service
public interface ICalculoEstatistica {
    EstatisticasDTO calculaEstatisticas(int distancia);
}
