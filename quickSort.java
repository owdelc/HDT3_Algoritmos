
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
public class quickSort {
    
    int distri(int bobeda[], int chico, int grande){
        int pivote = bobeda[grande];
        int i = (chico - 1);
        
        for (int l = chico; l < grande; l++) {
            if (bobeda[l] < pivote){
                i++;
                
                int tmp = bobeda[i];
                bobeda[i] = bobeda[l];
                bobeda[l] = tmp;
     }
        }
        int tmp = bobeda[i + 1];
        bobeda[i + 1] = bobeda[grande];
        bobeda[grande] = tmp;
        return i + 1;
        
    }
    void Qsort(int bobeda[], int chico, int grande){
        if (chico < grande)
        {
            
            int p = distri(bobeda, chico, grande);
            
            Qsort(bobeda,chico, grande);
            Qsort(bobeda, p + 1, grande);
        }
    }
}
