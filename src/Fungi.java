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
    @Override
    public void mostrarFunciones(){
        System.out.println("1. Los hongos desempeñan un papel crucial en la descomposición de materia orgánica, como hojas caídas, madera muerta y restos de plantas. A través de la secreción de enzimas");
        System.out.println("2. Muchos hongos forman asociaciones simbióticas con las raíces de las plantas, conocidas como micorrizas. Estas asociaciones son mutuamente beneficiosas");
        System.out.println("3. Los hongos producen una amplia gama de metabolitos secundarios, como antibióticos, pigmentos, toxinas y compuestos.");
        System.out.println("4. Algunos hongos, como las levaduras, son fundamentales en el proceso de fermentación de alimentos.");
        System.out.println("5. Ciertos hongos pueden actuar como patógenos y causar enfermedades en plantas y animales.");
    }
}
