package com.cn.exclusiveGirlfriend.common;/**
 * @ClassName FastJsonRedisSerializer
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/7 19:15
 * @Hodified By:
 **/

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

import java.nio.charset.Charset;
//使用方法
/*@Autowired
private RedisTemplate<String,Object> redisTemplate;*/
/**
 * @ClassName FastJsonRedisSerializer
 * @Author ASUS
 * @Description TODO;
 * @Date 2020/8/7 19:15
 * @Hodified By:
 **/
public class FastJsonRedisSerializer<T>  implements RedisSerializer<T> {
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");

    private Class<T> clazz;

    public FastJsonRedisSerializer(Class<T> clazz) {
        super();
        this.clazz = clazz;
    }

    @Override
    public byte[] serialize(T t) throws SerializationException {
        if (t == null) {
            return new byte[0];
        }
        return JSON.toJSONString(t, SerializerFeature.WriteClassName,SerializerFeature.WriteNullStringAsEmpty,SerializerFeature.WriteMapNullValue,SerializerFeature.WriteNullListAsEmpty).getBytes(DEFAULT_CHARSET);
    }

    @Override
    public T deserialize(byte[] bytes) throws SerializationException {
        if (bytes == null || bytes.length <= 0) {
            return null;
        }
        String str = new String(bytes, DEFAULT_CHARSET);
        return (T) JSON.parseObject(str, clazz);
    }
}
