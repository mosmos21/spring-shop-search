package handson.example.springshopsearch.model.item;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByPriceBetween(int start, int end);
    List<Item> findByNameLike(String name);
    List<Item> findByAuthorId(Long authorId);
}
