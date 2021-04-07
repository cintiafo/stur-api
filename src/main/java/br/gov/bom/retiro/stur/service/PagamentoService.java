package br.gov.bom.retiro.stur.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import br.gov.bom.retiro.stur.controller.dto.PagamentoDTO;

@Service
public class PagamentoService {
	
	public PagamentoDTO find(Long id) {
		return DataUtil.pagamentos.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
	}

	public List<PagamentoDTO> listarPorImovel(Long imovelId) {
		return DataUtil.pagamentos.stream()
						.filter(i -> i.getImovelId().equals(imovelId))
						.collect(Collectors.toList());
	}
	
}
