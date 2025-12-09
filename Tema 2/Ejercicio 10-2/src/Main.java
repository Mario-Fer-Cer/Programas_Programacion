import java.util.Scanner;
public class Main {
    /*
    Crea un programa que pida el salario base por hora, las horas trabajadas y si ha hecho horas extra (true/false).
    Si ha hecho horas extra y trabajó más de 40 horas, las horas que excedan de 40 se pagan al doble.
    Usa operadores lógicos, relacionales y aritméticos para calcular el salario total.
     */
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int jornadaNormal = 0;
        int horasExtra = 0;
        System.out.println("Introduce el salario por hora: ");
        double salarioHora = scan.nextDouble();
        System.out.println("Introduce las horas trabajadas: ");
        int horasTrabajadas = scan.nextInt();
        boolean horaExtra = horasTrabajadas > 40;
        System.out.println("¿Has trabajado horas extra?: " + horaExtra);
        if (horasTrabajadas > 40){
            jornadaNormal = 40;
            System.out.println("Horario de jornada (Maximo 40h): " + jornadaNormal);
            horasExtra = horasTrabajadas - jornadaNormal;
            System.out.println("Horas extra: " + horasExtra);
        }else{
            System.out.println("Horario de jornada (Maximo 40h): " + horasTrabajadas);
        }
        System.out.println("Trabajaste mas de 40h: " + horaExtra);
        boolean permitido = true;
        System.out.println("Tienes derecho a horas extra: " + permitido);
        boolean aplican = horasTrabajadas > 40 && permitido == true;
        System.out.println("Se aplican horas extra: " + aplican);
        double salarioBase = salarioHora * jornadaNormal;
        System.out.println("Salario por jornada: " + salarioBase);
        double salarioExtra = (salarioHora * 2) * horasExtra;
        System.out.println("Salario por hora extra: " + salarioExtra);
        double salarioTotal = salarioExtra + salarioBase;
        System.out.println("Salario total: " + salarioTotal);

    }
}
