/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.FileWriter;
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
      int limit =  3000;
      int[] bobeda = new int[limit];
      for(int i = 0 ; i < bobeda.length ; i++){
     ran = (int)(Math.random() * limit + 1);
     bobeda[i] = ran;
    }
     
  }
}

