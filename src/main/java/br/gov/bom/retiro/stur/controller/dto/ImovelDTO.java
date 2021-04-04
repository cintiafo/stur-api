package br.gov.bom.retiro.stur.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImovelDTO {

	private Long id;
	private PessoaDTO pessoa;
	private String registro;
	private String tipo;
	private String endereco;
	private TipoPagamento tipoPagamento;
}
