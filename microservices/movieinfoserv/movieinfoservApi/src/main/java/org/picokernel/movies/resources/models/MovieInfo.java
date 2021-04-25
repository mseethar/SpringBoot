package org.picokernel.movies.resources.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

@JsonPropertyOrder({"id", "imdb_id", "title", "overview", "original_language",
        "original_title", "popularity", "release_date", "revenue", "status",
        "vote_average", "vote_count", "adult"})
public class MovieInfo {
    private int id;
    @JsonProperty("imdb_id")
    private String IMDBId;
    @JsonProperty("original_language")
    private String originalLanguage;
    @JsonProperty("original_title")
    private String originalTitle;
    private String overview;
    private BigDecimal popularity;

    // NOTE: JSON Date property mapping
    @JsonProperty("release_date")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date releaseDate;
    private long revenue;
    private String status;
    private String title;
    @JsonProperty("vote_average")
    private BigDecimal voteAverage;
    @JsonProperty("vote_count")
    private long voteCount;
    @JsonProperty("adult")
    private boolean isAdult;

    public MovieInfo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIMDBId() {
        return IMDBId;
    }

    public void setIMDBId(String IMDBId) {
        this.IMDBId = IMDBId;
    }

    public String getOriginalLanguage() {
        return originalLanguage;
    }

    public void setOriginalLanguage(String originalLanguage) {
        this.originalLanguage = originalLanguage;
    }

    public String getOriginalTitle() {
        return originalTitle;
    }

    public void setOriginalTitle(String originalTitle) {
        this.originalTitle = originalTitle;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public BigDecimal getPopularity() {
        return popularity;
    }

    public void setPopularity(BigDecimal popularity) {
        this.popularity = popularity;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public long getRevenue() {
        return revenue;
    }

    public void setRevenue(long revenue) {
        this.revenue = revenue;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public BigDecimal getVoteAverage() {
        return voteAverage;
    }

    public void setVoteAverage(BigDecimal voteAverage) {
        this.voteAverage = voteAverage;
    }

    public long getVoteCount() {
        return voteCount;
    }

    public void setVoteCount(long voteCount) {
        this.voteCount = voteCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieInfo movieInfo = (MovieInfo) o;
        return getId() == movieInfo.getId() && getRevenue() == movieInfo.getRevenue() && getVoteCount() == movieInfo.getVoteCount() && getIMDBId().equals(movieInfo.getIMDBId()) && Objects.equals(getOriginalLanguage(), movieInfo.getOriginalLanguage()) && getOriginalTitle().equals(movieInfo.getOriginalTitle()) && Objects.equals(getOverview(), movieInfo.getOverview()) && Objects.equals(getPopularity(), movieInfo.getPopularity()) && Objects.equals(getReleaseDate(), movieInfo.getReleaseDate()) && Objects.equals(getStatus(), movieInfo.getStatus()) && getTitle().equals(movieInfo.getTitle()) && Objects.equals(getVoteAverage(), movieInfo.getVoteAverage());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getIMDBId(), getOriginalLanguage(), getOriginalTitle(), getOverview(), getPopularity(), getReleaseDate(), getRevenue(), getStatus(), getTitle(), getVoteAverage(), getVoteCount());
    }
}
