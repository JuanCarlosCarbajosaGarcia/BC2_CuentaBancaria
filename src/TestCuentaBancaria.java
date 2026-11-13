public class TestCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuentaMaria = new CuentaBancaria("María",150.30);

        System.out.println(cuentaMaria);

        System.out.println("titular: " + cuentaMaria.getTitular());

        cuentaMaria.ingresar(2195.12);

        System.out.println(cuentaMaria);

        cuentaMaria.retirar(2345.42);
    }
}
