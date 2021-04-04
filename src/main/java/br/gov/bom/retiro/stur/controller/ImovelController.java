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

import br.gov.bom.retiro.stur.controller.dto.ImovelDTO;
import br.gov.bom.retiro.stur.service.ImovelService;

@RestController
@RequestMapping(path = "/imoveis", produces = MediaType.APPLICATION_JSON_VALUE)
@CrossOrigin(origins = "*")
public class ImovelController {
	
	private ImovelService service;
	
	public ImovelController(ImovelService service){
		this.service = service;
	}
	
	@GetMapping("/{id}")
    public ResponseEntity<ImovelDTO> get(@PathVariable(required = true) Long id) {
        return ResponseEntity.ok(service.find(id));
    }
	
	@GetMapping("/listarPorPessoa")
    public ResponseEntity<List<ImovelDTO>> listarPorPessoa(@RequestParam(required = true) String tipoPessoa, @RequestParam(required = true) String identificador) {
        return new ResponseEntity<List<ImovelDTO>>(service.listarPorPessoa(tipoPessoa, identificador), HttpStatus.OK);
    }
	
}
