package br.com.projetocrypto.crypto.api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetocrypto.crypto.api.DAO.CryptosDAO;
import br.com.projetocrypto.crypto.api.entity.Crypto;

@Service
public class CryptoService {
	
	@Autowired
	private CryptosDAO cryptosDAO;
	
	public List<Crypto> getAllCryptos() throws Exception {
		return cryptosDAO.getAllCryptos();
	}
}
