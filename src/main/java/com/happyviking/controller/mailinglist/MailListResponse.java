package com.happyviking.controller.mailinglist;

import com.happyviking.model.User;

import java.util.List;

public class MailListResponse {
    public List<User> getResult() {
        return result;
    }

    public void setResult(List<User> result) {
        this.result = result;
    }

    private List<User> result;
}
