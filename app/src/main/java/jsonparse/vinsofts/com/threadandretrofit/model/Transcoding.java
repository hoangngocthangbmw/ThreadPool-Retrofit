
package jsonparse.vinsofts.com.threadandretrofit.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Transcoding {

    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("preset")
    @Expose
    private String preset;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("snipped")
    @Expose
    private Boolean snipped;
    @SerializedName("format")
    @Expose
    private Format format;
    @SerializedName("quality")
    @Expose
    private String quality;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPreset() {
        return preset;
    }

    public void setPreset(String preset) {
        this.preset = preset;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Boolean getSnipped() {
        return snipped;
    }

    public void setSnipped(Boolean snipped) {
        this.snipped = snipped;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

}
