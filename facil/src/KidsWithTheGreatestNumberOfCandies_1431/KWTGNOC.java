package KidsWithTheGreatestNumberOfCandies_1431;

import java.util.ArrayList;
import java.util.List;

public class KWTGNOC {
    public static void main(String[] args) {

        //Recibir un array de int[] y un int
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        int max=0;

List<Boolean> kidsWithCandies = new ArrayList<>();
          //Devolver lista de booleanos

//Encontrar al que tiene más caramelos
        for(int cantidad:candies){
            max=Math.max(max,cantidad);
        }

//Llenar la lista
        for(int cantidad:candies){
            kidsWithCandies.add(cantidad+ extraCandies >= max);
        }

        /*
        no hace falta especificar con if:

        for(int cantidad : candies) {
    if(cantidad + extraCandies >= max) {
        kidsWithCandies.add(true);
    } else {
        kidsWithCandies.add(false);
    }
}
         */


        for(boolean b:kidsWithCandies){
            System.out.println(b);
        }
    }
}
/*
There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids, or false otherwise.

Note that multiple kids can have the greatest number of candies.

---

Hay n niños con caramelos. Se te proporciona una matriz de enteros `candies`,
en la que cada elemento `candies[i]` representa el número de caramelos que tiene el i-ésimo niño,
y un entero `extraCandies`, que indica el número de caramelos extra que tienes.

Devuelve una matriz booleana result de longitud n, donde result[i] es true si, tras darle al i-ésimo niño todos los extraCandies,
este tendrá el mayor número de caramelos de entre todos los niños, o false en caso contrario.

Ten en cuenta que puede haber varios niños con el mayor número de caramelos.


---


Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.

Example 2:

Input: candies = [4,2,1,1,2], extraCandies = 1
Output: [true,false,false,false,false]
Explanation: There is only 1 extra candy.
Kid 1 will always have the greatest number of candies, even if a different kid is given the extra candy.

Example 3:

Input: candies = [12,1,12], extraCandies = 10
Output: [true,false,true]



Constraints:

    n == candies.length
    2 <= n <= 100
    1 <= candies[i] <= 100
    1 <= extraCandies <= 50

 */