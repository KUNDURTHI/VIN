package com.example.springjpadatademo.domain;
//Palandrome and reversing String using Char Array.
public class Palandrome {

    public void Palandrome(char[] ch, int i){
        if(i> 0) {
            char c1 = ch[i - 1];
            i--;
            System.out.print(c1);
            Palandrome(ch, i);

        }
    }
    public static void main(String[] args){
        Palandrome pap = new Palandrome();
        String s = "CIVIC";
        char[] c = s.toCharArray();
        int i = c.length;
        pap.Palandrome(c,i);
    }
}
