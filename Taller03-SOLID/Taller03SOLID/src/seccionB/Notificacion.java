package seccionB;

public class Notificacion {
    private int tipoNotificacion;
    public void notificar(IPago pago) {
            if(tipoNotificacion==1) {
                    //enviarEmail();
            }
            else {
                    //enviarSMS();
            }
    }
}
