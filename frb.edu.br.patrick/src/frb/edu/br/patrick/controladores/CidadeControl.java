package frb.edu.br.patrick.controladores;

import frb.edu.br.dominio.contratos.IdCidade;
import frb.edu.br.dominio.entidades.Cidade;
import frb.edu.br.patrick.repositorios.RepositorioCidade;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.util.List;

public class CidadeControl{

    private Cidade cidade;
    private List<Cidade> cidades = null;
    private IdCidade repositoriocidade = new RepositorioCidade();

    public CidadeControl() {

    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public List<Cidade> getCidades() {

        if(cidades == null){
            cidades = repositoriocidade.getListaDeTodosRegistros();
        }
        return cidades;
    }

    public String prepararInclusao(){

        cidade = new Cidade ();

        return "inclua";
    }

    public String finalizaInclusao(){

        repositoriocidade.inserir(cidade);
        cidade = null;

        return "voltaParaListagem";
    }

    public String finalizaEdicao(){

        repositoriocidade.alterar(cidade);
        cidade = null;

        return "voltaListagem";
    }

    public String finalizaDelecao(){

        repositoriocidade.excluir(cidade.getCidade_id());
        cidade = null;
        return "refresh";
    }
}


