package CSC1351_Fall2023.Collections;

import java.util.Arrays;
import java.util.Stack;

public class ReverseArray {
    public static void main(String[] args) {

        String str = "a,list,of,words";
        String[] arr = str.split(",");
        String[] revArr = new String[arr.length];
        System.out.println(Arrays.toString(arr));
        Stack<String> s = new Stack<>();
        for(String word : arr){
            s.push(word);
        }
//
        System.out.println(s.peek());

        int i = 0;
        while(!s.isEmpty()){
            revArr[i] = s.pop();
            i++;
        }

        System.out.println(Arrays.toString(revArr));























//        int[] arr = new int[]{1,2,3,4,5,6,7};
//        int[] revArr = new int[arr.length];
//        Stack<Integer> s = new Stack<>();
//        for(int i : arr){
//            s.push(i);
//        }
//        int i = 0;
//        while(!s.isEmpty()){
//            revArr[i] = s.pop();
//            i++;
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(revArr));


    }
}
