package com.hr.arrays;

public class OpsString {

	
	 public static void main(String[] args) {
		 String s="ivvkx";
        // int l=s.length();
        // System.out.println(s.substring(0,(l/2))+" "+s.substring((l/2),l));
         
         char[]temp=s.toCharArray();
         char[]temp1=new char[(s.length()%2==0)?(s.length()/2):(s.length()/2+1)]; int k=0,l=0;
         char[]temp2=new char[s.length()/2];
         
         for(int i=0;i<s.length();i++){
             if(i%2==0){
                 temp1[k]=temp[i];k++;
             }else{
                 temp2[l]=temp[i];l++;
             }
         }
         System.out.println(String.valueOf(temp1)+" "+String.valueOf(temp2));
	}
	
}
