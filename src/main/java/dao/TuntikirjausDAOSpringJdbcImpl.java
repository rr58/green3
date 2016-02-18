package dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import bean.Tuntikirjaus;
import dao.TuntikirjausDAO;
import dao.TuntikirjausRowMapper;

public class TuntikirjausDAOSpringJdbcImpl implements TuntikirjausDAO {

	
	private JdbcTemplate jdbcTemplate;	
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}	

	//   getHlo_etunimi()
	//   getHlo_etunimi()
	
	public void talleta(Tuntikirjaus tk) {
//		System.out.println("viesti tuntikirjausdaoSpringjdbclimpl.java talleta(Tuntikirjaus tk)");
		
		String sql = "insert into henkilo(hlo_id, hlo_etunimi, hlo_sukunimi, hlo_tunnit) values(?,?,?,?)";

		Object[] parametrit = new Object[] { tk.getHlo_id(), tk.getHlo_etunimi(), tk.getHlo_sukunimi(), tk.getHlo_tunnit() };
		
//		System.out.println("viesti Object parameters kohdasta" + tk.getHlo_etunimi() + tk.getHlo_sukunimi());
		jdbcTemplate.update(sql, parametrit);
	}

	public Tuntikirjaus etsi(int hlo_id) {
		String sql = "select hlo_id, hlo_etunimi, hlo_sukunimi, hlo_tunnit, hlo_pvm from henkilo where hlo_id = ?";
		Object[] parametrit = new Object[] { hlo_id };
		RowMapper<Tuntikirjaus> mapper = new TuntikirjausRowMapper();

		Tuntikirjaus tk = jdbcTemplate.queryForObject(sql, parametrit, mapper);
		return tk;

	}
	
	public List<Tuntikirjaus> haeKaikki() {

		String sql = "select hlo_id, hlo_etunimi, hlo_sukunimi, hlo_tunnit, hlo_pvm from henkilo";
		RowMapper<Tuntikirjaus> mapper = new TuntikirjausRowMapper();
		List<Tuntikirjaus> tuntikirjaukset = jdbcTemplate.query(sql, mapper);

		return tuntikirjaukset;
	}
}
