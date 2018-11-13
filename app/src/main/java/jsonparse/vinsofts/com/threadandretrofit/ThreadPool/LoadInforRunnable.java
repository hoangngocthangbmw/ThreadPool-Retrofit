package jsonparse.vinsofts.com.threadandretrofit.ThreadPool;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import jsonparse.vinsofts.com.threadandretrofit.Inteface.IHandle;
import jsonparse.vinsofts.com.threadandretrofit.model.Collection;
import jsonparse.vinsofts.com.threadandretrofit.model.Example;
import jsonparse.vinsofts.com.threadandretrofit.remote.ISOService;
import jsonparse.vinsofts.com.threadandretrofit.remote.RetrofitClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoadInforRunnable implements Runnable {
    private IHandle handle;
    private ISOService isoService;
    private int number;

    LoadInforRunnable(int number, Context context) {
        this.number = number;
        isoService = RetrofitClient.getSOService();
        this.handle = (IHandle) context;
    }

    @Override
    public void run() {

        switch (number) {
            case 0:
                isoService.getdata1().enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        List<Collection> list = new ArrayList<>();
                        list.addAll(response.body().getCollection());
                        handle.getData1(list);
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });
                break;
            case 1:
                isoService.getdata2().enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        List<Collection> list = new ArrayList<>();
                        list.addAll(response.body().getCollection());
                        handle.getData2(list);
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });
                break;
            case 2:
                isoService.getdata3().enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        List<Collection> list = new ArrayList<>();
                        list.addAll(response.body().getCollection());
                        handle.getData3(list);
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });
                break;
            case 3:
                isoService.getdata4().enqueue(new Callback<Example>() {
                    @Override
                    public void onResponse(Call<Example> call, Response<Example> response) {
                        List<Collection> list = new ArrayList<>();
                        list.addAll(response.body().getCollection());
                        handle.getData4(list);
                    }

                    @Override
                    public void onFailure(Call<Example> call, Throwable t) {

                    }
                });
                break;

        }

    }
}
