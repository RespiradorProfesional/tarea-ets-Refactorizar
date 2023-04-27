package cuentas;

    public class CCuenta {

        private String nombre; // Nombre del titular de la cuenta.
        private String cuenta; // Número de la cuenta bancaria.
        private double saldo; // Saldo disponible en la cuenta.
        private double tipoInterés; // Tipo de interés de la cuenta.

        /**
         Constructor vacío de la clase CCuenta.
         */
        public CCuenta() {
        }
        /**

         Constructor de la clase CCuenta que inicializa los atributos de la cuenta bancaria.
         @param nom el nombre del titular de la cuenta.
         @param cue el número de la cuenta bancaria.
         @param sal el saldo disponible en la cuenta.
         @param tipo el tipo de interés de la cuenta.
         */
        public CCuenta(String nom, String cue, double sal, double tipo) {
            nombre = nom;
            cuenta = cue;
            saldo = sal;
            tipoInterés = tipo;
        }
        /**

         Método que devuelve el saldo actual de la cuenta bancaria.
         @return el saldo disponible en la cuenta.
         */
        public double estado() {
            return saldo;
        }
        /**

         Método que permite ingresar una cantidad de dinero en la cuenta bancaria.
         Metdodo que ingresa una cantidad la cual comprueba si es una cantidad negativa y lanzando un error al ser el caso
         si no, ingresa la cantidad al saldo del objeto
         @param cantidad la cantidad a ingresar.
         @throws Exception si se intenta ingresar una cantidad negativa.
         */
        public void ingresar(double cantidad) throws Exception {
            if (cantidad < 0){
                throw new Exception("No se puede ingresar una cantidad negativa");
            }
            saldo = saldo + cantidad;
        }
        /**

         Método que permite retirar una cantidad de dinero de la cuenta bancaria.
         Retira dinero del saldo del objeto, en caso de que la cantidad sea negativa o la cantidad sea mayor al saldo
         del usuario enviara un error
         @param cantidad la cantidad a retirar.
         @throws Exception si se intenta retirar una cantidad negativa o si no hay suficiente saldo disponible.
         */
        public void retirar(double cantidad) throws Exception {
            if (cantidad <= 0) {
                throw new Exception("No se puede retirar una cantidad negativa");
            }
            if (estado() < cantidad) {
                throw new Exception("No hay suficiente saldo");
            }
            saldo = saldo - cantidad;
        }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTipoInterés() {
        return tipoInterés;
    }

    public String getCuenta() {
        return cuenta;
    }
}
