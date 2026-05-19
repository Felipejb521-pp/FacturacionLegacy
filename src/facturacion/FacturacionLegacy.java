
package facturacion;

public class FacturacionLegacy {

    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_SOCIO = 0.15;
    private static final double DESCUENTO_ESTANDAR = 0.05;

    /**
     * Calcula el total a pagar por un cliente aplicando su descuento correspondiente.
     *
     * @param importeBase  Importe bruto de la factura antes de aplicar descuentos.
     * @param tipoCliente  Categoría del cliente
     * @param esSocioVip   Indica si el cliente VIP tiene descuento extra 
     * @return             Importe final con el descuento aplicado
     */

    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        if (importeBase <= 0) {
            return 0;
        }

        if (tipoCliente == 1 && esSocioVip) {
            return importeBase - (importeBase * DESCUENTO_VIP);
        }

        if (tipoCliente == 1) {
            return importeBase - (importeBase * DESCUENTO_SOCIO);
        }

        if (tipoCliente == 2) {
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        }

        return importeBase;
    }

}
