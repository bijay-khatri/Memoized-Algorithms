package lcs_dyanamic;

/**
 * Longest Common Subsequence - Memoized BigO some Polynomial
 * @author Bijay Khatri
 * @since June 7, 2016
 */
public class LCS_Memoized {
    //Global varialbe to hold the number of recursive method call
    private static int counter = 0;

    public static void main(String[] args) {

        String str1 = "ALGORITHMS-RUBY-435";
        String str2 ="IT9HBY5";
        print("The LCS of " + str1 + " and " + str2 + " is : " + LCS(str1, str2));
        print("The total number of recursive call is: " + counter);
    }

    private static int LCS(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();

        int[][] arr = new int[len1+1][len2+1];

        for (int i = 0; i <=len1; i++) {
            for (int j = 0; j <=len2; j++) {
                arr[i][j] = -1;
            }
        }

        return LCS(str1, str2, len1, len2, arr);
    }

    private static int LCS(String str1, String str2, int len1, int len2, int[][] arr) {
        counter++;
        if (arr[len1][len2] < 0) {
            if (len1 == 0 || len2 == 0) {
                arr[len1][len2] = 0;
            } 
            // check the nth i.e len -1 character (for 0 based array)
            else if (str1.charAt(len1 - 1) == str2.charAt(len2 - 1)) {
                arr[len1][len2] = (1 + LCS(str1, str2, len1 - 1, len2 - 1, arr));
            } 
            else {
                arr[len1][len2] = Math.max(LCS(str1, str2, len1, len2 - 1, arr), LCS(str1, str2, len1 - 1, len2, arr));
            }

        }
        return arr[len1][len2];
    }

    private static void print(String string) {
        System.out.println(string);
    }
}
