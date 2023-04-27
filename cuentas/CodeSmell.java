package cuentas;

public class CodeSmell {

    //CALCULADORA DE IMPUESTOS



    //este seria un codigo smell que calcula los impuestos, descuentos y el costo total se mezclan juntos.
    // Esto dificulta la comprensión y mantenimiento del código.

/*
    public double calcularCostoTotal (double precio, double cantidad ){
        double total = precio * cantidad;
        double tasa_impuestos = 0.08;
        double impuestos = total * tasa_impuestos,
        descuento = 0;
        if (cantidad > 100){
            descuento = 0.1 * total;
        }
        double costo_total = total + impuestos - descuento;
        return costo_total;
    }
*/
    //asi se arreglaria

    private final double tasa_impuestos = 0.08;

    public double calcular_costo_total(double precio, double cantidad) {
        double total = precio * cantidad;
        double impuestos = calcular_impuestos(total);
        double descuento = calcular_descuento(total, cantidad);
        double costo_total = total + impuestos - descuento;
        return costo_total;
    }


    public double calcular_impuestos(double total){
        return total * tasa_impuestos;
    }



    public double calcular_descuento(double total, double cantidad){
        double descuento = 0;
        if (cantidad > 100){
            descuento = 0.1 * total;
        }
        return descuento;
    }





}
