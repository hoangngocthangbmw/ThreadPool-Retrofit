
package jsonparse.vinsofts.com.threadandretrofit.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Media {

    @SerializedName("transcodings")
    @Expose
    private List<Transcoding> transcodings = null;

    public List<Transcoding> getTranscodings() {
        return transcodings;
    }

    public void setTranscodings(List<Transcoding> transcodings) {
        this.transcodings = transcodings;
    }

}
