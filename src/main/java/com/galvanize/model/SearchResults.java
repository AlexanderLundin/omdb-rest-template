package com.galvanize.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SearchResults {

    @JsonProperty("Search")
    private List<Result> search;
    private int totalResults;
    boolean response;

    public SearchResults() {
        System.out.println("Constructor");
    }

    public List<Result> getSearch() {
        return search;
    }

    public void setSearch(List<Result> search) {
        this.search = search;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public boolean isResponse() {
        return response;
    }

    public void setResponse(boolean response) {
        this.response = response;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    static class Result {
        /*
       {
               "Title": "Birds of a Feather",
               "Year": "2000",
               "imdbID": "tt0413838",
               "Type": "movie",
               "Poster": "N/A"
        }
        */
        @JsonProperty("Title")
        private String title;
        @JsonProperty("Year")
        private String year;
        @JsonProperty("imdbID")
        private String imdbId;
        @JsonProperty("Type")
        private String type;
        @JsonProperty("Poster")
        private String poster;

        public Result() {
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getYear() {
            return year;
        }

        public void setYear(String year) {
            this.year = year;
        }

        public String getImdbId() {
            return imdbId;
        }

        public void setImdbId(String imdbId) {
            this.imdbId = imdbId;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getPoster() {
            return poster;
        }

        public void setPoster(String poster) {
            this.poster = poster;
        }
    }

}

