import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
    private List<Contatinho> contatos;
    private List<Mensagem> mensagens;

    public List<Contatinho> getContatos() {
        return contatos;
    }
    public void setContatos(List<Contatinho> contatos) {
        this.contatos = contatos;
    }
    public List<Mensagem> getMensagens() {
        return mensagens;
    }
    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }
}

public void listarContato(List<Contatinho> contatos){
    for(Contatinho contato:contatos){
        System.out.println("Contato: " + contato.getNome()+"\n");
    }
}

public void listarMensagens(List<Mensagem> mensagens){
    for(Mensagem mensagem:mensagens){
        System.out.println("Mensagem: " + mensagem.getConteudo()+"\n");
    }
}

