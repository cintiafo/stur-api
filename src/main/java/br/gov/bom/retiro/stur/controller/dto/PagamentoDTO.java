package br.gov.bom.retiro.stur.controller.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PagamentoDTO {
	
	private Long id;
	private BigDecimal valor;
	private String status;
	private String ano;
	private TipoPagamento tipo;
	private Long imovelId;

}
