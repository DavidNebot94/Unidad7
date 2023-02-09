public class MarcaPagina {
    private int ultimaPagina;
    public MarcaPagina() {ultimaPagina = 1;}
    void siguientePagina() {ultimaPagina ++;}
    void comenzar() {ultimaPagina = 1;}
    int ultimaPagina() { return ultimaPagina;}
}
