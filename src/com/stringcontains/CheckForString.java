package com.stringcontains;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckForString {
	public static void main(String[] args) {
		List<String> Q = Arrays.asList("abc", "def", "mno", "xyz", "ijk", "aaa");
		List<Boolean> res = findSubstrings("abcdefghijklmnopqrstuvwxyz", Q);
        System.out.println(res);
	}
	
	public static List<Boolean> findSubstrings(String S, List<String> Q){
		List<Boolean> response = new ArrayList<>();
		StringBuilder sb = new StringBuilder(S);
		for(String sub : Q) {
			if(sb.indexOf(sub)==-1) {
				response.add(false);
			}else {
				response.add(true);
			}
		}
		
		return response;
		
	}
}
