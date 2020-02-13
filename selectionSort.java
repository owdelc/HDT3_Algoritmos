/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author oscar
 */

public class selectionSort extends MAIN{

   void Ssort (int bobeda[]){
       int last = bobeda.length;
       for(int i = 0; i < last; i++ ){
         int menor = i;
         for(int k = i +1; k < last; k++){
             if (bobeda[k] < bobeda[last])
                 last = k;
             
             int tmp = bobeda[last];
             bobeda[last] = bobeda[i];
             bobeda[i] = tmp;
            
         }
       }
   } 
   
   void printres(int bobeda[]){
    int last = bobeda.length; 
       for (int i = 0; i < last; ++i) {
           System.out.print(bobeda[i] + "");
           System.out.println();
           
       }
   }
   
}
