package com.hr.arrays;

public class LeftRotation {

	public static void main(String[] args) {

		int a[] = { 1, 3, 4,2};
		int d = 0;
		int swap=0;
		for(int i=0;i<a.length;i++){
            if(i+1!=a[i]){
                int t=i;
                while(a[t]!=i+1){
                    t++;  
                }
                int temp=a[t];
                a[t]=a[i];
                a[i]=temp;
                swap++;
            }
		} 
		System.out.println(swap);
		for (int l = 0; l < a.length; l++) {
			
			int k = 0;
			while (k < a.length-1) {
				if(a[k]>a[k+1]) {
					int temp=a[k];
					a[k]=a[k+1];
					a[k+1]=temp;
					d++;
				}
				k++;
			}
			
		}
		System.out.println(d);
		for(int l:a)
		System.out.print(l+" ");
	}
		

}
