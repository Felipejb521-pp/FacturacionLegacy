package facturacion;
public class FacturacionLegacy {

    // 
    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_SOCIO = 0.15;
    private static final double DESCUENTO_TIPO2 = 0.05;

    // Algoritmo:
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {

                
        if (importeBase > 0) {
            if (tipoCliente == 1) {
                if (esSocioVip) {
                    return importeBase - (importeBase * DESCUENTO_VIP);
                } else {
                    return importeBase - (importeBase * DESCUENTO_SOCIO);
                }
            } else {
                if (tipoCliente == 2) {
                    return importeBase - (importeBase * DESCUENTO_TIPO2);
                } else {
                    return importeBase;
                }
            }
        } else {
            return 0;
        }
    }
}