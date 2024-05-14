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


    @Override
    public void mostrarFunciones() {
        System.out.println("1. Algunos protistas, como las algas unicelulares, son organismos fotosintéticos capaces de producir oxígeno a través del proceso de la fotosíntesis");
        System.out.println("2. Ciertos protistas, como los protozoos heterótrofos, desempeñan un papel importante en la descomposición de materia orgánica en diversos ecosistemas acuáticos y terrestres");
        System.out.println("3. Las algas simbióticas conocidas como zooxantelas, que pertenecen al reino Protista, viven en simbiosis con los corales.");
        System.out.println("4. Algunos protistas, como los protozoos depredadores, se utilizan en el control biológico de plagas agrícolas.");
        System.out.println("5. Ciertos protistas, como las diatomeas y los protozoos ciliados, son sensibles a los cambios en la calidad del agua.");
    }
}
