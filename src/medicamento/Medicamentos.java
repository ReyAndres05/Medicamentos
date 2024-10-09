package medicamento;

public class Medicamentos {

    private String nombre;
    private String fabricante;
    private String viaAdministracion;
    private Posologia posologia;

    public Medicamentos(String nombre, String fabricante,
            String viaAdministracion) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.viaAdministracion = viaAdministracion;
    }

    public void setPosologia(Posologia posologia) {
        this.posologia = posologia;
    }

    public void mostrarDatos() {
        System.out.println("Nombre del medicamento: " + nombre);
        System.out.println("Empresa fabricante: " + fabricante);
        System.out.println("Via de administración: " + viaAdministracion);
    }

    public class Posologia {

        private String usuarios;
        private int dosis;
        private String intervaloTiempo;
        private String recomendaciones;

        public Posologia(String usuarios, int dosis,
                String intervaloTiempo, String recomendaciones) {
            this.usuarios = usuarios;
            this.dosis = dosis;
            this.intervaloTiempo = intervaloTiempo;
            this.recomendaciones = recomendaciones;
        }

        public void mostrarDatos() {

            System.out.println("Usuarios: " + usuarios);
            System.out.println("Dosis: " + dosis);
            System.out.println("Periodo: " + intervaloTiempo);
            System.out.println("Recomendaciones: " + recomendaciones);
        }
    }
}
