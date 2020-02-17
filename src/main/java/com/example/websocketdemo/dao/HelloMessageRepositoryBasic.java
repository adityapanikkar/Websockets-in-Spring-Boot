package com.example.websocketdemo.dao;


import com.example.websocketdemo.pojo.HelloMessage;
import org.springframework.data.repository.CrudRepository;

public interface HelloMessageRepositoryBasic extends CrudRepository<HelloMessage, String> {
}
