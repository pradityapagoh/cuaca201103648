package com.abrianus201103648.cuaca201103648;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RootModel
{
    @SerializedName("list")
    private List<ListModel> listModelList;

    public List<ListModel> getListModelList() {
        return listModelList;
    }

    public void setListModelList(List<ListModel> listModelList) {
        this.listModelList = listModelList;
    }

    public RootModel() {
    }
}
