package UniqueNumberOfOcurrences_1207;

import java.util.*;

public class UNOO {
    public static void main(String[] args) {
        int[] arr = {-3,0,1,-3,1,1,1,-3,10,0};

        System.out.println(uniqueOccurrences(arr));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        boolean resultado= false;

        //Usar Hash map

        HashMap<Integer, Integer>numeros = new HashMap<>();
        for(int i : arr){
        numeros.put(i,numeros.getOrDefault(i,0)+1); // getOrDefault() devuelve el numero de veces que aparece el valor - su contador interno no va solo, necesita +1
        }

//Encontrar coincidencias:
        List<Integer> valores= new ArrayList<>(numeros.values());

//Crear un set para eliminar valores duplicados:
        Set<Integer> valoresUnicos= new HashSet<>(valores);

        if(valores.size()==valoresUnicos.size()){
            resultado=true;
        }

        return resultado;
    }

}
/*
Given an array of integers arr, return true if the number of occurrences of each value in the array is unique or false otherwise.


Example 1:

Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.

Example 2:

Input: arr = [1,2]
Output: false



--- Más votado:
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> mp=new HashMap<>();
        Set<Integer> set=new HashSet<>();
        int n=arr.length;
        for(int i=0; i<n; i++){
            mp.put(arr[i], mp.getOrDefault(arr[i],0)+1);
        }
        for(int num : mp.values()){
            if(set.contains(num)){
                return false;
            }
            set.add(num);
        }
        return true;
    }
}

 */