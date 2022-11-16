package br.com.projetocrypto.crypto.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.projetocrypto.crypto.api.Service.CryptoService;
import br.com.projetocrypto.crypto.api.entity.Crypto;

@RestController
@RequestMapping("/v1/cryptos")
public class CryptoController {
	
	@Autowired
	private CryptoService cryptoService;
	
	@RequestMapping(path = "", method = RequestMethod.GET)
	public List<Crypto> getCryptos() throws Exception {
		return cryptoService.getAllCryptos();
	}
}
