package com.techietipps.robservice.models;

public class Job {

    private Integer id;
    private String description;
    private Integer numberOfVacancies;
    private String title;

    public Job() {

    }

    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return Integer return the numberOfVacancies
     */
    public Integer getNumberOfVacancies() {
        return numberOfVacancies;
    }

    /**
     * @param numberOfVacancies the numberOfVacancies to set
     */
    public void setNumberOfVacancies(Integer numberOfVacancies) {
        this.numberOfVacancies = numberOfVacancies;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Job [description=" + description + ", id=" + id + ", numberOfVacancies=" + numberOfVacancies
                + ", title=" + title + "]";
    }

}