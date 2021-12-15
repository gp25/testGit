package Oracle;

public class TestUse2 {
	
	//input  : my name is gaurav
	//output : gaurav is name my
	public static char[] reverseString(char str[]) {
		int s=0;
		for(int e=0;e<str.length;e++) {
			if(str[e]==' ') {
				reverse(str,s,e);
				s=e+1;
			}
		}
		reverse(str,s,str.length-1);
		reverse(str,0,str.length-1);
		return str;
	}
	
	public static void reverse(char str[],int s,int e) {
		while(s<=e) {
			char temp=str[s];
			str[s]=str[e];
			str[e]=temp;
			s++;
			e--;
		}
	}
	
	//input : jamesbond11
	//output : jamesbond00
	public static void checkString(String str) {
		int n=str.length();
		int k=1;
		int num=0;
		for(int i=n-1;i>=0;i--) {
			if('0'<=str.charAt(i) && str.charAt(i)<='9') {
				num=(str.charAt(i)-'0')*k+num;
				k=k*10;
				if(num>n) {
//					return "Incorrect";
					return;
				}
			}else {
				break;
			}
		}
		int contdigit=0;
		while(num>=0) {
			num=num%10;
			contdigit++;
			num=num/10;
		}
		System.out.println("cont digit : "+ contdigit);
	}

	public static void main(String[] args) {
//		String str="my name is gaurav";
//		char res[]=reverseString(str.toCharArray());
//		System.out.println(res);
		
		String str="james0000000011";
//		checkString(str);
//		System.out.println(res);

	}

}
