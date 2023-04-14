package example;

import java.util.Arrays;
import java.util.Collections;

//반복문 (for, while, do~while)
//배열 관련 (for(:))
public class Example5 {
   Integer data[] = {10,8,5,3,1}; //1차 숫자배열
   
   public static void main(String[] args) {
      Example5 ex = new Example5();
      ex.array();

   }
   public void array() {
      /*
       응용문제2.
       해당 배열에 모든 값을 합한 결과를 출력하시오. 
       */
   int sum = 0;
   for(int f : data){
      sum += f;
   }
   System.out.println(sum);
   //Arrays.sort(data); //오름차순 정렬 (int, String, Integer)
   Arrays.sort(this.data,Collections.reverseOrder()); //내림차순 (Integer, String)
   System.out.println(Arrays.toString(this.data));
   }

}