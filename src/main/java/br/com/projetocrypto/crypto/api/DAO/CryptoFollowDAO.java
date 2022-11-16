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
import br.com.projetocrypto.crypto.api.entity.CryptoFollow;

@Service
public class CryptoFollowDAO {
	
	@Autowired
	private Config config; 
	
	public Long createCrypto(CryptoFollow crypto) throws Exception {
		PreparedStatement prepStat = null;
		ResultSet rs = null;
		Connection conn = null;
		
		try {
			conn = ConexaoUtil.getDataSource(config).getConnection();
			StringBuilder sql = new StringBuilder();
				sql.append("*INSERT INTO crypto_follow(crypto_id,higher_target_price,lower_target_price)VALUES(?,?,?)");
				
				prepStat = conn.prepareStatement(sql.toString(),PreparedStatement.RETURN_GENERATED_KEYS);
				
				prepStat.setInt(1,crypto.getCrptoId());
				prepStat.setDouble(2,crypto.getHigherTargetPrice());
				prepStat.setDouble(3,crypto.getLowerTargetPrice());
				
				
				rs =prepStat.executeQuery();
				rs=prepStat.getGeneratedKeys();
				if(rs.next()) {
					return (long) 1 ;
				}
						
				return null;
			
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
