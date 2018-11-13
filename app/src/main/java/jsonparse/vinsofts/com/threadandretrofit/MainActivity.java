package jsonparse.vinsofts.com.threadandretrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import jsonparse.vinsofts.com.threadandretrofit.Adapter.Myadapter;
import jsonparse.vinsofts.com.threadandretrofit.Inteface.IHandle;
import jsonparse.vinsofts.com.threadandretrofit.ThreadPool.ThreadPoolManager;
import jsonparse.vinsofts.com.threadandretrofit.model.Collection;

public class MainActivity extends AppCompatActivity implements IHandle {
    private List<Collection> list1;
    private List<Collection> list2;
    private List<Collection> list3;
    private List<Collection> list4;
    private Myadapter myadapter1;
    private Myadapter myadapter2;
    private Myadapter myadapter3;
    private Myadapter myadapter4;

    @BindView(R.id.rc_Main1)
    RecyclerView rcMain1;
    @BindView(R.id.rc_Main2)
    RecyclerView rcMain2;
    @BindView(R.id.rc_Main3)
    RecyclerView rcMain3;
    @BindView(R.id.rc_Main4)
    RecyclerView rcMain4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        list1 = new ArrayList<>();
        list2 = new ArrayList<>();
        list3 = new ArrayList<>();
        list4 = new ArrayList<>();

        myadapter1 = new Myadapter(this, list1);
        myadapter2 = new Myadapter(this, list2);
        myadapter3 = new Myadapter(this, list3);
        myadapter4 = new Myadapter(this, list4);

        ThreadPoolManager threadPoolManager = new ThreadPoolManager(this);

        LinearLayoutManager layoutManager1 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager2 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager3 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);
        LinearLayoutManager layoutManager4 = new LinearLayoutManager(this,
                LinearLayoutManager.HORIZONTAL, false);

        rcMain1.setLayoutManager(layoutManager1);
        rcMain2.setLayoutManager(layoutManager2);
        rcMain3.setLayoutManager(layoutManager3);
        rcMain4.setLayoutManager(layoutManager4);

        rcMain1.setAdapter(myadapter1);
        rcMain2.setAdapter(myadapter2);
        rcMain3.setAdapter(myadapter3);
        rcMain4.setAdapter(myadapter4);
    }

    @Override
    public void getData1(List<Collection> list) {
        list1.clear();
        list1.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter1.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData2(List<Collection> list) {
        list2.clear();
        list2.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter2.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData3(List<Collection> list) {
        list3.clear();
        list3.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter3.notifyDataSetChanged();
            }
        });
    }

    @Override
    public void getData4(List<Collection> list) {
        list4.clear();
        list4.addAll(list);
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                myadapter4.notifyDataSetChanged();
            }
        });
    }
}
