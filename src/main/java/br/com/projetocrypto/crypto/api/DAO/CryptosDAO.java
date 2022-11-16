package br.com.projetocrypto.crypto.api.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.projetocrypto.crypto.api.Config;
import br.com.projetocrypto.crypto.api.config.ConexaoUtil;
import br.com.projetocrypto.crypto.api.entity.Crypto;

@Service
public class CryptosDAO {
	
	@Autowired
	private Config config; 
	
	public List<Crypto> getAllCryptos() throws Exception {
		PreparedStatement prepStat = null;
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			conn = ConexaoUtil.getDataSource(config).getConnection();
			StringBuilder sql = new StringBuilder();
				sql.append("SELECT id,code, name FROM crypto order by name");
				
				prepStat = conn.prepareStatement(sql.toString());
				
				rs =prepStat.executeQuery();
				
				List<Crypto> cryptos = new ArrayList<Crypto>();
				
				while(rs.next()) {
					Crypto crypto = new Crypto();
					crypto.setId(rs.getInt("id"));
					crypto.setName(rs.getString("name"));
					crypto.setCode(rs.getString("code"));
					cryptos.add(crypto);
					
				}
				
				return cryptos;
			
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally {
			if(rs!=null){
				try {
					rs.close();					
				} catch (Exception e) {
					
				}
			}
			
			if(conn != null) {
				try {
					conn.close();
				}catch (Exception e) {
					
				}
			}
		}
		
		
	}
}
