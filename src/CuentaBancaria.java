public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldo) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("Titular no puede ser nulo o vacio.");
        }
        if (saldo < 0){
            throw new IllegalArgumentException("saldo no puede ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo){
            throw new IllegalArgumentException("Saldo insuficiente.");
        }

        if (cantidad <= 0){
            throw new IllegalArgumentException("La cantidad no puede ser menor que 0.");
        }

        //retirada de lasdo
        saldo -= cantidad;
        System.out.println("retirado: " + cantidad);
        System.out.println("Saldo restante: " + saldo);
    }

    public void ingresar(double cantidad) {
        if (cantidad<=0){
            throw new IllegalArgumentException("ingreso debe ser mayor que 0.");
        }

        saldo += cantidad;
        System.out.println("ingreso realizado con exito");
        System.out.println("ingreso: " + cantidad);
        System.out.println("saldo total: " + saldo);
    }

    @Override
    public String toString() {
        return "CuentaBancaria [" +
                "titular=" + titular +
                ", saldo=" + saldo + "]";
    }

}
