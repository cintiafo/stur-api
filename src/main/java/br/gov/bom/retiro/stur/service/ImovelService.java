package br.gov.bom.retiro.stur.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.bom.retiro.stur.controller.dto.ImovelDTO;
import br.gov.bom.retiro.stur.controller.dto.TipoPagamento;

@Service
public class ImovelService {
	
	public ImovelDTO find(Long id) {
		return ImovelDTO.builder()
				.id(id)
				.endereco("Rua A")
				.registro("ABCD123")
				.tipo("Apartamento Padrão")
				.tipoPagamento(TipoPagamento.IPTU)
				.build();
	}

	public List<ImovelDTO> listarPorPessoa(String tipoPessoa, String identificador) {
		return Arrays.asList(ImovelDTO.builder()
				.id(1L)
				.endereco("Rua A")
				.registro("ABCD123")
				.tipo("Apartamento Padrão")
				.tipoPagamento(TipoPagamento.IPTU)
				.build());
	}
}
