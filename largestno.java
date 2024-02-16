package javaproject;

public class largestno {

	public static void main(String[] args) {
		int[] a={11,32,23};
		int l=0;
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]>l) {
				l=a[i];
			}
		}
		System.out.println(l);
		

	}

}
