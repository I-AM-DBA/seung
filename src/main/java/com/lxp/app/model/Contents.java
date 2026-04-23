package com.lxp.app.model;


import java.time.LocalDateTime;

public class Contents {
    private Long contentsId;
    private Long sectionId;
    private Long courseId;
    private String contentTitle;
    private String contentUrl;
    private Long time;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;
    private boolean isPublic;
    private boolean isDeleted;
    private boolean isFree;


    public Contents(Long contentsId, Long sectionId, Long courseId, String contentTitle,
            String contentUrl, Long time, LocalDateTime createdAt, LocalDateTime updatedAt,
            LocalDateTime deletedAt, boolean isPublic, boolean isDeleted, boolean isFree) {
        this.contentsId = contentsId;
        this.sectionId = sectionId;
        this.courseId = courseId;
        this.contentTitle = contentTitle;
        this.contentUrl = contentUrl;
        this.time = time;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deletedAt = deletedAt;
        this.isPublic = isPublic;
        this.isDeleted = isDeleted;
        this.isFree = isFree;
    }

    public Long getContentsId() {
        return contentsId;
    }

    public void setContentsId(Long contentsId) {
        this.contentsId = contentsId;
    }

    public Long getSectionId() {
        return sectionId;
    }

    public void setSectionId(Long sectionId) {
        this.sectionId = sectionId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getContentTitle() {
        return contentTitle;
    }

    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle;
    }

    public String getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public boolean isFree() {
        return isFree;
    }

    public void setFree(boolean free) {
        isFree = free;
    }

    @Override
    public String toString() {
        return "Contents{" + "contentsId='" + contentsId + '\'' + ", sectionId='" + sectionId + '\''
                + ", courseId='" + courseId + '\'' + ", contentTitle='" + contentTitle + '\''
                + ", contentUrl='" + contentUrl + '\'' + ", time=" + time + ", createdAt='"
                + createdAt + '\'' + ", updatedAt='" + updatedAt + '\'' + ", deletedAt='"
                + deletedAt + '\'' + ", isPublic=" + isPublic + ", isDeleted=" + isDeleted
                + ", isFree=" + isFree + '}';
    }
}