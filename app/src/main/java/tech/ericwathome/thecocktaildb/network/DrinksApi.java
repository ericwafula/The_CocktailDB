package tech.ericwathome.thecocktaildb.network;

import org.json.JSONArray;
import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import tech.ericwathome.thecocktaildb.model.Drinks;

public interface DrinksApi {
//    @GET("search.php?f=a")
//    Call<Drinks> getDrinks();

    @GET("search.php")
    Call<Drinks> getDrinksByCategory(@Query("s") String category);
}
