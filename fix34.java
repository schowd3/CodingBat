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
