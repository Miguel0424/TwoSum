public class TwoSum {
    public int[] findTwoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int sum = numbers[left] + numbers[right];
        
        if (sum == target) {
            return new int[] {left + 1, right + 1};
        } else if (sum < target) {
            left++; 
        } else {
            right--; 
        }
        }       
        return new int[] {-1, -1};
    }
    
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        int[] indices = twoSum.findTwoSum(numbers, target);
        System.out.println("Index1: " + indices[0] + ", Index2: " + indices[1]);
    }
}
