public class MsgFoto extends Mensagem{
    private int tamanho;

    public Mensagem sendMensagem(String aString){
        return this;
    }

    public MsgAudio(int tamanho){
        this.tamanho = tamanho;
    }

    public int getTamanho(){
        return tamanho;
    }
    public void setTamanho(){
        this.tamanho = tamanho;
    }
}
