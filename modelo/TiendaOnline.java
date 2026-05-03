package modelo;

public class TiendaOnline extends Comercio{
    private boolean tieneEnvioInternacional;
    public final int costeBse = 500;
    public  final int COSTE_SI_ENV_INT = 150;

    public TiendaOnline(String ID, String nombre, String ciudad, TipoComercio tipoComercio, boolean tieneEnvioInternacional) {
        super(ID, nombre, ciudad, tipoComercio);
        this.tieneEnvioInternacional = tieneEnvioInternacional;
    }

    public boolean isTieneEnvioInternacional() {
        return tieneEnvioInternacional;
    }

    public int getCosteBse() {
        return costeBse;
    }

    public int getCOSTE_SI_ENV_INT() {
        return COSTE_SI_ENV_INT;
    }

    public void setTieneEnvioInternacional(boolean tieneEnvioInternacional) {
        this.tieneEnvioInternacional = tieneEnvioInternacional;
    }

    @Override
    public String toString() {
       StringBuilder sb = new StringBuilder();
       sb.append(super.toString());
       sb.append(String.format("tiene envio internacional = %b, coste de operacion = %.3f", tieneEnvioInternacional, calcularCosteOperacion()));

       return sb.toString();
    }

    @Override
    public double calcularCosteOperacion() {
        return  tieneEnvioInternacional ? costeBse + COSTE_SI_ENV_INT : costeBse;
    }
}
