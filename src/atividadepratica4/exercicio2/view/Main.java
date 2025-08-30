package atividadepratica4.exercicio2.view;
import atividadepratica4.exercicio2.model.Aplicativo;
import atividadepratica4.exercicio2.model.Arquivo;
import atividadepratica4.exercicio2.model.Aula;
import atividadepratica4.exercicio2.model.Avaliacao;
import atividadepratica4.exercicio2.model.BancoDados;
import atividadepratica4.exercicio2.model.Cliente;
import atividadepratica4.exercicio2.model.ContaBancaria;
import atividadepratica4.exercicio2.model.Curso;
import atividadepratica4.exercicio2.model.Jogo;
import atividadepratica4.exercicio2.model.Mensagem;
import atividadepratica4.exercicio2.model.Pedido;
import atividadepratica4.exercicio2.model.Produto;
import atividadepratica4.exercicio2.model.Projeto;
import atividadepratica4.exercicio2.model.RedeSocial;
import atividadepratica4.exercicio2.model.Relatorio;
import atividadepratica4.exercicio2.model.Senha;
import atividadepratica4.exercicio2.model.SistemaOperacional;
import atividadepratica4.exercicio2.model.Site;
import atividadepratica4.exercicio2.model.Tarefa;
import atividadepratica4.exercicio2.model.Usuario;

public class Main {
    public static void main(String[] args) {
        
        Aplicativo Paint = new Aplicativo();
        Paint.nome = "Paint";
        Paint.intalarAplicativo();

        Aplicativo Steam = new Aplicativo();
        Steam.nome = "Steam";
        Steam.execultarAplicativo();


        
    }
}