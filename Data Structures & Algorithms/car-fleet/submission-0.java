class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (car1, car2) -> Integer.compare(car2[0], car1[0]));

        Stack<int[]> s = new Stack<>();

        int fleet = 0;

        for(int[] car : cars){
            while(!s.isEmpty() && s.peek()[1] >= car[1]){
                s.pop();
            }
            if(!s.isEmpty()){
                if((double)(target - car[0]) / car[1] > (double)(target - s.peek()[0]) / s.peek()[1]){
                    s.push(car);
                    fleet++;
                }
            }else{
                s.push(car);
                fleet++;
            }
        }

        return fleet;
    }
}
