package sia.tacocloud;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@UserDefinedType("ingredient")
class IngredientUDT{

    IngredientUDT(String name, Ingredient.Type type){
        this.name = name;
        this.type = type;
    }

    private final String name;
    private final Ingredient.Type type;
}