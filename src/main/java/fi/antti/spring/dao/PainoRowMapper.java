package fi.antti.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import fi.antti.spring.bean.Paino;


public class PainoRowMapper implements RowMapper<Paino> {

	public Paino mapRow(ResultSet rs, int rowNum) throws SQLException {
		Paino p = new Paino();
		p.setAikaleima(rs.getString("aikaleima"));
		p.setPaino(rs.getDouble("paino"));
		p.setId(rs.getInt("id"));
		
		return p;
	}

}
