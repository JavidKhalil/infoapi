package com.example.demo.dao;

import com.example.demo.beans.Message;

public interface MessageDao {

    void saveMessage(Message message);

    void updateMessage(Message message);

    Message getMessageByTitle(String title);

    void deleteMessageByTitle(String title);

}
