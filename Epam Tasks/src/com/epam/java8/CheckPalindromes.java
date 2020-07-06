package com.epam.java8;

import java.util.ArrayList;
import java.util.List;

public class CheckPalindromes {

    public static List<String> check(List<String> Palindromes){

        ArrayList<String > result=new ArrayList<>();
        String rev="";
        for (int i=0;i<Palindromes.size();i++){
            String real=Palindromes.get(i);
            for(int j=real.length()-1;j>=0;j--){
                rev=rev+real.charAt(j);
            }
            if(real.equals(rev)){
                result.add(rev);
            }
            rev="";
        }
        List<String > list=(List<String>)result;

        return list;
    }

}