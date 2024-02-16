package javaproject;

public class secondlar {

	public static void main(String[] args) {
		int[] a= {2,17,8};
		int l=0,sl=0;
		int i;
		for(i=0;i<a.length;i++) {
			if(a[i]>l) {
				sl=l;
				l=a[i];
				
			}
			else if(a[i]>sl && a[i]!=l)
				sl=a[i];
				
			}
		System.out.println(sl);
		}

	}


