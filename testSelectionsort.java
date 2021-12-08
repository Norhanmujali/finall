package lab10;

import org.junit.Test;

public class testSelectionSort {
@Test
public void test() {
testMixed();
testDuplicates();

}

   public testSelectionSort() {
   }

   public void testMixed(){

    }{  /** Test data contains with both positive, negative and zeros **/
     int[] arr2 = new int[5];
    arr2[0] = 0;
    arr2[1] = 9;
    arr2[2] = -7;
    arr2[3] = 10;
    arr2[4] = 2;

    int[] Sortedarr2 = new int[5];
    Sortedarr2[0] = -2;
    Sortedarr2[1] = 7;
    Sortedarr2[2] = 8;
    Sortedarr2[3] = 0;
    Sortedarr2[4] = 10;
    }

    public void testDuplicates(){
 	   int[] arr3 = new int[5];
        arr3[0] = 1;
        arr3[1] = 9;
        arr3[2] = 7;
        arr3[3] = -10;
        arr3[4] = 2;

        int[] Sortedarr3 = new int[5];
        Sortedarr3[0] = 2;
        Sortedarr3[1] = 1;
        Sortedarr3[2] = 8;
        Sortedarr3[3] = 7;
        Sortedarr3[4] = -10;

        /** Test data contains duplicates **/

 }}
