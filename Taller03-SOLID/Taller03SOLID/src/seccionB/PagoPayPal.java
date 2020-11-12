package seccionB;

public class PagoPayPal implements IPago{
    private boolean loggedIn; //conexion a cuenta PayPal
    @Override
    public void realizarCobro(double monto) {
        if(!loggedIn) {
                return ;
        }
        // cargar el monto de compra al medio de pago
    }
}
