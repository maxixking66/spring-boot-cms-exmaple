package com.maktabsharif74.cms.springbootcmsexmaple.filter;

import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;
import com.maktabsharif74.cms.springbootcmsexmaple.domain.enumeration.UserType;
import com.maktabsharif74.cms.springbootcmsexmaple.util.SecurityContext;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@Component
public class SecurityAccessFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
//        /assets/login.css
        String servletPath = request.getServletPath();
        if (
                Arrays.stream(getPermitAllPaths())
                        .anyMatch(path -> servletPath.equals(path) || servletPath.startsWith(path))
        ) {
            filterChain.doFilter(request, response);
        } else if (
                Arrays.stream(getAdminPermitPaths())
                        .anyMatch(path -> servletPath.equals(path) || servletPath.startsWith(path))
        ) {
            User currentUser = SecurityContext.getCurrentUser();
            if (currentUser == null || !UserType.ADMIN.name().equals(currentUser.getUserType())) {
                response.sendRedirect("/access-denied");
            } else {
                filterChain.doFilter(request, response);
            }
        }

    }

    private String[] getPermitAllPaths() {
        return new String[]{
                "/assets", "/login", "/login-process",
                "/access-denied", "/swagger", "/webjars",
                "/v2/api-docs"
        };
    }

    private String[] getAdminPermitPaths() {
        return new String[]{
                "/admin-panel"
        };
    }

}
