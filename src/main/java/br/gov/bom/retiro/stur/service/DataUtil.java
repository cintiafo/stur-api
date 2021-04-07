package br.gov.bom.retiro.stur.service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;

import br.gov.bom.retiro.stur.controller.dto.ImovelDTO;
import br.gov.bom.retiro.stur.controller.dto.PagamentoDTO;
import br.gov.bom.retiro.stur.controller.dto.TipoPagamento;

public class DataUtil {
	
	public static List<ImovelDTO> imoveis;
	public static List<PagamentoDTO> pagamentos;
	
	static {
		imoveis = new ArrayList<>();
		pagamentos = new ArrayList<>();
		
		long idPagamento = 0L;
			
		for (long id = 1L; id < 11; id++) {
			TipoPagamento tipo = id % 2 == 0 ? TipoPagamento.IPTU : TipoPagamento.ITR;
			
			imoveis.add(ImovelDTO.builder()
					.id(id)
					.endereco("Rua " + RandomStringUtils.random(5, true, false) + ", " + RandomStringUtils.random(3, false, true))
					.registro(RandomStringUtils.random(7, true, true))
					.tipo(id % 2 == 0 ? "Apartamento Padrão" : "Fazenda")
					.tipoPagamento(tipo)
					.build());
			
			for (int i = 1; i < 6; i++) {
				String ano = String.valueOf(2016 + i);
				
				idPagamento++;
				pagamentos.add(PagamentoDTO.builder()
							.id(idPagamento)
							.ano(ano)
							.status(ano.equals("2021") ? "Em Aberto" : "Pago")
							.tipo(tipo)
							.imovelId(id)
							.valor(BigDecimal.valueOf(300).multiply(BigDecimal.valueOf(Double.valueOf("1." + i))))
							.build());
			}
		}
		
	}
	
}

