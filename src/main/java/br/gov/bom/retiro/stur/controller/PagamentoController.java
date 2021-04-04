package br.gov.bom.retiro.stur.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.gov.bom.retiro.stur.controller.dto.PagamentoDTO;
import br.gov.bom.retiro.stur.service.PagamentoService;

@RestController
@RequestMapping(path = "/pagamentos", produces=MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class PagamentoController {
	
	private PagamentoService service;
	
	public PagamentoController(PagamentoService service){
		this.service = service;
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<PagamentoDTO> get(@PathVariable(required = true) Long id) {
        return ResponseEntity.ok(service.find(id));
    }
	
	@GetMapping("/listarPorImovel")
    public ResponseEntity<List<PagamentoDTO>> listarPorImovel(@RequestParam(required = true) Long imovelId){
		return new ResponseEntity<List<PagamentoDTO>>(service.listarPorImovel(imovelId), HttpStatus.OK);
    }
	

}
