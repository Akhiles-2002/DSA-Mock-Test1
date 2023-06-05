public class MoveZeroes{

    public static void MoveZero(int[] nums){
        int n = nums.length;
        int lastNonZeroIndex = 0;

        //Iterate through the array
        for(int i=0; i<n; i++){
            //if current element is non-zero 
            if(nums[i] != 0){
                //Move the non-zero element to last index position
                nums[lastNonZeroIndex] = nums[i];

                //Increments lastNonZeroIndex
                lastNonZeroIndex++;
            }
        }
        //Fill the remaining position from last non-zero index to the end with zeroes
        for(int j=lastNonZeroIndex; j<n; j++){
            nums[j]=0;
        }
    }
     
    public static void printArray(int[] nums){
        System.out.print("[");
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]);
            if(i != nums.length-1){
                System.out.print(",");
            }
        }
        System.out.println("]\n");
    }
    public static void main(String[] args){
        int[] nums1 = {0,1,0,3,12};
        System.out.print("Input :: ");
        printArray(nums1);
        MoveZero(nums1);
        System.out.print("Output :: ");
        printArray(nums1);
        
        
        int[] nums2 = {0};
        System.out.print("Input :: ");
        printArray(nums2);
        MoveZero(nums2);
        System.out.print("Output :: ");
        printArray(nums2);
    }

}