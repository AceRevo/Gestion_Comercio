package modelo;

public class TiendaFisica extends Comercio {
    private int numeroEmpleados;
    private final int costeBase = 1000;
    private final int COSTE_SI_EMP_5 = 200;

    public TiendaFisica(String ID, String nombre, String ciudad, TipoComercio tipoComercio, int numeroEmpleados) {
        super(ID, nombre, ciudad, tipoComercio);
        this.numeroEmpleados = numeroEmpleados;
    }

    public int getNumeroEmpleados() {
        return numeroEmpleados;
    }

    public int getCosteBase() {
        return costeBase;
    }

    public int getCOSTE_SI_EMP_5() {
        return COSTE_SI_EMP_5;
    }

    public void setNumeroEmpleados(int numeroEmpleados) {
        this.numeroEmpleados = numeroEmpleados;
    }

    @Override
    public double calcularCosteOperacion() {
        int costeFinal;

        costeFinal = costeBase;
        costeFinal = numeroEmpleados > 5 ? (costeBase + COSTE_SI_EMP_5) :(costeBase);

        if (numeroEmpleados > 5){
            costeFinal = costeBase + COSTE_SI_EMP_5;
        }else {
            costeFinal = costeBase;
        }
        return costeFinal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(super.toString());
        sb.append(String.format("numeroEmpleados= %s, coste operacione=%f", numeroEmpleados, calcularCosteOperacion()));

        return  sb.toString();


    }

}
