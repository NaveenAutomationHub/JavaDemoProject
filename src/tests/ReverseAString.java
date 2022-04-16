package tests;

public class ReverseAString {

	public static void main(String[] args) {




String str= "Reverese this string";

String [] atr1 = str.split(" ");

for(int i=0;i<atr1.length;i++){
StringBuffer sb = new StringBuffer(atr1[i]);
sb.reverse();
System.out.print(sb+" ");
}
	}

}
