package MaximunAverageSubarray1_643;

public class MAS1 {
    public static void main(String[] args) {

        int nums[] = {1,12,-5,-6,50,3};
        int K = 4;

        double resultado=0;
        double suma =0;

        //Primera ventana:
        for(int i =0; i<K;i++){
            suma=suma+nums[i];
        }

        double valorMaximo=suma;

        //Ventana Deslizante:
        for(int i=K;i<nums.length;i++){
            suma = suma+nums[i] - nums[i-K];

            if(suma>valorMaximo){
                valorMaximo=suma;
            }
        }



resultado=valorMaximo/K;
System.out.println(resultado);

    }
}
/*
You are given an integer array nums consisting of n elements, and an integer k.

Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.

---


Busca una submatriz contigua cuya longitud sea igual a k y que tenga el valor medio máximo, y devuelve dicho valor.
Se aceptará cualquier respuesta con un error de cálculo inferior a 10⁻⁵.


Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

Example 2:

Input: nums = [5], k = 1
Output: 5.00000



Constraints:

    n == nums.length
    1 <= k <= n <= 105
    -104 <= nums[i] <= 104


---
Resultado más votado:

La mayoría usó Math en lugar de if:

class Solution {
     static{ //este bloque es un truco de optimización, se ejecuta antes que el main2
        for(int i=0;i<100;i++){
        findMaxAverage(new int[1], 1);
        }
    }
    public  static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;

        // first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // slide window
        for (int i = k; i < n; i++) {
            sum += nums[i];
            sum -= nums[i - k];
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum / k;
    }
}

 */