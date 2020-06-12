package frb.edu.br.patrick.controladores;

import frb.edu.br.contratos.IdCidade;
import frb.edu.br.contratos.IdPais;
import frb.edu.br.entidades.Cidade;
import frb.edu.br.entidades.Pais;
import frb.edu.br.patrick.repositorios.RepositorioCidade;
import frb.edu.br.patrick.repositorios.RepositorioPais;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class PaisControl implements Serializable {

    private Pais pais;
    private List<Pais> paises = null;
    private IdPais repositoriopais = new RepositorioPais();

    public PaisControl() {

    }

    public List<Pais> getPaises() {

        if(paises == null){
            paises = repositoriopais.getListaDeTodosRegistros();
        }
        return paises;
    }

    public String prepararInclusao(){

        pais = new Pais();

        return "vaiParaIncluir";
    }

    public String finalizaInclusao(){

        repositoriopais.inserir(pais);
        pais = null;
        paises = null;

        return "listagem-pais";
    }

    public String finalizaEdicao(){

       repositoriopais.alterar(pais);
        pais = null;

        return "listagem-pais";
    }

    public String finalizaDelecao(){

        repositoriopais.excluir(pais.getPais_id());
        pais = null;
        return "listagem-pais";
    }
}
