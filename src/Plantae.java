class Plantae extends Reino{
    public Plantae() {
        super("Plantae");
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("- Características del reino Plantae: Multicelularidad, Autotrofía, Celulosa en la pared celular.");
    }

    @Override
    public void listarEspecies() {
        System.out.println("1. Angiospermas");
        System.out.println("2. Gimnospermas");
        System.out.println("3. Helechos");
        System.out.println("4. Celulos");
    }
}
