package it.study.domain;

import java.time.ZonedDateTime;

public class Video {
    private Long id;
    private String path;
    private ZonedDateTime encodedDate;
    private String duration;
    private String compression;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ZonedDateTime getEncodedDate() {
        return encodedDate;
    }

    public void setEncodedDate(ZonedDateTime encodedDate) {
        this.encodedDate = encodedDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCompression() {
        return compression;
    }

    public void setCompression(String compression) {
        this.compression = compression;
    }
}
