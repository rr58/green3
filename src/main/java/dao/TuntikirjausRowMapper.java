package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import bean.Tuntikirjaus;

public class TuntikirjausRowMapper implements RowMapper<Tuntikirjaus> {

	public Tuntikirjaus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Tuntikirjaus tk = new Tuntikirjaus();
		tk.setHlo_id(rs.getString("hlo_id"));
		tk.setHlo_etunimi(rs.getString("hlo_etunimi"));
		tk.setHlo_sukunimi(rs.getString("hlo_sukunimi"));
		tk.setHlo_tunnit(rs.getInt("hlo_tunnit"));
		tk.setHlo_pvm(rs.getString("hlo_pvm"));
		return tk;
	}

}
