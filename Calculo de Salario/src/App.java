import java.util.Scanner;

public class App {
    static final double tasaInss = 7.0;
    static final double tasaIr = 15.6;
    static final double tasaInssPatronal = 22.5;
    static final double tasaSindicato = 1.0;
    static final double tasaAntiguedad = 15.0;
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        double SalarioBruto, ingresoTotal, ingresoNeto;
        double ingresoAntiguedad, deduccionesTotales;
        double deduccionInss,deduccionIR;
        double deduccionSindicato, deduccionInssPatronal;

        System.out.println("Ingrese su salario bruto (basico): ");
        SalarioBruto = lector.nextDouble();

        ingresoAntiguedad = SalarioBruto * (tasaAntiguedad/100);
        ingresoTotal = SalarioBruto + ingresoAntiguedad;
        deduccionSindicato = SalarioBruto * (tasaSindicato/100);
        deduccionInss = ingresoTotal * (tasaInss/100);
        deduccionIR = ingresoTotal * (tasaIr/100);
        deduccionesTotales = deduccionInss + deduccionIR + deduccionSindicato;
        ingresoNeto = ingresoTotal - deduccionesTotales;
        deduccionInssPatronal = ingresoTotal  * (tasaInssPatronal/100);

        System.out.println("Reporte de salario mensual");
        System.out.println("::::::::::::::::::::::::::::::");
        System.out.println("Salario Bruto: " + SalarioBruto);
        System.out.println("Ingresos por antiguedad: " + ingresoAntiguedad);
        System.out.println("Ingresos Totales: " + ingresoTotal);
        System.out.println("Ingreso Neto: " + ingresoNeto);
        System.out.println("::::::::::::::::::::::::::::::::");
        System.out.println("Deduccion por INSS: " + deduccionInss);
        System.out.println("Deduccion por IR: " + deduccionIR);
        System.out.println("Deduccion por afiliacion al sindicato: " + deduccionSindicato);
        System.out.println("Deducciones Totales : " + deduccionesTotales);
        System.out.println("Deduccion a la empresa (INSS Patronal): " + deduccionInssPatronal);
        System.out.println("Gracias por utilizar esta App");
        lector.close();

    }
}
