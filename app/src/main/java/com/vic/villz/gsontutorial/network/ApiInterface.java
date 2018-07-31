package com.vic.villz.gsontutorial.network;

import com.vic.villz.gsontutorial.model.Message;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("inbox.json")
    Call<List<Message>> getMessages();
}
