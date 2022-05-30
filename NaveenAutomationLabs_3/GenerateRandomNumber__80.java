package NaveenAutomationLabs_3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class GenerateRandomNumber__80 {

	public static void main(String[] args) {

		randomClass();
		System.out.println("=================================");
		mathRandom();
		System.out.println("=================================");
		threadLocal();
		System.out.println("=================================");
		genereteNumbersBetween1_20();
	}

	public static void randomClass() {
		Random r = new Random();
		System.out.println("int :" + r.nextInt());
		System.out.println("double :" + r.nextDouble());
		System.out.println("float :" + r.nextFloat());
		System.out.println("boolean :" + r.nextBoolean());

	}

	public static void mathRandom() {
		// generates only double value
		System.out.println(Math.random());
		System.out.println(Math.round(Math.random() * 1000));
		System.out.println((int)(Math.random()*1000));

	}

	public static void threadLocal() {
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextBoolean());
		System.out.println(ThreadLocalRandom.current().nextFloat());
	}

	public static void genereteNumbersBetween1_20()
	{
		// generates randomly upto 20 only
		for (int i = 0; i < 5; i++)
		{
			Random r = new Random();
			System.out.println(r.nextInt(20));
		}
	}

}
