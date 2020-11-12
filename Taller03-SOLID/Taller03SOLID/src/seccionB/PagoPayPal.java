package seccionB;

public class PagoPayPal extends Pago{
    private boolean loggedIn; //conexion a cuenta PayPal
    @Override
    public void realizarCobro(double monto) {
        if(!loggedIn) {
            logIn() ;
        }
        // cargar el monto de compra al medio de pago
    }
    private void logIn(){
        loggedIn =true;
    }
}


