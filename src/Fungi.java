class Fungi extends Reino{
    public Fungi() {
        super("Fungi");
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("- Características del reino Fungi: Mayormente multicelularidad, Heterotrofía, Quitina en la pared celular.");
    }

    @Override
    public void listarEspecies() {
        System.out.println("1. Hongos verdaderos");
        System.out.println("2. Levaduras");
        System.out.println("3. Mohos");
        System.out.println("4. Quitinas");
        System.out.println("5. Celulas");
    }
}
