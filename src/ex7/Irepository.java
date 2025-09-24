package ex7;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface Irepository<T extends Identificavel<ID>, ID>{
    void salvar(T item);
    Optional<T> buscarPorId(ID id);
    List<Collection<T>> listarTodos();
    void remover(ID id);
}
