
import java.util.Scanner;

/**
 * @author 16550549
 */
public class Principal {

    public static void main(String[] args) {
        //DEFINIMOS PRIMERO LAS FILAS (GRUPOS)
        //PREGUNTAR EL NUMERO DE GRUPOS
        System.out.println("Numero de grupos");
        Scanner sCaptu = new Scanner(System.in);
        int inGpo = sCaptu.nextInt(); //iNoGpo  iNoAlu
        //CANTIDAD DE GRUPOS   
        int aiArray2D[][] = new int[inGpo][];
        int inoAlu;
        for (int i = 0; i < inGpo; i++) {
            //PREGUNTAR EL NUMERO DE ALUMNOS
            System.out.println("Numero de alumnos para el grupo" + (i + 1));
            inoAlu = sCaptu.nextInt();
            aiArray2D[i] = new int[inoAlu];
        }
        //PEDIR LOS DATOS
        for (int i = 0; i < aiArray2D.length; i++) {
            for (int j = 0; j < aiArray2D[i].length; j++) {
                System.out.println("Edad Grupo " + i + ":");
                aiArray2D[i][j] = sCaptu.nextInt();
            }
        }
        int iAcum;
        double dProm;
        for (int i = 0; i < aiArray2D.length; i++) { // i ES CADA GRUPO
            iAcum = 0;
            dProm = 0;
            for (int j = 0; j < aiArray2D[i].length; j++) {
                iAcum += aiArray2D[i][j]; //SE SUMAN TODOS LO VALORES DE CADA GRUPO

            }
            dProm = iAcum / aiArray2D[i].length;
            System.out.println("Para el grupo " + i + ", el promedio de edad es : " + dProm);
        }
    }

}
