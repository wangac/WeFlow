package com.cmmobi.railwifi.dao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table DOWNLOAD_HISTORY.
 */
public class DownloadHistory {

    private String url;
    private Integer downloadType;
    private Integer downloadStatus;
    private Integer downloadSize;
    private Integer wholeSize;
    private String path;
    private String title;
    private String detail;
    private String picUrl;
    private String mediaId;
    private String source;
    private String data;

    public DownloadHistory() {
    }

    public DownloadHistory(String url) {
        this.url = url;
    }

    public DownloadHistory(String url, Integer downloadType, Integer downloadStatus, Integer downloadSize, Integer wholeSize, String path, String title, String detail, String picUrl, String mediaId, String source, String data) {
        this.url = url;
        this.downloadType = downloadType;
        this.downloadStatus = downloadStatus;
        this.downloadSize = downloadSize;
        this.wholeSize = wholeSize;
        this.path = path;
        this.title = title;
        this.detail = detail;
        this.picUrl = picUrl;
        this.mediaId = mediaId;
        this.source = source;
        this.data = data;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getDownloadType() {
        return downloadType;
    }

    public void setDownloadType(Integer downloadType) {
        this.downloadType = downloadType;
    }

    public Integer getDownloadStatus() {
        return downloadStatus;
    }

    public void setDownloadStatus(Integer downloadStatus) {
        this.downloadStatus = downloadStatus;
    }

    public Integer getDownloadSize() {
        return downloadSize;
    }

    public void setDownloadSize(Integer downloadSize) {
        this.downloadSize = downloadSize;
    }

    public Integer getWholeSize() {
        return wholeSize;
    }

    public void setWholeSize(Integer wholeSize) {
        this.wholeSize = wholeSize;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl;
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}