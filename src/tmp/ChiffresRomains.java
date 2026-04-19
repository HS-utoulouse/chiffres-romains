package tmp;

public class ChiffresRomains {
	
	
	public ChiffresRomains() {
		super();
	}

	public String toChiffresRomains(int nbr) {
		if(nbr == 1) {
			return "I";
		}else if(nbr == 2) {
			return "II";
		}else if(nbr == 3) {
			return "III";
		}
		return "";
		
	}
}
