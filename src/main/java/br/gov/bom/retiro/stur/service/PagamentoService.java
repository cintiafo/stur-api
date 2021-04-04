package br.gov.bom.retiro.stur.service;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.bom.retiro.stur.controller.dto.PagamentoDTO;
import br.gov.bom.retiro.stur.controller.dto.TipoPagamento;

@Service
public class PagamentoService {
	
	public PagamentoDTO find(Long id) {
		return PagamentoDTO.builder()
				.id(id)
				.ano("2021")
				.status("Quitado")
				.tipo(TipoPagamento.IPTU)
				.valor(BigDecimal.valueOf(457.90))
				.build();
	}

	public List<PagamentoDTO> listarPorImovel(Long imovelId) {
		// TODO implementar
		return Arrays.asList(PagamentoDTO.builder()
				.id(1l)
				.ano("2021")
				.status("Quitado")
				.tipo(TipoPagamento.IPTU)
				.valor(BigDecimal.valueOf(457.90))
				.build());
	}
}
