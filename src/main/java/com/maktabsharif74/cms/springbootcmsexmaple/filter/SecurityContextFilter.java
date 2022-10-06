package com.maktabsharif74.cms.springbootcmsexmaple.filter;

import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;
import com.maktabsharif74.cms.springbootcmsexmaple.util.SecurityContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Base64;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SecurityContextFilter extends OncePerRequestFilter {

    @Value(value = "${login.cookie.name}")
    private String cookieName;

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        SecurityContext.clear();

        Cookie[] cookies = request.getCookies();
        if (cookies != null && cookies.length != 0) {
            Arrays.stream(cookies)
                    .filter(cookie -> cookieName.equals(cookie.getName()))
                    .findAny()
                    .ifPresent(cookie -> {
                        String value = cookie.getValue();
                        String userInfo = new String(
                                Base64.getDecoder()
                                        .decode(
                                                value.getBytes(StandardCharsets.UTF_8)
                                        )
                        );
                        String[] split = userInfo.split(":");
                        if (split.length == 4) {
                            SecurityContext.setCurrentUser(
                                    new User(
                                            Long.valueOf(split[0]),
                                            split[1],
                                            split[2],
                                            split[3]
                                    )
                            );
                        }

                    });
        }

        filterChain.doFilter(request, response);
    }
}
