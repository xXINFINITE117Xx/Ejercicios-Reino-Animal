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

    @Override
    public void mostrarFunciones(){
        System.out.println("1. Las plantas realizan la fotosíntesis, un proceso en el cual utilizan la energía de la luz solar, el dióxido de carbono y el agua para producir glucosa (su alimento) y liberar oxígeno como subproducto.");
        System.out.println("2. Las raíces de las plantas ayudan a fijar el suelo, evitando la erosión causada por el viento y el agua.");
        System.out.println("3. Las plantas proporcionan hábitat y alimento para una amplia variedad de organismos, como insectos, aves, mamíferos y hongos.");
        System.out.println("4. Las plantas desempeñan un papel crucial en el ciclo del agua.");
        System.out.println("5. Las plantas producen una amplia gama de compuestos químicos, como aceites esenciales, alcaloides, terpenos y flavonoides, que tienen diversas aplicaciones en la industria farmacéutica, alimentaria y cosmética.");
    }
}
