package arrays;

public class ContainerWithMostWater {

//    public int maxArea(int[] height) {
//        int left = 0;
//        int right = height.length - 1;
//        int maxWater = 0;
//
//        while (left < right) {
//
//            int minHeight = Math.min(height[left], height[right]);
//            int width = right - left;
//            int area = minHeight * width;
//
//            maxWater = Math.max(maxWater, area);
//
//            if (height[left] < height[right]) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//
//        return maxWater;
//    }

    // Brute Force Approach
    public int maxArea(int[] height) {
        int maxWater = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {

                int minHeight = Math.min(height[i], height[j]);
                int width = j - i;
                int area = minHeight * width;

                maxWater = Math.max(maxWater, area);
            }
        }

        return maxWater;
    }
    public static void main(String[] args) {

        ContainerWithMostWater obj = new ContainerWithMostWater();

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        int result = obj.maxArea(height);

        System.out.println("Maximum Water = " + result);
    }
}