package com.example.retrofit_examples.Model;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("states")
    @Expose
    private Object states;
    @SerializedName("region")
    @Expose
    private String region;

    /**
     * No args constructor for use in serialization
     */
    public Result() {
    }

    /**
     * @param code
     * @param name
     * @param region
     * @param states
     */
    public Result(String name, String code, Object states, String region) {
        super();
        this.name = name;
        this.code = code;
        this.states = states;
        this.region = region;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getStates() {
        return states;
    }

    public void setStates(Object states) {
        this.states = states;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}