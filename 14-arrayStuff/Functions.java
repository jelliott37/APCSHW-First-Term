public int sum67(int[] nums) {
    int sum = 0;
    for (int i = 0;i<nums.length;i++) {
	if (nums[i] != 6) {
	    sum = sum + nums[i];
	}
	else {
	    while (nums[i] != 7) {
		i++;
	    }
	}
    }
    return sum;
}

public boolean more14(int[] nums) {
    int fours = 0;
    int ones = 0;
    for (int i = 0;i<nums.length;i++) {
	if (nums[i] == 1) {
	    ones++;
	}
	else if (nums[i] == 4) {
	    fours++;
	}
    }
    return (ones > fours);
}

public int[] tenRun(int[] nums) {
    for(int i = 0; i <nums.length; i ++){
	if (nums[i]%10==0){
	    if (i+1<nums.length){
		if (nums[i+1]%10!=0){
		    nums[i+1]=nums[i];
		}
	    }
	}
    }
    return nums;
}

public boolean tripleUp(int[] nums) {
    for (int i=0; i < nums.length-2;i++){
	if (nums[i+1]==nums[i]+1 && nums[i+2]==nums[i]+2){
	    return true;
	}
    
    }
    return false;
}

public boolean canBalance(int[] nums) {
    int ph=0;
    double result=sum(nums)/2.0;
    for (int i:nums){
	ph+=i;
	if (ph==result){
	    return true;
	}
    }
    return false;
}

public int sum(int[] nums){
    int retval=0;
    for (int i:nums){
	retval+=i;
    }
    return retval;
}

public int[] seriesUp(int n) {
    int[] nums = new int[(n*n+n)/2];
    int it=0;
    for (int i=0;i<n;i++){
    
	for (int k=0;k<i+1;k++){
	    nums[it]=k+1;
	    it+=1;
	}
    
    }
    return nums;
}