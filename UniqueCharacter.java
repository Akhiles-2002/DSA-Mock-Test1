public class UniqueCharacter {

    public static int firstUniqChar(String s){
        int[] frequency = new int[26]; //Array to store the frequency of characters

        //Count the frequency of each character in the String
        for(char c:s.toCharArray()){
            frequency[c-'a']++;
        }

        //Find the first non-repeating character and return its index
        for(int i=0; i<s.length(); i++){
            if(frequency[s.charAt(i)-'a'] == 1){
                return i;
            }
        }
        return -1; //Return -1 if there is no non-repeating character
    }

    public static void main(String[] args){
        String s1="leetcode";
        System.out.println("Input :: "+s1);
        System.out.println("Output :: "+firstUniqChar(s1));

        String s2="loveleetcode";
        System.out.println("Input :: "+s2);
        System.out.println("Output :: "+firstUniqChar(s2));

        String s3="aabb";
        System.out.println("Input :: "+s3);
        System.out.println("Output :: "+firstUniqChar(s3));
    }
    
}
