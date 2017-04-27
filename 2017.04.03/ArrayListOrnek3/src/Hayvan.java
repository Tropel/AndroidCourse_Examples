
public class Hayvan {
	
	private String ad;
	private int yas;
	private String renk;
	
	public Hayvan(String ad, int yas, String renk) {
		if(ad == null || yas == 0 || renk == null){
			return;
		}
		this.ad = ad;
		this.yas = yas;
		this.renk = renk;
	}
	
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public int getYas() {
		return yas;
	}
	public void setYas(int yas) {
		this.yas = yas;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	
	
	

}
