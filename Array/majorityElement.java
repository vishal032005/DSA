// import java.util.Arrays;  for the Optimization

public class majorityElement {


    public static int findMajority(int[] arr){


    //    BruteForce 
        // for(int i = 0; i<arr.length; i++){
        //     int count = 0;
        //     for(int j = 0; j<arr.length; j++){
        //         if(arr[i] == arr[j]){
        //             count++;
        //         }
        //     }
        //     if(count > arr.length/2){
        //         return arr[i];
        //     }
        // }
        // return -1;



        // Optimization
        // int n = arr.length;
        // Arrays.sort(arr);
        // return arr[n/2];

        


        //moore's Algorithm
        int count = 0;
        int ans = 0;
        for(int i = 0; i<arr.length-1; i++){
            if(count == 0){
                ans = arr[i];
            }
            if(ans == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        return ans;

        

    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3};
        System.out.println("Majority Element: " + findMajority(arr));
    }
}
