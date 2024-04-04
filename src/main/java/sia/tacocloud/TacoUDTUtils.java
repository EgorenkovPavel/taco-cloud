package sia.tacocloud;


public class TacoUDTUtils {
    static IngredientUDT toIngredientUDT(Ingredient ingredient){
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }
}
