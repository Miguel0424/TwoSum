import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            
            if (map.containsKey(complement)) {
                return new int[] {map.get(complement) + 1, i + 1}; // Indices are 1-indexed
            }
            
            map.put(numbers[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        
        TwoSum solution = new TwoSum();
        int[] result = solution.twoSum(numbers, target);
        
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }
}
