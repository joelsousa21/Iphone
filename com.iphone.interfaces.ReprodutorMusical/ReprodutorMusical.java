public interface ReprodutorMusical {
    void tocar();
    void pausar();
    void parar();
    void faixaSeguinte();
    void faixaAnterior();
}
    @Override
    public void tocar() {
        if (!isPlaying) {
            System.out.println("Reproduzindo música.");
            isPlaying = true;
        }
    }

    @Override
    public void pausar() {
        if (isPlaying) {
            System.out.println("Pausando música.");
            isPlaying = false;
        }
    }

    @Override
    public void parar() {
        System.out.println("Parando música.");
        isPlaying = false;
        currentTrack = "";
    }

    @Override
    public void faixaSeguinte() {
        System.out.println("Próxima faixa.");
    }

    @Override
    public void faixaAnterior() {
        System.out.println("Faixa anterior.");
    }