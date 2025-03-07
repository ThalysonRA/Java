public class Palavra {  
    String texto;

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
        for(int i=0; i<texto.length();i++){
            System.out.println(texto.charAt(i));
        }
        System.out.println("Tamanho da string: " + texto.length());
    }
}