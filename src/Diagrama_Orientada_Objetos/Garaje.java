package Diagrama_Orientada_Objetos;

class Garaje {
    private String id;
    private String direccion;

    public Garaje(String id, String direccion) {
        this.id = id;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Garaje{" +
                "id='" + id + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
