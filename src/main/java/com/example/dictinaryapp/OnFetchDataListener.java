package com.example.dictinaryapp;

import com.example.dictinaryapp.model_.APIResponse;

public interface OnFetchDataListener {
    void onFetchData(APIResponse apiResponse, String message);
    void onError(String message);
}
