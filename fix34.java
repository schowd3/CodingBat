/* Return an array that contains exactly the same numbers as the given array, 
 * but rearranged so that every 3 is immediately followed by a 4. Do not move 
 * the 3's, but every other number may move. The array contains the same 
 * number of 3's and 4's, every 3 has a number after it that is not a 3 or 4, 
 * and a 3 appears in the array before any 4.
 */

// Used 2 pointer approach to cut time complexity 
// start from both ends and mid at middle

public int[] fix34(int[] nums) {
  int i=0;
  int j=nums.length-1;
  
  while(i<nums.length-1){ 
    if(nums[i] == 3 ){
      while( j > 0){
        if(nums[j] == 4){
          int temp = nums[i+1];
          nums[i+1] = 4;
          nums[j] = temp;
          break;
        }
        j--;
      }
    }
    i++;
  }
  return nums;
}
