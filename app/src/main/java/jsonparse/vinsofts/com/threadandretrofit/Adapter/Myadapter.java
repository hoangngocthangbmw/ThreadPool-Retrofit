package jsonparse.vinsofts.com.threadandretrofit.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import jsonparse.vinsofts.com.threadandretrofit.R;
import jsonparse.vinsofts.com.threadandretrofit.model.Collection;

public class Myadapter extends RecyclerView.Adapter<Myadapter.MyHolder> {
    private Context context;
    private List<Collection> songList;


    public Myadapter(Context context, List<Collection> songList) {
        this.context = context;
        this.songList = songList;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item, viewGroup, false);
        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder myHolder, int i) {
        Collection collection = songList.get(i);
        myHolder.tv_score.setText(String.valueOf(collection.getScore()));
    }

    @Override
    public int getItemCount() {
        if (songList == null) {
            return 0;
        }
        return songList.size();
    }

    static class MyHolder extends RecyclerView.ViewHolder {
        TextView tv_score;
        MyHolder(@NonNull View itemView) {
            super(itemView);
            tv_score = itemView.findViewById(R.id.tv_score);
        }
    }
}
