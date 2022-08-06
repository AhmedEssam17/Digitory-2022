
class Task2 {
    public static void main(String[] args){

        int[] nums = {3, 4, -1, 1};

        RemoveNegative removeNegative = new RemoveNegative();
        removeNegative.removeNegative(nums);

        ModifyArray modifyArray = new ModifyArray();
        modifyArray.modifyArray(nums);

        FirstPositive firstPositive = new FirstPositive();
        System.out.println(firstPositive.firstPositive(nums));
    }
}

class RemoveNegative{
    protected int[] removeNegative(int[] nums){
        //Remove negatives
        //nums = {3, 4, 0, 1}
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                nums[i] = 0;
            }
        }
        return nums;
    }
}

class ModifyArray{
    protected int[] modifyArray(int[] nums){
        //Modify indicies
        //nums = {-3, 4, -5, -1}
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(index >= 0 && index < (nums.length)){
                if(nums[index] > 0){
                    nums[index] *= -1;
                }
                else if(nums[index] == 0){
                    nums[index] = -(nums.length + 1);
                }
            }
        }
        return nums;
    }
}

class FirstPositive{
    protected int firstPositive(int[] nums){
        //Negative = Existing
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= 0){
                return i + 1;
            }
        }
        return nums.length + 1;
    }
}