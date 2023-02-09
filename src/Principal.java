public class Principal {

    public static void main (String[] args){
        MarcaPagina marca;
        marca = new MarcaPagina();
        marca.siguientePagina();
        marca.siguientePagina();
        marca.siguientePagina();
        System.out.println("Ultima pagina: " + marca.ultimaPagina));
        marca.comenzar();
        System.out.println("Ultima pagina: " + marca.ultimaPagina));
    }
}
