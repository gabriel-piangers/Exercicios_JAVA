package ex7;

import java.util.*;

public class InMemoryRepository<T extends Identificavel<ID>, ID> implements Irepository<T, ID> {
    private final Map<ID, T> data = new HashMap<>();

    @Override
    public void salvar(T item) {
        data.put(item.getId(), item);

    }

    @Override
    public void remover(ID id) {
        if(!data.containsKey(id)) throw new EntidadeNaoEncontradaException("Nenhum item encontrado com o Id: "+ id);
        data.remove(id);
    }

    @Override
    public Optional<T> buscarPorId(ID id) {
        return Optional.ofNullable(data.get(id));
    }

    @Override
    public List<Collection<T>> listarTodos() {
        return List.of(data.values());
    }

}
