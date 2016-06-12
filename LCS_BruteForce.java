package lcs_dyanamic;

/**
 * Longest Common Subsequence - BruteForce BigO some exponential
 * @author Bijay Khatri
 * @since June 7, 2016
 */
public class LCS_BruteForce {
    
    private static int counter = 0;
    public static void main(String [] args){
        
        String str1 = "ALGORITHMS-RUBY-435";
        String str2 ="IT9HBY5";
 
        
        print("The LCS of " +str1 +" and "+str2 +" is : "+ LCSBrute(str1,str2));
        print("The total number of recursive call is: " +counter);
    }

    private static int LCSBrute(String str1, String str2) {
        return LCS(str1,str2,str1.length() ,str2.length());
    }

    private static int LCS(String str1, String str2, int len1, int len2) {
        counter++;
        if(len1 == 0 || len2 == 0) {
            return 0;
        }
        else if(str1.charAt(len1 - 1) == str2.charAt(len2 - 1))
        {
            return (1 + LCS(str1,str2,len1-1,len2-1));
        }
        else{
            return Math.max(LCS(str1,str2,len1,len2-1), LCS(str1,str2,len1-1,len2));
        }
    }
    
    private static void print(String string) {
        System.out.println(string);
    }
}
