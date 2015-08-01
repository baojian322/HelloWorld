package com.aisino.test;

import java.io.UnsupportedEncodingException;

public class Test {
	public static void main(String[] args) {
		String str="中国人民";
		try {
			System.out.println(str.substring(0, 1));
			System.out.println(idgui(str,4));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static String idgui(String s,int num) throws UnsupportedEncodingException{
        int changdu = s.getBytes().length;
        System.out.println(changdu);
        if(changdu > num){
        	System.out.println(s);
            s = s.substring(0, s.length() - 1);
            s = idgui(s,num);
            
        }
        return s;
    }

}
