package FindTheHighestAltitude_1732;

public class FTHA {
    public static void main(String[] args) {
int solucion =0;
int[] gain = {-5,1,5,0,-7};
int altitudActual =0;
int altitudMaxima=0;

for(int i=0;i<gain.length;i++) {
    altitudActual=altitudActual+gain[i];

    if(altitudActual>altitudMaxima){
        altitudMaxima=altitudActual;
    }
}

        System.out.println(altitudMaxima);

    }
}
/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i and i + 1 for all (0 <= i < n).
 Return the highest altitude of a point.

 Explicación:
 El ciclista empieza en punto 0 con altitud 0 - recibo array con cambios respecto al punto anterior (gain positivo sube, gain negativo baja).
 Para saber la altitud hay que sumar los cambios al valor anterior:
 altitud_actual = altitud_anterior + gain[i]

Objetivo: calcular todas las altitudes e identificar cuál fue el valor más alto en su recorrido incluyendo el 0.

Example 1:

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.

Example 2:

Input: gain = [-4,-3,-2,-1,4,3,2]
Output: 0
Explanation: The altitudes are [0,-4,-7,-9,-10,-6,-3,-1]. The highest is 0.



Constraints:

    n == gain.length
    1 <= n <= 100
    -100 <= gain[i] <= 100

 */