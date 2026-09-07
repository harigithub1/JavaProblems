package _03SlidingWindow_DSAVeryHigh_SDLow.NeetCode250._39_Medium_LC424_LongestRepeatingCharacterReplacement;

public class OnO1_SlidingWindow_V2_chatGPT {
    public static int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int l = 0;
        int maxFreq = 0;
        int maxLength = 0;
        for (int r = 0; r < s.length(); r++) {
            int index = s.charAt(r) - 'A';
            freq[index]++;
            maxFreq = Math.max(maxFreq, freq[index]);
            // Characters that must be replaced
            int replacements = (r - l + 1) - maxFreq;
            if (replacements > k) {
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}

/*
trace:
Int[] freq = new int[26];
S=AABABBA k=1

l = 0, maxFreq =0, maxLength = 0, all freq values 0
r=0
index = s.charAt(r)-A = A-A = 65-65= 0
freq[0]=1
maxFreq = Math.max(maxFreq,freq[0])= Math.max(0,1) = 1
replacements = r-l+1-maxFreq =1-1 = 0
replacements >k false
maxLength = 1

l = 0, maxFreq =1, maxLength = 1, freq[0]=1
r=1
index = s.charAt(r)-A = A-A = 0
freq[0]=2
maxFreq = Math.max(maxFreq,freq[0])=Math.max(1,2) = 2
replacements = r-l+1-maxFreq =2-2 = 0
replacements >k false
maxLength = 2

l = 0, maxFreq =2, maxLength = 2, freq[0]=2
r=2
index = s.charAt(r)-A = B-A = 66-65=1
freq[0]=2
freq[1]=1
maxFreq = Math.max(maxFreq,freq[0]) =Math.max(2,1)=2
replacements = r-l+1-maxFreq =2-0+1-2 = 1
replacements >k => 1> k => false
maxLength = 3

l = 0, maxFreq =2, maxLength = 3, freq[0]=2, freq[1]=1
r=3
index = s.charAt(r)-A = A-A = 0
freq[0]=3
freq[1]=1
maxFreq = Math.max(maxFreq,freq[0])= Math.max(2,3) = 3
replacements = r-l+1-maxFreq =3-0+1-3 = 1
replacements >k false
maxLength = 4

l = 0, maxFreq =3, maxLength = 4, freq[0]=3, freq[1]=1
r=4
AABAB
index = s.charAt(r)-A = B-A = 66-65=1
freq[0]=3
freq[1]=2
maxFreq = Math.max(maxFreq,freq[1])= Math.max(3,2) = 3
replacements = r-l+1-maxFreq =4-0+1-3=5-3 = 2
replacements >k => 2>k => true
freq[s.charAt(l)-‘A’]- - => freq[‘A’-‘A’]=> freq(0)- - => freq[0]=2
l++ => l=1
maxLength = Math.max(maxlength,r-l+1)= Math.max(4,4-1+1)= 4
ABAB

l = 1, maxFreq =3, maxLength = 4, freq[0]=2, freq[1]=2
r=5
ABABB
index = s.charAt(r)-A = B-A = 66-65=1
freq[1]=3
maxFreq = Math.max(maxFreq,freq[1])= Math.max(3,3)= 3
replacements = r-l+1-maxFreq =5-1+1-3=5-3 = 2
replacements >k 2>k true
freq[s.charAt(l)-‘A’]- - => freq(‘A’-‘A’)- - => freq(0)- - => freq[0]=1
l++ => l=2
maxLength = Math.max(maxlength,r-l+1)
maxLength = Math.max(4,5-2+1)
BABB

l = 2, maxFreq =3, maxLength = 4, freq[0]=1, freq[1]=3
r=6
BABBA
index = s.charAt(r)-A = A-A = 65-65=0 index=0
freq[0]=1 => freq[0]++=> 2
freq[1]=3
maxFreq = Math.max(maxFreq,freq[index]) = Math.max(3,2) = 3
replacements = r-l+1-maxFreq =6-2+1-3=5-3 = 2
replacements >k true
freq[s.charAt(l)-‘A’]- - =>freq(‘B’-‘A’)- - => freq[1]=2
l++ l=3
maxLength = Math.max(maxlength,r-l+1) = Math.max(4,6-3+1)
ABBA

 */