public class MsgTexto extends Mensagem {
    private int numChar;

    public Mensagem sendMensage(String aString){
        return this;
    }
    public MsgTexto (int numChar){
        this.numChar = numChar;
    }
    public int getNumChar(){
        return numChar;
    }
    public void setNumChar(){
        this.numChar = numChar;
    }

}   