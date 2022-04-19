package fullfil;

import java.util.Random;

public class random {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random obj = new Random();
		long seller = obj.nextInt(1000000000);
		String cellnum = ("" + seller);
		System.out.println(cellnum);

	}

}
