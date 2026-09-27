package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._05_Medium_LC567_PermutationInString;

public class OnO1_FixedSizeSlidingWindow_ChatGPT_Alternate {
    public static boolean containsPermutation(int[] s1Freq,int[] winFreq){
        for(int i =0;i<s1Freq.length;i++){
            if(s1Freq[i]!=winFreq[i]){
                return false;
            }
        }
        return true;
    }
    public static boolean checkInclusion(String s1, String s2){
        int left =0;
        int[] s1Freq = new int[26];
        int[] winFreq = new int[26];
        for(int i =0;i<s1.length();i++){
            s1Freq[s1.charAt(i)-'a']++;
        }
        int currIdx =0;
        while(currIdx <s2.length()){
            winFreq[s2.charAt(currIdx)-'a']++;
            if(containsPermutation(s1Freq,winFreq)){
                return true;
            }
            if(currIdx - left +1==s1.length()){
                winFreq[s2.charAt(left)-'a']--;
                left++;
            }
            currIdx++;
        }
        return false;
    }
    public static void main(String[] args){
        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println(checkInclusion(s1,s2));
    }
}
