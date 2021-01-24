package com.sigh.core.security;

import com.sigh.core.dto.UserInfo;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author
 * @version 0.0.1
 * @params
 * @date
 */
public class SecurityHelper {

    public SecurityHelper() {
    }

    public static UserInfo getUserInfo(){
        UserInfo userInfo = null;
        SecurityContext context = SecurityContextHolder.getContext();

        return userInfo;
    }
}
