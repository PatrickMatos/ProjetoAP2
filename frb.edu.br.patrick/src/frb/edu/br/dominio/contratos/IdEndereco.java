package frb.edu.br.dominio.contratos;

import frb.edu.br.dominio.entidades.Cidade;
import frb.edu.br.dominio.entidades.Endereco;

import java.util.List;

public interface IdEndereco {

    boolean inserir(Endereco endereco);

    boolean alterar(Endereco endereco);

    boolean excluir(Long id);

    Endereco getRegistroPorId(Long id);

    List<Endereco> getListaDeTodosRegistros();
}
