package com.jzp.manager.controller;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Date;

/**
 * Created by lenovo on 2017/6/15.
 */
public class  RedisTest {

    private static JedisPool pool;
    private static Jedis jedis;


    public void setUp() {
        pool = new JedisPool(new JedisPoolConfig(), "localhost:6379");

        jedis = pool.getResource();
        //   jedis.auth("password");
    }

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
    }

}