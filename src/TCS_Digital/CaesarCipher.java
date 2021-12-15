package TCS_Digital;

import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Plain text :");
		String ch=s.nextLine();
		System.out.println("Enter Key : ");
		int k=s.nextInt();
		encryptText(ch,k);
//		if(k<0) {
//			System.out.println("Invalid Input");
//			return;
//		}
//		StringBuffer decryptString=new StringBuffer();
//		for(int i=0;i<ch.length();i++) {
//			System.out.print((int)ch.charAt(i));
//		}
//		System.out.println();
//		System.out.println("Encrypted Text : ");
//		for(int i=0;i<ch.length();i++) {
//			if(ch.charAt(i) == ' ') {
//					System.out.print(" ");
//					decryptString.append(' ');
//					continue;
//			}
//			System.out.print((char)(ch.charAt(i)+k));
//			decryptString.charAt((char)(ch.charAt(i)+k));
//			decryptString.append((char)(ch.charAt(i)+k));
//		}
//		System.out.println();
//		for(int i=0;i<decryptString.length();i++) {
//			System.out.print(decryptString.charAt(i));
//		}
//		System.out.println("Decrypted text : ");
//		for(int i=0;i<decryptString.length();i++) {
//			if(decryptString.charAt(i) == ' ') {
//				System.out.print(" ");
//				continue;
//			}
//			System.out.print((char)(decryptString.charAt(i)-k));
//		}
		
		System.out.println();
	}

	private static void encryptText(String ch, int k) {
		
		if(k<0) {
			System.out.println("INVALID INPUT");
			return ;
		}else {
			for(int i=0;i<ch.length();i++) {
				if(ch.charAt(i) != ' ') {
					if((int)ch.charAt(i)>=65 && (int)ch.charAt(i)<=90) {
						if((int)(ch.charAt(i)+k)<=90) {
							System.out.print((char)(ch.charAt(i)+k));
						}else {
							System.out.print((char)(ch.charAt(i)+k-90+65-1));
						}
					}else {
						if((int)ch.charAt(i)>=97 && (int)ch.charAt(i)<=122) {
							if((int)(ch.charAt(i)+k)<=122) {
								System.out.print((char)(ch.charAt(i)+k));
							}else {
								System.out.print((char)(ch.charAt(i)+k-122+97-1));
							}
						}else {
							if((int)ch.charAt(i)>=48 && (int)ch.charAt(i)<=57) {
								if((int)(ch.charAt(i)+k)<=57) {
									System.out.print((char)(ch.charAt(i)+k));
								}else {
									System.out.print((char)(ch.charAt(i)+k-57+48-1));
								}
							}
						}
					}
				}else {
					System.out.print(" ");
					continue;
				}
			}
		}
		return;
		
	}

}
