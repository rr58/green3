package bean;

public class Tuntikirjaus {
	
	private String hlo_id;
	private String hlo_etunimi;
	private String hlo_sukunimi;
	private int hlo_tunnit;
	private String hlo_pvm;	
	
//	!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   | hlo_id | hlo_etunimi | hlo_sukunimi | hlo_tunnit | hlo_pvm             |!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
	
	public Tuntikirjaus(){
//	??? miksi tyhjä ???
	};
	
//	System.out.println("ID : " + tk.getHlo_id());
//	System.out.println("Nimi : " + tk.getHlo_etunimi());
//	System.out.println("Sukunimi : " + tk.getHlo_sukuimi());
//	System.out.println("Tunnit: " + tk.getHlo_tunnit());
//	System.out.println("PVM: " + tk.getHlo_pvm() + "\n");
	
	public Tuntikirjaus(String hlo_etunimi, String hlo_sukunimi, int hlo_tunnit) {
		super();
		this.hlo_id = "0";
		this.hlo_etunimi = hlo_etunimi;
		this.hlo_sukunimi = hlo_sukunimi;
		this.hlo_tunnit = hlo_tunnit;
		
//		System.out.println(this.hlo_etunimi + "pitäisi näkyä this.hlo_etunimi sisältö");
//		System.out.println(hlo_etunimi + "pitäisi näkyä hlo_etunimi sisältö");
//		
//		System.out.println(this.hlo_sukunimi + "pitäisi näkyä this.hlo_sukunimi sisältö");
//		System.out.println(hlo_sukunimi + "pitäisi näkyä hlo_sukunimi sisältö");
//		
		
	}
	
	public Tuntikirjaus(String hlo_id, String hlo_etunimi, String hlo_sukunimi, int hlo_tunnit, String hlo_pvm) {
		super();
		this.hlo_id = hlo_id;
		this.hlo_etunimi = hlo_etunimi;
		this.hlo_sukunimi = hlo_sukunimi;
		this.hlo_tunnit = hlo_tunnit;
		this.hlo_pvm = hlo_pvm;
	}
	
	public String getHlo_id() {
		return hlo_id;
	}
	
	public void setHlo_id(String hlo_id) {
		this.hlo_id = hlo_id;
	}
	
	public String getHlo_etunimi() {
		return hlo_etunimi;
	}

	public void setHlo_etunimi(String hlo_etunimi) {
		this.hlo_etunimi = hlo_etunimi;
	}
	
	public String getHlo_sukunimi() {
		return hlo_sukunimi;
	}

	public void setHlo_sukunimi(String hlo_sukunimi) {
		this.hlo_sukunimi = hlo_sukunimi;
	}
	
	public int getHlo_tunnit() {
		return hlo_tunnit;
	}

	public void setHlo_tunnit(int hlo_tunnit) {
		this.hlo_tunnit = hlo_tunnit;
	}

	public String getHlo_pvm() {
		return hlo_pvm;
	}

	public void setHlo_pvm(String hlo_pvm) {
		this.hlo_pvm = hlo_pvm;
	}

	@Override
	public String toString() {
		return "Tuntikirjaus [Id=" + hlo_id + "Etunimi=" + hlo_etunimi + "Sukunimi=" + hlo_sukunimi + ", Tunnit="
				+ hlo_tunnit + ", PVM=" + hlo_pvm + "]";
	}
}
