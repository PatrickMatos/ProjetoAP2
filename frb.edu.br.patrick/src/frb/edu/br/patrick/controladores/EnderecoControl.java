
package frb.edu.br.patrick.controladores;

import frb.edu.br.contratos.IdCidade;
import frb.edu.br.contratos.IdEndereco;
import frb.edu.br.entidades.Cidade;
import frb.edu.br.entidades.Endereco;
import frb.edu.br.patrick.repositorios.RepositorioCidade;
import frb.edu.br.patrick.repositorios.RepositorioEndereco;


import java.util.List;


public class EnderecoControl  {

    private Endereco endereco;
    private List<Endereco> enderecos;
    private IdEndereco Repositorioendereco = new RepositorioEndereco();

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Endereco> getEnderecos() {
        return enderecos = Repositorioendereco.getListaDeTodosRegistros();
    }

    public String prepararInclusao(){

        endereco = new Endereco();

        return "adicao-endereco";
    }

    public String finalizarInclusao(){

        Repositorioendereco.inserir(endereco);
        endereco = null;

        return "listagem-endereco";
    }

    public String finalizarEdicao(){

        Repositorioendereco.alterar(endereco);
        endereco = null;

        return "listagem-endereco";
    }

    public String finalizarDelecao(){

        Repositorioendereco.excluir(endereco.getEndereco_id());
        endereco = null;

        return "listagem-endereco";
    }
}
