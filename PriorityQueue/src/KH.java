
public class KH implements Comparable<KH> {
	String hoten;
	int maUT;
	
	public KH(String hoten, int maUT) {
		this.hoten = hoten;
		this.maUT = maUT;
	}
	
	@Override
	public String toString() {
		return "KH [hoten=" + hoten + ", maUT=" + maUT + "]";
	}
	
	public int compareTo(KH b) {
		if (this.maUT>b.maUT) {
			return 1;
		} else {
			if(this.maUT<b.maUT) {
				return -1;
			} else {
				return 0;
			}
		}
	}
	
}
