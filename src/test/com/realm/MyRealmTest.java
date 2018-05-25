package com.realm;

import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by try on 2018/5/25.
 */
public class MyRealmTest {


    /**
     * 获得加盐后md5密码
     * @throws Exception
     */
    @Test
    public void name() throws Exception {
        String hashAlgorithmName = "MD5";
        String credentials = "111";
        int hashIterations = 1;
        ByteSource credentialsSalt = ByteSource.Util.bytes("water");
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, hashIterations);
        System.out.println(obj);
    }
}