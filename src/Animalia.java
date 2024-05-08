class Animalia extends Reino{
    public Animalia() {
        super("Animalia");
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("- Características del reino Animalia: Multicelularidad, Heterotrofía, Movilidad.");
    }

    @Override
    public void listarEspecies() {
        System.out.println("1. Mamíferos");
        System.out.println("2. Aves");
        System.out.println("3. Peces");
        System.out.println("4. Calamares");
        System.out.println("5. Aguilas");
    }
}
