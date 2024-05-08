class Monera extends Reino{
    public Monera() {
        super("Monera");
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("- Características del reino Monera: Mayormente unicelularidad, Autotrofía o heterotrofía, Ausencia de núcleo definido.");
    }

    @Override
    public void listarEspecies() {
        System.out.println("1. Bacterias");
        System.out.println("2. Arqueas");
        System.out.println("3. Microbacterias");
        System.out.println("4. Macrobacterias");
        System.out.println("5. Nucleos");
    }
}
