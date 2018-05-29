package com.realm;

import com.sea.entity.UserEntity;
import com.sea.service.UserFun;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;


public class MyRealm extends AuthorizingRealm {
    private final static String salt = "water";

    @Resource
    private UserFun userService;

    // Ϊ��ǰ��½�ɹ����û�����Ȩ�޺ͽ�ɫ���Ѿ���½�ɹ���
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(
            PrincipalCollection principals) {
        String username = (String) principals.getPrimaryPrincipal();
        SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
        authorizationInfo.setRoles(userService.getRoles(username));
//        authorizationInfo.setStringPermissions(userService.getPermissions(username));
//        System.out.println("check permission");

        // Subject subject = getSubject(request, response);
        //  return subject.isAuthenticated();

        return authorizationInfo;
    }

    // ��֤��ǰ��¼���û�����ȡ��֤��Ϣ
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(
            AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        UserEntity user = userService.getByUsername(username);
        System.out.println(salt);
        ByteSource u = ByteSource.Util.bytes(salt);
        System.out.println(u);
        if (user != null) {
            AuthenticationInfo authcInfo = new SimpleAuthenticationInfo(user.getUsername(), user.getPassword(), ByteSource.Util.bytes(salt), getName());
            return authcInfo;
        } else {
            return null;
        }
    }
}
