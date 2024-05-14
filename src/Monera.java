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

    @Override
    public void mostrarFunciones() {
        System.out.println("1. Muchas bacterias desempeñan un papel fundamental en la descomposición de materia orgánica, como restos de plantas y animales.");
        System.out.println("2. Ciertas bacterias, conocidas como bacterias fijadoras de nitrógeno, tienen la capacidad de convertir el nitrógeno atmosférico en compuestos de nitrógeno que pueden ser utilizados por las plantas.");
        System.out.println("3. Las bacterias son capaces de producir una amplia variedad de compuestos químicos, como antibióticos, enzimas, vitaminas y ácidos orgánicos.");
        System.out.println("4. Algunas bacterias establecen relaciones simbióticas con otros organismos, como plantas y animales.");
        System.out.println("5. Ciertas bacterias tienen la capacidad de degradar contaminantes ambientales, como hidrocarburos, pesticidas y metales pesados.");
    }
}
