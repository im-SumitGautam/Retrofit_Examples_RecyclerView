package com.example.retrofit_examples.Model;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class CountryModel {

    @SerializedName("code")
    @Expose
    private Integer code;
    @SerializedName("result")
    @Expose
    private List<Result> result;
    @SerializedName("extra")
    @Expose
    private List<Object> extra;

    /**
     * No args constructor for use in serialization
     *
     */
    public CountryModel() {
    }

    /**
     *
     * @param result
     * @param code
     * @param extra
     */
    public CountryModel(Integer code, List<Result> result, List<Object> extra) {
        super();
        this.code = code;
        this.result = result;
        this.extra = extra;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public List<Result> getResult() {
        return result;
    }public void setResult(List<Result> result) {
        this.result = result;
    }

    public List<Object> getExtra() {
        return extra;
    }

    public void setExtra(List<Object> extra) {
        this.extra = extra;
    }

}