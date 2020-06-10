package frb.edu.br.dominio.contratos;

import frb.edu.br.dominio.entidades.Pais;

import java.util.List;

public interface IdPais {

    boolean inserir(Pais pais);

    boolean alterar(Pais pais);

    boolean excluir(Long id);

    Pais getRegistroPorId(Long id);

    List<Pais> getListaDeTodosRegistros();
}
