package com.qf.j1906.config;

import org.springframework.core.convert.converter.Converter;
import org.springframework.core.serializer.support.DeserializingConverter;
import org.springframework.core.serializer.support.SerializingConverter;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.SerializationException;

/**
 * @Author: 刘旭
 * Date: 2019/12/9 15:08
 * @Version 1.0
 */
public class RedisUtilsSerializable implements RedisSerializer<Object> {
    Converter<Object,byte[]> serializingConverter = new SerializingConverter();
    Converter<byte[],Object> deserializingConverter = new DeserializingConverter();
    byte[] EMPTY=new byte[0];
    @Override
    public byte[] serialize(Object o) throws SerializationException {
        if (o==null){
            return EMPTY;
        }
        return serializingConverter.convert(o);
    }

    @Override
    public Object deserialize(byte[] bytes) throws SerializationException {
        if(bytes!=null){
            return deserializingConverter.convert(bytes);
        }
        return null;
    }
}
