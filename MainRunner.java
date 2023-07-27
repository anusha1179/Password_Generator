package password_generator;

import java.util.Scanner;

public class MainRunner {
	public static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		Generator g=new Generator(sc);
		g.options();
	}

}
