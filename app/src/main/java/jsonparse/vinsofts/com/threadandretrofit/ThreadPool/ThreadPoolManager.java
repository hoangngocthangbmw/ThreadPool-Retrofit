package jsonparse.vinsofts.com.threadandretrofit.ThreadPool;

import android.content.Context;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;

import jsonparse.vinsofts.com.threadandretrofit.Constant;

public class ThreadPoolManager {
    public ThreadPoolManager(Context context) {
        ThreadPoolExecutor mLoadInfor;
        BlockingQueue<Runnable> mQueue= new LinkedBlockingQueue<>();
        mLoadInfor =
                new ThreadPoolExecutor(Constant.CORE_POOL_SIZE, Constant.MAXIMUM_POOL_SIZE,
                Constant.KEEP_ALIVE_TIME, Constant.KEEP_ALIVE_TIME_UNIT, mQueue);
        int length=4;
        for (int i = 0; i < length; i++) {
            mLoadInfor.execute(new LoadInforRunnable(i,context));
        }
    }
}
