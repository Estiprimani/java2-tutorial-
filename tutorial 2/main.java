import java.util.*; 

public class main{
	public static void main(String[] args){
		window win1 = new window("west");
		dimension dim1 = new dimension (5, 4);
		room r1 = new room ("TR1", 15, true, dim1, win1 );

		System.out.println(r1.toString());

		Scanner abc = new Scanner(System.in);
		System.out.println ("window? ");
		String window = abc.nextLine();
		window win2 = new window(window);

		System.out.println ("width?");
		int width = abc.nextInt();
		System.out.println ("length?");
		int length = abc.nextInt();
		dimension dim2 = new dimension(width , length);
		System.out.println (dim2.toString());

		System.out.println ("Room name ? ");
		String names = abc.next();
		System.out.println ("no of chairs ? ");
		int noOfChairs = abc.nextInt();
		System.out.println ("already booked (true or false): ");
		boolean isBooked = abc.nextBoolean();
		room r2 = new room (names, noOfChairs, isBooked, dim2, win2 );

		System.out.println (r2.toString());

	}
}