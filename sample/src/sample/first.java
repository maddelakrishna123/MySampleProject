package sample;

import java.math.BigInteger;

public class first {

	public static void main(String[] args) {
		long a=8500493754l;
		BigInteger bg=new BigInteger("123445678973566773");
		float b=bg.floatValue();
		System.out.println(b);
		char c1='8';
		Character c=new Character(c1);
		int hash=c.hashCode();
		System.out.println(hash);
		String s=c.toString();
		int p=Integer.parseInt(s);
		System.out.println(p);
		
	}

}
