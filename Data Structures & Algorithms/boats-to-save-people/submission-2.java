class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int n = people.length;
        int[] freq = new int[30000];
        for(int num: people) freq[num - 1]++;
        int idx = 0;
        for(int i = 0; i < 30000; i++){
            while(freq[i] > 0){
                people[idx++] = i + 1;
                freq[i]--;
            }
        }
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