package com.hyg.yucai.model;

import java.util.Date;

public class TVideo {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.videoId
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    private Integer videoid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.title
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.uploadDate
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    private Date uploaddate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.videoPath
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    private String videopath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_video.photo
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    private String photo;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.videoId
     *
     * @return the value of t_video.videoId
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public Integer getVideoid() {
        return videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.videoId
     *
     * @param videoid the value for t_video.videoId
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public void setVideoid(Integer videoid) {
        this.videoid = videoid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.title
     *
     * @return the value of t_video.title
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.title
     *
     * @param title the value for t_video.title
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.uploadDate
     *
     * @return the value of t_video.uploadDate
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public Date getUploaddate() {
        return uploaddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.uploadDate
     *
     * @param uploaddate the value for t_video.uploadDate
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public void setUploaddate(Date uploaddate) {
        this.uploaddate = uploaddate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.videoPath
     *
     * @return the value of t_video.videoPath
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public String getVideopath() {
        return videopath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.videoPath
     *
     * @param videopath the value for t_video.videoPath
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public void setVideopath(String videopath) {
        this.videopath = videopath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_video.photo
     *
     * @return the value of t_video.photo
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public String getPhoto() {
        return photo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_video.photo
     *
     * @param photo the value for t_video.photo
     *
     * @mbg.generated Tue Sep 04 16:39:04 CST 2018
     */
    public void setPhoto(String photo) {
        this.photo = photo;
    }
}