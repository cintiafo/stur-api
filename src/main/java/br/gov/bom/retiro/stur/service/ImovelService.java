package br.gov.bom.retiro.stur.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.gov.bom.retiro.stur.controller.dto.ImovelDTO;

@Service
public class ImovelService {
	
	
	public ImovelDTO find(Long id) {
		return DataUtil.imoveis.stream().filter(i -> i.getId().equals(id)).findFirst().orElse(null);
	}

	public List<ImovelDTO> listarPorPessoa(String tipoPessoa, String identificador) {
		return DataUtil.imoveis;
	}
	
}
