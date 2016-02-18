package batch;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Tuntikirjaus;
import dao.TuntikirjausDAO;

import java.util.Scanner;

public class TuntikirjausHandler {
	
	public static void main(String[] args) {
		
//		!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!   | hlo_id | hlo_etunimi | hlo_sukunimi | hlo_tunnit | hlo_pvm             |!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		TuntikirjausDAO dao = (TuntikirjausDAO)context.getBean("daoLuokka");
		
		Scanner input = new Scanner(System.in);
		
		boolean ajetaan = true;
		
		while (ajetaan) {
			int valinta;
			
			System.out.println("Vaihtoehdot:\n1. Näytä kaikki kirjaukset\n2. Tee kirjaus\n3. Poistu");
			
			valinta = input.nextInt();
			
			switch (valinta)
			{
			case 1:
				System.out.println("-------------------");
				System.out.println("LISTATAAN KAIKKI");
				System.out.println("-------------------");
				
				List<Tuntikirjaus> tuntikirjaukset= dao.haeKaikki();
				for (Tuntikirjaus tk : tuntikirjaukset) {
					System.out.println("ID : " + tk.getHlo_id());
					System.out.println("Nimi : " + tk.getHlo_etunimi());
					System.out.println("Sukunimi : " + tk.getHlo_sukunimi());
					System.out.println("Tunnit: " + tk.getHlo_tunnit());
					System.out.println("PVM: " + tk.getHlo_pvm() + "\n");
				}
				break;			
			case 2:
				String kirjaajaEtunimi;
				String kirjaajaSukunimi;
				int tunnit;
								
				String hlo_id = "0";
				String hlo_pvm = "";
				
				System.out.println("Anna kirjaajan etunimi");
				input.nextLine();
				kirjaajaEtunimi = input.nextLine();
				
				
				System.out.println("Anna kirjaajan sukunimi");
				kirjaajaSukunimi = input.nextLine();
								
				System.out.println("Montako tuntia tuli tehtyä?");
				tunnit = input.nextInt();
								
				Tuntikirjaus uusiTuntikirjaus = new Tuntikirjaus(kirjaajaEtunimi, kirjaajaSukunimi, tunnit);
				dao.talleta(uusiTuntikirjaus);
				
//				INSERT INTO henkilo(hlo_id, hlo_etunimi, hlo_sukunimi, hlo_tunnit)
//				VALUES ('0','Sven','Jorgenseen',11);
								
				break;			
			case 3:
				ajetaan = false;
				break;
			}
		}
						
					
//		System.out.println("-------------------");
//		System.out.println("HAETAAN KAIKKI");
//		System.out.println("-------------------");
//		tuntikirjaukset = dao.haeKaikki();
//		for (Tuntikirjaus tk : tuntikirjaukset) {
//			System.out.println("ID : " + tk.getHlo_id());
//			System.out.println("Nimi : " + tk.getHlo_etunimi());
//			System.out.println("Sukunimi : " + tk.getHlo_sukunimi());
//			System.out.println("Tunnit: " + tk.getHlo_tunnit());
//			System.out.println("PVM: " + tk.getHlo_pvm() + "\n");
//		}
		
		context.close();

	}

}