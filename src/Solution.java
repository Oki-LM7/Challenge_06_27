public class Solution {


    int lightsLeft = 0;
    int distance = 0;

    int rightMost = 0;
    int leftMost = 0;
    int current = 0;

    /*while lights left !=0{


    // go to n+1 (rightmost)
    //turn off light  lightsLeft = n+1-1
    //add distance
    //go back to origin n+1 - rightmost
    //rightmost = n+1 -1
    //lights left = n -1
    // add distance
    //do it until


    }
         */

    public int distance(int n){
        lightsLeft = n+1;
        rightMost = n ;
        leftMost = 0;
        distance = 0;

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
