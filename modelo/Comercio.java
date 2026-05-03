package modelo;

    public abstract  class Comercio{
        private final String ID;
        private  String nombre;
        private  String ciudad;
        private  TipoComercio tipoComercio;

        public Comercio(String ID, String nombre, String ciudad, TipoComercio tipoComercio) {
            this.ID = ID;
            this.nombre = nombre;
            this.ciudad = ciudad;
            this.tipoComercio = tipoComercio;
        }

        public String getID() {
            return ID;
        }

        public String getNombre() {
            return nombre;
        }

        public String getCiudad() {
            return ciudad;
        }

        public TipoComercio getTipoComercio() {
            return tipoComercio;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }

        public void setTipoComercio(TipoComercio tipoComercio) {
            this.tipoComercio = tipoComercio;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();

            sb.append(String.format("ID = %s, NOMBRE = %s, CIUDAD = %s, TIPO COMERCIO = %s", this.ID, this.nombre, this.ciudad, this.tipoComercio));

            return sb.toString();
        }
        public  abstract  double calcularCosteOperacion();
    }
