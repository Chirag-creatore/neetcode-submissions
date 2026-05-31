class Solution {
    public int trap(int[] height) {
        int maxHeight = height[0];
        for(int h: height){
            maxHeight = Math.max(maxHeight, h);
        }

        int water = 0;
        int currMax = height[0];
        int i = 1;
        while(currMax != maxHeight){
            if(height[i] <= currMax){
                water += currMax - height[i];
            }else{
                currMax = height[i];
            }
            i++;
        }

        int j = height.length - 2;
        currMax = height[j + 1];
        while(j >= i){
            if(height[j] <= currMax){
                water += currMax - height[j];
            }else{
                currMax = height[j];
            }
            j--;
        }

        return water;
    }
}
