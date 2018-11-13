
package jsonparse.vinsofts.com.threadandretrofit.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Example {

    @SerializedName("genre")
    @Expose
    private String genre;
    @SerializedName("kind")
    @Expose
    private String kind;
    @SerializedName("last_updated")
    @Expose
    private String lastUpdated;
    @SerializedName("collection")
    @Expose
    private List<Collection> collection = null;
    @SerializedName("query_urn")
    @Expose
    private String queryUrn;
    @SerializedName("next_href")
    @Expose
    private String nextHref;

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public List<Collection> getCollection() {
        return collection;
    }

    public void setCollection(List<Collection> collection) {
        this.collection = collection;
    }

    public String getQueryUrn() {
        return queryUrn;
    }

    public void setQueryUrn(String queryUrn) {
        this.queryUrn = queryUrn;
    }

    public String getNextHref() {
        return nextHref;
    }

    public void setNextHref(String nextHref) {
        this.nextHref = nextHref;
    }

}
