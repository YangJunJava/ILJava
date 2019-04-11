package com.ahs.redis;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import redis.clients.jedis.Jedis;

public class RedisJava {
	public static void main(String[] args) {
		Jedis jedis=new Jedis("127.0.0.1");
//		System.out.println("连接成功");
//		System.out.println("服务正在运行"+jedis.ping());
//		System.out.println(jedis.get("key1"));
		jedis.lpush("key2","Runoob");
		jedis.lpush("key2", "Google");
		jedis.lpush("key2", "Taobao");
		
//		List<String> list=jedis.lrange("key2", 0, 2);
//		for(String str:list) {
//			System.out.println(str);
//		}
		
		Set<String> keys=jedis.keys("*");
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			String key=it.next();
			System.out.println(key);
		}
	}

}
