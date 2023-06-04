package javaAssignments.practice;

import org.testng.annotations.Test;

public class Reverse {
    /*
            Input: str = “geeks for geeks”
            Output: gkees for gkees

          Input: str = “this is a string”
          Output: this is a snirtg
     */

    @Test
    public void reverseEachWordExceptFirstAndLastCharacter() {
        String str = "this is a string";
        String s[] = str.split(" ");
        String rev = "";
        for (int i = 0; i < s.length; i++) {
            char c[] = s[i].toCharArray();
            rev=rev+c[0];
            for (int j = c.length-2; j >=1; j--) {
               rev=rev+c[j];
            }
            rev=rev+c[c.length-1];
            rev=rev+"\t";
        }
        System.out.println(rev);
    }
}
