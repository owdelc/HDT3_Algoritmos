/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author oscar
 */
public class MAIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int ran;
      int limita =  100;
      int[] bobeda = new int[limita];
      for(int i = 0 ; i < bobeda.length ; i++){
     ran = (int)(Math.random() * limita + 1);
     bobeda[i] = ran;
    }
     
      selectionSort ob1 = new selectionSort();
      ob1.Ssort(bobeda);
      System.out.println("Proceso realizado");
      System.out.println(Arrays.toString(bobeda));
      
      mergeSort ob2 = new mergeSort();
      ob2.Msort(bobeda, 0, bobeda.length -1, 0);
        System.out.println("Proceso realizado");
        System.out.println(Arrays.toString(bobeda));
      
        
    }
    
     
  }


