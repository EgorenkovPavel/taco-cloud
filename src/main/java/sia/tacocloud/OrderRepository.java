package sia.tacocloud;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID>{    
}
