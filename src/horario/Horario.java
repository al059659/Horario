/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horario;

import java.util.Scanner;

/**
 *
 * @author reyap
 */
public class Horario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ingrese una hora para saber qué está programado. Recuerde usar el formato de 24 horas.");
        
        Scanner read = new Scanner(System.in);
        int hora = read.nextInt();
        
        if (hora >= 0 && hora <= 24) {
            switch (hora) {
                case 0:
                    System.out.println("0. A esta hora estoy durmiendo.");
                    break;
                case 1:
                    System.out.println("1. A esta hora estoy durmiendo.");
                    break;
                case 2:
                    System.out.println("2. A esta hora estoy durmiendo.");
                    break;
                case 3:
                    System.out.println("3. A esta hora estoy durmiendo.");
                    break;
                case 4:
                    System.out.println("4.A esta hora estoy durmiendo.");
                    break;
                case 5:
                    System.out.println("5. A esta hora estoy durmiendo.");
                    break;
                case 6:
                    System.out.println("6. A esta hora estoy despertando y arreglándome para el día.");
                    break;
                case 7:
                    System.out.println("7. A esta hora estoy teniendo mi primera clase: Administración General.");
                    break;
                case 8:
                    System.out.println("8. A esta hora estoy teniendo mi segunda clase: Organización Computacional.");
                    break;
                case 9:
                    System.out.println("9. A esta hora estoy teniendo mi segunda clase: Organización Computacional.");
                    break;
                case 10:
                    System.out.println("10. A esta hora estoy teniendo mi tercera clase: Física.");
                    break;
                case 11:
                    System.out.println("11. A esta hora estoy teniendo mi tercera clase: Física.");
                    break;
                case 12:
                    System.out.println("12. A esta hora estoy teniendo mi cuarta clase: Herramientas de la Computación.");
                    break;
                case 13:
                    System.out.println("13. A esta hora estoy jugando con mis amigos.");
                    break;
                case 14:
                    System.out.println("14. A esta hora estoy comiendo.");
                    break;
                case 15:
                    System.out.println("15. A esta hora estoy haciendo tareas, y si no, entonces estoy tomando una siesta.");
                    break;
                case 16:
                    System.out.println("16. A esta hora estoy haciendo tareas, y si no, entonces estoy tomando una siesta.");
                    break;
                case 17:
                    System.out.println("17. A esta hora estoy haciendo tareas, y si no, entonces estoy tomando una siesta.");
                    break;
                case 18:
                    System.out.println("18. A esta hora estoy recibiendo a mi madre del trabajo.");
                    break;
                case 19:
                    System.out.println("19. A esta hora estoy pasando tiempo con mi familia.");
                    break;
                case 20:
                    System.out.println("20. A esta hora estoy cenando.");
                    break;
                case 21:
                    System.out.println("21. A esta hora estoy jugando con mis amigos.");
                    break;
                case 22:
                    System.out.println("22. A esta hora estoy durmiendo.");
                    break;
                case 23:
                    System.out.println("23. A esta hora estoy durmiendo.");
                    break;
                case 24:
                    System.out.println("24. A esta hora estoy durmiendo.");
                    break;
            }
            
        } else {
            System.out.println("Por favor, introduzca una hora correspondiente al horario de 24 horas.");
        }
        
    }
    
}
