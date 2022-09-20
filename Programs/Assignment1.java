import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "MoUleesHwARaN";//sc.next();
		System.out.println(str+"\n");
		int len=findLen(str);
		
		System.out.println(reverseString(str,len));
		System.out.println(lowerString(str,len));
		System.out.println(lowerCaseString(str,len));
	}

	private static int findLen(String str) {
		// TODO Auto-generated method stub
		int len=0;
		for (char c : str.toCharArray()) {
			len++;
		}
		return len;
	}

	private static String lowerCaseString(String str,int len) {
		// TODO Auto-generated method stub
		String str1="";
		char chArr[]=str.toCharArray();
		Boolean booArr[]=new Boolean[len];
		for (int i = 0; i < len; i++) {
			if((int)chArr[i]<97) {
				booArr[i]=true;
			}else {
				booArr[i]=false;
			}
		}
		for (int i = 0; i < len; i++) {
			if((int)chArr[i]<97) {
				chArr[i]=(char)((int)chArr[i]+32);
			}
		}
		for (int i = len-1; i >=0; i--) {
			str1+=chArr[i];
		}
		char chArr1[]=str1.toCharArray();
		for (int i = 0; i < len; i++) {
			if(booArr[i]) {
				chArr1[i]=(char)((int)chArr1[i]-32);
			}
		}
		String str2="";
		for (int i = 0; i < len; i++) {
			str2+=chArr1[i];
		}
		return str2;
	}

	private static String lowerString(String str,int len) {
		// TODO Auto-generated method stub
		String str1="";
		char chArr[]=str.toCharArray();
		for (int i = 0; i < len; i++) {
			if((int)chArr[i]<97) {
				chArr[i]=(char)((int)chArr[i]+32);
			}
		}
		for (int i = 0; i < len; i++) {
			str1+=chArr[i];
		}
		return str1;
	}

	private static String reverseString(String str, int len) {
		// TODO Auto-generated method stub
		String str1 = "";
		char chArr[] = str.toCharArray();
		for (int i = len - 1; i >= 0; i--) {
			str1 += chArr[i];
		}
		return str1;
	}
}
