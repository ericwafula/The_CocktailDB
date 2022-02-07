package tech.ericwathome.thecocktaildb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import org.json.JSONObject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import tech.ericwathome.thecocktaildb.model.Drinks;
import tech.ericwathome.thecocktaildb.network.DrinksApi;
import tech.ericwathome.thecocktaildb.network.RetrofitBuilder;

public class MainActivity extends AppCompatActivity {
    RetrofitBuilder retrofitBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        retrofitBuilder = new RetrofitBuilder();

        Retrofit retrofit = retrofitBuilder.getRetrofitBuilder();
        DrinksApi drinksApi = retrofit.create(DrinksApi.class);

//        Call<Drinks> call = drinksApi.getDrinks();
        Call<Drinks> call2 = drinksApi.getDrinksByCategory("margarita");

        call2.enqueue(new Callback<Drinks>() {
            @Override
            public void onResponse(Call<Drinks> call, Response<Drinks> response) {
                Log.d("tag", "drinks: " + response.body().getDrinks());
            }

            @Override
            public void onFailure(Call<Drinks> call, Throwable t) {

            }
        });

    }
}