package fi.agileo.testing;

public class Matkustaja {
	private Profiili profiili;
	private int ika;
	
	public Matkustaja(Profiili profiili,int ika) {
		this.profiili= profiili;
		this.ika = ika;
	}
	
	public Profiili getProfiili() {
		return profiili;
	}

	public void setProfiili(Profiili profiili) {
		this.profiili = profiili;
	}
	 public int getIka(){
	
		return ika;
		 
	 }
	 public void srtIka(int ika){
		 this.ika =ika;
	 }
	 
	public String kerroHinta(double hinta) {
		return "Hinta on " +  profiili.muunnaHinta(hinta);
	}
	
	public int vanhene (int vuosia) throws LianVanhaException {
		this.ika +=vuosia;
		if(ika>100){
			throw new LianVanhaException();
		}
	return this.ika; 
	}
	
	}




