package utilities;

public class LenString {
	String x;
	public LenString(String y) {
		this.x = y;
	}
	public static void count_char() {
		int len;
		while(!x.isEmpty()) {
			len += 1;
		}
	}
}
