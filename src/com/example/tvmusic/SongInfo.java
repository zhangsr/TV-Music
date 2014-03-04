package com.example.tvmusic;

/**
 * @description:
 * @author: Saul
 * @date: 3/4/14
 * @version: 1.0
 */
public class SongInfo {
    private int mId;
    private String mTitle;
    private String mAlbum;
    private String mArtist;
    private String mUrl;
    private int mDuration;
    private long mSize;

    SongInfo(int id, String title, String album, String artist, String url, int duration, long size) {
        this.mId = id;
        this.mTitle = title;
        this.mAlbum = album;
        this.mArtist = artist;
        this.mUrl = url;
        this.mDuration = duration;
        this.mSize = size;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getArtist() {
        return mArtist;
    }

    public String getUrl() {
        return mUrl;
    }

    public int getDuration() {
        return mDuration;
    }

    public long getSize() {
        return mSize;
    }

    public int getId() {
        return mId;
    }
}
