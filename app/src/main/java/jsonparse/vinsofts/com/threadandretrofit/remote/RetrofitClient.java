package jsonparse.vinsofts.com.threadandretrofit.remote;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static final String BASE_URL = "https://api-v2.soundcloud.com/";

    public static Retrofit getClient(String baseUrl){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit;
    }

    public static ISOService getSOService(){
        return RetrofitClient.getClient(BASE_URL).create(ISOService.class);
    }
}
