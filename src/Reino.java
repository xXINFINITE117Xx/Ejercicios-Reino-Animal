abstract class Reino {
    private String nombre;

    public Reino(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void mostrarCaracteristicas();

    public abstract void listarEspecies();

    public abstract void mostrarFunciones();
}
