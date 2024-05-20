/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Carlos Garcia Maqueda
 */
public class E3 {
    public static void main(String[] args) {
        //Entorno:
        int[] nums = new int[10];
        int suma;

        //Algoritmo:
        suma=0;
        for(int i = 0; i <= nums.length-1; i++){
            nums[i] = (int) (Math.random()*100)+1;
            
            if(nums[i] % 2 == 0){
                suma = suma + nums[i] * 3;
            } else {
                suma = suma + nums[i] * 2;
            }//Fin Si
        }//Fin Para
        
        System.out.println("Suma de los numeros pares e impares multiplicados"
                + " por 3 y 2 respectivamente: "+suma);
    }//Fin Programa
    
}