class Protista extends Reino {
    public Protista() {
        super("Protista");
    }

    @Override
    public void mostrarCaracteristicas() {
        System.out.println("- Características del reino Protista: Mayormente unicelularidad, Autotrofía o heterotrofía, Diversidad morfológica.");
    }

    @Override
    public void listarEspecies() {
        System.out.println("1. Protozoos");
        System.out.println("2. Algas");
        System.out.println("3. Masculino");
        System.out.println("4. Femenino");
        System.out.println("5. Raices");
    }
}
