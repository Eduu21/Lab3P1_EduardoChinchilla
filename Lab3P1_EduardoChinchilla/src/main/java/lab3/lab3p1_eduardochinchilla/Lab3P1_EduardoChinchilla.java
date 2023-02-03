
package lab3.lab3p1_eduardochinchilla;

import java.util.Scanner;

public class Lab3P1_EduardoChinchilla {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        int opcion = 0;
        
        while (opcion !=4){
            System.out.println("Menu");
            System.out.println("1. Triangulo");
            System.out.println("2. Calculando PI");
            System.out.println("3. Construyendo Casas");
            System.out.println("4. Salir");
            
            opcion = read.nextInt();
            
            switch (opcion){
                case 1:{
                    System.out.println("Ingrese un numero entre 4 y 16 para el tamaño: ");
                    int n = read.nextInt();
                    System.out.println("Ingrese un caracter para hacer la figura: ");
                    char sym = read.next().charAt(0);
                    int c = n;
                    while (n < 4 || n > 16){
                        System.out.println("dato incorrecto, vuelva a ingresar");
                        System.out.println("Ingrese un numero entre 4 y 16 para el tamaño: ");
                        n = read.nextInt();
                        System.out.println("Ingrese un caracter para hacer la figura: ");
                        sym = read.next().charAt(0);
                    }
                    for (int i = 1; i<=n;i++){
                        for (int j = c; j>n;j--){
                            
                           System.out.print(" ");
                        }
                        c--;
                        for (int k =1; k<=n; k++){
                            
                        System.out.print(sym);
                        }
                        System.out.println();
                    }
                        
                    break;
                }
                case 2:{
                    System.out.println("Ingrese un numero: ");
                    int k = read.nextInt();
                    int n=0;int cont = 0;
                    double sumatoria = 0;
                    while (cont < k){
                        
                        n = cont + 1;
                      
                        sumatoria = sumatoria + 4*(Math.pow(n, -1))/(2*n+1);
                        cont ++;
                    }
                    System.out.println(sumatoria);
                    break;
                }
                case 3:{
                    System.out.println("Ingrese un numero: ");
                    int n = read.nextInt();
                    while (n < 4 ){
                        System.out.println("Dato incorrecto");
                        System.out.println("Ingrese un numero: ");
                        n = read.nextInt();
                    }
                    for (int i=1; i<=n;i++){
                        for (int j=1; j>n;j--){
                            System.out.print(" ");
                            if (j == n){
                                for (int k=1; k>i;k++){
                                      System.out.print('*');
                                }
                              
                            }
                        }
                        System.out.println();
                    }
                    break;
                }
                case 4:{
                    System.out.println("Ha salido del menu");
                    break;
                }
                
                
                
                
                
                
                
                default:
            }
        }
    }
}
