public class Solution {

    int lightsLeft = 0;
    public int distance(int n){
        lightsLeft = n+1;
       int  rightMost = n ;
       int leftMost = 0;
       int distance = 0;

        int i =0;
        while (i < n) {


            distance = distance + Math.abs(rightMost-leftMost) ;
           if(leftMost != 0){
               leftMost++;
           }
            lightsLeft --;

            if (noLights()){
                return  distance;
            }
            distance = distance + Math.abs(leftMost-rightMost);
                    rightMost--;
                    lightsLeft--;

            if (noLights()){
                return  distance;
            }
            i++;
        }

       return  distance;

      }
        public boolean noLights(){
         return  lightsLeft ==0;
        }

        public static void main(String [] args){

        Solution solution = new Solution();

            System.out.println(solution.distance(2));
            System.out.println(solution.distance(1));
        }

}
