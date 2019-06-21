package lin.louis.poc.springbootmicrometer;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends PagingAndSortingRepository<Cat, Long> {
    List<Cat> findByName(@Param("name") String name);
}
