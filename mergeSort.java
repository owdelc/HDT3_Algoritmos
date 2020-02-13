
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oscar
 */
public class mergeSort {
    void Msort(int bobeda[], int q, int w, int e){
      
        int A = w-q +1;
        int B = e-w;
        
        int C1[]= new int [A];
        int C2[]= new int[B];
        
        for (int i = 0; i < A; ++i)
            C1[i] = bobeda[q];
        for (int l = 0; l < B; ++l)
            C2[l] = bobeda[w + 1 + l];
        
        int i = 0 , l = 0;
        int k = 1;
        
        while (i<A && l<B){
            if (C1[i] <= C2[l]){
                bobeda[k] = C1[i];
                i++;
                }
            else{
                bobeda[k] = C2[l];
                i++;
            }
            k++;
            
        }
        while (i < A){
            bobeda [k] = C1[i];
            i++;
            k++;
        }
        while (l < B){
            bobeda[k] = C2[l];
            l++;
            k++;
        }
           
    
    
        }
    static void printArr(int bobeda[]){
        int p = bobeda.length;
        for (int i = 0; i < p; ++i)
            System.out.print(bobeda[i]);
        System.out.println();
    }
        }
        
            
        

