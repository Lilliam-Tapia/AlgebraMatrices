import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner lector = new Scanner(System.in);
        int intentos = 3;
        int opc,i,j;
        int filas1,filas2,columnas1,columnas2,filas,columnas;
        int filasA,filasB,columnasA,columnasB;
      

        System.out.println("-------**Menu de opciones**-------");
        System.out.println("1)Verificar si dos matrices son iguales o no.");
        System.out.println("2)Sumar 2 matrices.");
        System.out.println("3)Generar una matriz 0 de n x m.");
        System.out.println("4)Obtener el inverso aditivo de una matriz de n x m.");
        System.out.println("5)Restar 2 matrices." );
        System.out.println("6)Multiplicar un escalar por una matriz de n x m.");
        System.out.println("7)Multiplicar 2 matrices compatibles.");
        System.out.println("8)Obtener una matriz identidad de tamaño n.");
        System.out.println("9)Obtener la inversa de una matriz de tamaño n.");
        System.out.println("10)Obtener el determinante de una matriz de tamaño n.");
        System.out.println("11)Salir");
        do {
            System.out.print("Ingresa una opción: ");
            opc = lector.nextInt();
            
            if (opc <= 0 || opc > 11) {
                intentos--;
                System.out.println("Opción inválida. Intenta nuevamente.");
            }
            
            if (intentos <= 0) {
                System.out.println("Has alcanzado el límite de intentos. Saliendo del programa.");
                return;
            }
           } while (opc <= 0 || opc > 11);

           switch(opc){

            case 1:
            do{
            System.out.print("Ingrese el número de filas de la matriz A:");
            filas1  = lector.nextInt();
            if(filas1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columnas1 = lector.nextInt();
           
            if(columnas1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
           

     int[][] matriz1 = new int[filas1][columnas1];

           System.out.println("Ingrese los elementos de la matriz A:");
           for (i = 0; i < filas1; i++) {
           for (j = 0; j < columnas1; j++) {
        System.out.print("Matriz 1[" + i + "][" + j + "]: ");
        matriz1[i][j] = lector.nextInt();
        }
     }

     System.out.println("La matriz 1 que ingresó es:");
     for (i = 0; i < filas1; i++) {
     for ( j = 0; j < columnas1; j++) {
        System.out.print(matriz1[i][j] + " "); 
    }
    System.out.println(); 
     }
     do{
            System.out.print("Ingrese el número de filas de la matriz B:");
            filas2  = lector.nextInt();
            if(filas2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
            System.out.print("Ingrese el número de columnas de la matriz B:");
            columnas2  = lector.nextInt();
            if(columnas2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
    
    int[][] matriz2 = new int[filas2][columnas2];

System.out.println("Ingrese los elementos de la matriz B:");
for (i = 0; i < filas2; i++) {
    for (j = 0; j < columnas2; j++) {
        System.out.print("Matriz B[" + i + "][" + j + "]: ");
        matriz2[i][j] = lector.nextInt();
    }
}

    System.out.println("La matriz B que ingresó es:");
    for ( i = 0; i < filas2; i++) {
    for (j = 0; j < columnas2; j++) {
        System.out.print(matriz2[i][j] + " "); 
    }
    System.out.println(); 
    }

    if (filas1 == filas2 && columnas1 == columnas2) {
    for ( i = 0; i < filas1; i++) {
        for (j = 0; j < columnas1; j++) {
            if (matriz1[i][j] != matriz2[i][j]) {
                System.out.println("Las matrices son diferentes.");
                return;
            }
        }
    }
    System.out.println("Las matrices son iguales.");
    } else {
    System.out.println("Las matrices son diferentes.");
           break;
           
         }
         case 2:
         do{
            System.out.print("Ingrese el número de filas de la matriz A:");
            filas1  = lector.nextInt();
            if(filas1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
         do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columnas1 = lector.nextInt();
           
            if(columnas1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
     do{
            System.out.print("Ingrese el número de filas de la matriz B:");
            filas2  = lector.nextInt();
            if(filas2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
            System.out.print("Ingrese el número de columnas de la matriz B:");
            columnas2  = lector.nextInt();
            if(columnas2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
    int[][] mariz1 = new int[filas1][columnas1];
    int[][] mariz2 = new int[filas2][columnas2];


    System.out.println("Ingrese los elementos de la primera matriz: ");
    for (i = 0; i < filas1; i++) {
      for ( j = 0; j < columnas1; j++) {
        System.out.print(" [" + i + "][" + j + "]:");
        mariz1[i][j] = lector.nextInt();
      }
    }

    System.out.println("Ingrese los elementos de la segunda matriz: ");
    for ( i = 0; i < filas2; i++) {
      for ( j = 0; j < columnas2; j++) {
        System.out.print("[" + i + "][" + j + "]:");
        mariz2[i][j] = lector.nextInt();
      }
    }

    if (filas1 != filas2 || columnas1 != columnas2) {
      System.out.println("No se pueden sumar las matrices porque no tienen el mismo tamaño.");
      return;
    }

    int[][] matrizC = new int[filas1][columnas1];

    for (i = 0 ; i < filas1; i++) {
      for (j = 0; j < columnas1; j++) {
        matrizC[i][j] = mariz1[i][j] + mariz2[i][j];
      }
    }

    System.out.println("La suma de las matrices es:");
    for (i = 0; i < filas1; i++) {
      for ( j = 0; j < columnas1; j++) {
        System.out.print("["+matrizC[i][j] + "]");
      }
      System.out.println();
    }
         break;
         
        case 3:
        do{
        System.out.print("Ingrese el número de filas: ");
        filas1 = lector.nextInt();
        if(filas1 <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("Se supero el numero maximo de intentos.");
        }
        do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("Se supero el numero maximo de intentos.");
        }

        int[][] matriz = new int[filas1][columnas];

        System.out.println("Matriz de ceros:");
        for ( i = 0; i < filas1; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("["+matriz[i] [j] +"]");
            }
            System.out.println();
        }
        break;
        case 4:
         do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("Se supero el numero maximo de intentos.");
        }
        do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("Se supero el numero maximo de intentos.");
        }

        int[][] matrz = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz:");
        for (i = 0; i < filas; i++) {
            for (j= 0; j < columnas; j++) {
                System.out.print(" [" + i + "][" + j + "]: ");
                matrz[i][j] =  lector.nextInt();
            }
        }

        int[][] inversoAditivo = new int[filas][columnas];

        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                inversoAditivo[i][j] = -matrz[i][j];
            }
        }
        System.out.println("Inverso Aditivo:");
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print("["+inversoAditivo[i][j] + " ]");
            }
            System.out.println();
        }
        break;
        case 5:
         do{
            System.out.print("Ingrese el número de filas de la primera matriz:");
            filas1  = lector.nextInt();
            if(filas1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la segunda matriz:");
                 columnas1 = lector.nextInt();
           
            if(columnas1 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
            System.out.print("Ingrese el número de filas de la segunda matriz:");
            filas2  = lector.nextInt();
            if(filas2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la segunda matriz :");
                 columnas2 = lector.nextInt();
           
            if(columnas2 <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
           
    
        int[][] matr1 = new int[filas1][columnas1];
        int[][] matr2 = new int[filas2][columnas2];
    
        System.out.println("Ingrese los elementos de la primera matriz:"); 
        for (i = 0; i < filas1; i++) {
          for ( j = 0; j < columnas1; j++) {
            System.out.print("[" + i + "][" + j + "]:");
            matr1[i][j] = lector.nextInt();
          }
        }
        System.out.println("Ingrese los elementos de la segunda matriz:");
        for (i = 0; i < filas2; i++) {
          for ( j = 0; j < columnas2; j++) {
            System.out.print("[" + i + "][" + j + "]:");
            matr2[i][j] = lector.nextInt();
          }
        }
        if (filas1 != filas2 || columnas1 != columnas2) {
          System.out.println("No se pueden restar las matrices porque no tienen el mismo tamaño.");
          return;
        }
  
        int[][] matrizc = new int[filas1][columnas1];
    
        for ( i = 0; i < filas1; i++) {
          for ( j = 0; j < columnas1; j++) {
            matrizc[i][j] = matr1[i][j] - matr2[i][j];
          }
        }
        System.out.println("La resta de las matrices es:");
        for ( i = 0; i < filas1; i++) {
          for ( j = 0; j < columnas1; j++) {
            System.out.print("["+matrizc [i][j] + "]"); 
          }
          System.out.println();
        }
        break;
        
        case 6:
        do{
            System.out.print("Ingrese el número de filas de la matriz:");
            filas  = lector.nextInt();
            if(filas <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
         do{
                 System.out.print("Ingrese el número de columnas de la matriz:");
                 columnas = lector.nextInt();
           
            if(columnas <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
        
        int[][] matrizOriginal = new int[filas][columnas];
        System.out.println("Ingrese los valores de la matriz:");
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("[" + (i+1) + "," + (j+1) + "]: ");
                matrizOriginal[i][j] = lector.nextInt();
            }
        }
        
        System.out.print("Ingrese el valor del escalar: ");
        int escalar = lector.nextInt();

        int[][] matrizResultado = new int[filas][columnas];
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                matrizResultado[i][j] = matrizOriginal[i][j] * escalar;
            }
        }
        System.out.println("Matriz resultado:");
        for (i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print("["+matrizResultado[i][j] + "]");
            }
            System.out.println();
        }
        break;

        case 7:
         do{
            System.out.print("Ingrese el número de filas de la matriz A:");
            filasA  = lector.nextInt();
            if(filasA <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columnasA = lector.nextInt();
           
            if(columnasA <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
         do{
            System.out.print("Ingrese el número de filas de la matriz A:");
            filasB  = lector.nextInt();
            if(filasB <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }
            do{
                 System.out.print("Ingrese el número de columnas de la matriz A:");
                 columnasB = lector.nextInt();
           
            if(columnasB <= 0){
                System.out.println("El valor debe ser mayor a cero.");
                intentos--;
            }else{
                break;
            }   
            }while(intentos > 0);
            if(intentos == 0){
                System.out.println("Se supero el numero maximo de intentos.");
                break;
            }

        if (columnasA != columnasB) {
            System.out.println("Error: Las matrices no son compatibles para la multiplicación.");
            return;
        }

        int[][] matrizA = new int[filasA][columnasA];
        int[][] matrizB = new int[columnasA][columnasB];

        System.out.println("Ingrese los elementos de la matriz A:");
        for ( i = 0; i < filasA; i++) {
            for (j = 0; j < columnasA; j++) {
              System.out.print("[" +(i+1) + "][" + (j+1) + "]:");
                matrizA[i][j] = lector.nextInt();
            }
        }

        System.out.println("Ingrese los elementos de la matriz B:");
        for ( i = 0; i < columnasA; i++) {
            for ( j = 0; j < columnasB; j++) {
              System.out.print("[" + (i+1) + "][" + (j+1) + "]:");
                matrizB[i][j] = lector.nextInt();
            }
        }

        int[][] MatrizResultado = new int[filasA][columnasB];

        for ( i = 0; i < filasA; i++) {
            for (j = 0; j < columnasB; j++) {
                for (int k = 0; k < columnasA; k++) {
                    MatrizResultado[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }

        System.out.println("El resultado de la multiplicación de matrices es:");
        for (i = 0; i < filasA; i++) {
            for ( j = 0; j < columnasB; j++) {
                System.out.print("["+MatrizResultado[i][j] + "]");
            }
            System.out.println();
        }
        break;

        case 8:
        do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
       }while(intentos > 0);
       if(intentos == 0){
        System.out.println("Se supero el numero maximo de intentos.");
        break;
       }

        do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <=0){
          System.out.println("El valor debe ser mayor a cero.");
          intentos--;
        }else{
          break;
        }
      }while(intentos > 0);
        if (intentos == 0){
          System.out.println("Se supero el numero maximo de intentos.");
        }
        
        int[][] mtriz = new int[filas][columnas];

        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                if (i == j) {
                    mtriz[i][j] = 1;
                } else {
                    mtriz[i][j] = 0;
                }
            }
        }
        for (i = 0; i < filas; i++) {
            for (j = 0; j < columnas; j++) {
                System.out.print("["+mtriz[i][j] + "]");
            }
            System.out.println();
        }
        
        break;
        case 9:
        do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }while(intentos>0);
         if(intentos == 0){
            System.out.println("Se supero el numero maximmo de intentos");
            break;
         }
         do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }while(intentos>0);
         if(intentos == 0){
            System.out.println("Se supero el numero maximmo de intentos");
            break;
         }

        if (filas != columnas) {
            System.out.println("La matriz debe ser cuadrada para tener inversa.");
            return;
        }

        float [][] matriza = new float [filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for (i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
              System.out.print(" [" + (i+1) + "][" + (j+1)+ "]:");
           matriza[i][j] = lector.nextFloat();
            }
        }
        float [][] identidad = new float [filas][filas];

        for ( i = 0; i < filas; i++) {
            identidad[i][i] = 1;
        }

        for ( i = 0; i < filas; i++) {
            int max = i;
            for ( j = i + 1; j < filas; j++) {
                if (Math.abs(matriza[j][i]) > Math.abs(matriza[max][i])) {
                    max = j;
                }
            }

            float [] temp = matriza[i];
            matriza[i] = matriza[max];
            matriza[max] = temp;

            temp = identidad[i];
            identidad[i] = identidad[max];
            identidad[max] = temp;

            if (matriza[i][i] == 0) {
                System.out.println("La matriz no tiene inversa.");
                return;
            }
            float divisor = matriza[i][i];
            for (j = 0; j < columnas; j++) {
                matriza[i][j] /= divisor;
                identidad[i][j] /= divisor;
            }
            for (j = i + 1; j < filas; j++) {
                float  factor = matriza[j][i];
                for ( int k = 0; k < columnas; k++) {
                    matriza[j][k] -= factor * matriza[i][k];
                    identidad[j][k] -= factor * identidad[i][k];
                }
            }
        }
        for ( i = filas - 1; i > 0; i--) {
            for ( j = i - 1; j >= 0; j--) {
                float factor = matriza[j][i];
                for (int k = 0; k < columnas; k++) {
                    matriza[j][k] -= factor * matriza[i][k];
                    identidad[j][k] -= factor * identidad[i][k];
                }
            }
        }

        System.out.println("La inversa de la matriza es:");
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                System.out.print("["+identidad[i][j] + "] ");
            }
            System.out.println();
        }                                          
        break;

        case 10:
       
         do{
        System.out.print("Ingrese el número de filas: ");
        filas = lector.nextInt();
        if(filas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }while(intentos>0);
         if(intentos == 0){
            System.out.println("Se supero el numero maximmo de intentos");
            break;
         }
         do{
        System.out.print("Ingrese el número de columnas: ");
        columnas = lector.nextInt();
        if(columnas <= 0){
            System.out.println("El valor debe ser mayor a cero.");
            intentos--;
        }else{
            break;
        }
         }while(intentos>0);
         if(intentos == 0){
            System.out.println("Se supero el numero maximmo de intentos");
            break;
         }
         
        if (filas != columnas) {
            System.out.println("La matriz debe ser cuadrada para tener inversa.");
            return;
        }
        
        if (filas != columnas) {
            System.out.println("La matriz debe ser cuadrada para calcular el determinante.");
            return;
        }
        int [][] mariz = new int [filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");
        for ( i = 0; i < filas; i++) {
            for ( j = 0; j < columnas; j++) {
                 System.out.print(" [" + (i+1) + "][" + (j+1)+ "]:");
                mariz[i][j] = lector.nextInt();
            }
        }
        int det = 1;
        for ( i = 0; i < filas; i++) {
            int max = i;
            for ( j = i + 1; j < filas; j++) {
                if (Math.abs(mariz[j][i]) > Math.abs(mariz[max][i])) {
                    max = j;
                }
            }

            int [] temp = mariz[i];
            mariz[i] = mariz[max];
            mariz[max] = temp;

            if (mariz[i][i] == 0) {
                System.out.println("La martiz es singular y no tiene determinante.");
                return;
            }

            det *= mariz[i][i];

            int divisor = mariz[i][i];
            for ( j = 0; j < columnas; j++) {
                mariz[i][j] /= divisor;
            }

            for (j = i + 1; j < filas; j++) {
                int factor = mariz[j][i];
                for (int k = 0; k < columnas; k++) {
                    mariz[j][k] -= factor * mariz[i][k];
                }
            }
        }
        System.out.println("El determinante de la matriz es: " + det);

        break;

        case 11:

        System.out.println("Ha decidido salir de el programa. ¡Vuelva pronto!");
        break;

       }
       
    }
}
