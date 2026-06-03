class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int boats = 0;
        int left = 0, right = n - 1;
        while(right > left){
            if(people[right] + people[left] <= limit){
                left++;
            }
            right--;
            boats++;
        }
        if(left == right) boats++;
        return boats;
    }
}