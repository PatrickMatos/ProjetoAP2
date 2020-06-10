package frb.edu.br.dominio.contratos;

import frb.edu.br.dominio.entidades.Cidade;

import java.util.List;

public interface IdCidade {

    boolean inserir(Cidade cidade);

    boolean alterar(Cidade cidade);

    boolean excluir(Long id);

    Cidade getRegistroPorId(Long id);

    List<Cidade> getListaDeTodosRegistros();
}
