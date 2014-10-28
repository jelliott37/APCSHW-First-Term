public int[] frontPiece(int[] nums) {
    int[] blah=new int[2];
    if (nums.length <2){
	return nums;
    } 
    blah[0]=nums[0];
    blah[1]=nums[1];
    return blah;
}
public int sum13(int[] nums) {
    int added=0;
    for(int i =0;i<nums.length;i++){
	if (nums[i]==13){
	    i++;
	} else added+=nums[i];
    }
    return added;
}
