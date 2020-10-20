import java.util.*;

public class main{
	public static void main(String[] args) {
		harddisk h1 = new harddisk(40, "GB");
		harddisk h2 = new harddisk(80, "GB");
		dimension d1 = new dimension(800, 600);
		dimension d2 = new dimension(1152, 864);
		monitor m1 = new monitor(17, d1);
		monitor m2 = new monitor (19, d2);
		computer c1 = new computer ("Dell", h1, m1);
		computer c2 = new computer ("Acer", h2, m2);

		System.out.println(c1.toString());
		System.out.println (c2.toString());
	}
}