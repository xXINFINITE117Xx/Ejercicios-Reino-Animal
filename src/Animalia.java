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

    @Override
    public void mostrarFunciones() {
        System.out.println("1. Muchos animales, como insectos (abejas, avispas, mariposas), aves y algunos murciélagos, desempeñan un papel crucial en la polinización de plantas. ");
        System.out.println("2. Los depredadores, como grandes felinos, lobos, aves rapaces y tiburones, contribuyen al control de las poblaciones de otras especies animales al alimentarse de ellas.");
        System.out.println("3. Muchos animales, como aves, mamíferos y algunos reptiles, actúan como dispersores de semillas.");
        System.out.println("4. Los animales descomponedores, como gusanos, escarabajos y algunos crustáceos, desempeñan un papel crucial en el reciclaje de nutrientes al alimentarse de materia orgánica en descomposición.");
        System.out.println("5. Ciertas especies animales, conocidas como especies clave, juegan un papel fundamental en la regulación y el mantenimiento de los ecosistemas.");
    }
}
