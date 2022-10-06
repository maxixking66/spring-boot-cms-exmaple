package com.maktabsharif74.cms.springbootcmsexmaple.util;


import com.maktabsharif74.cms.springbootcmsexmaple.domain.User;

public class SecurityContext {

    private final static ThreadLocal<User> currentUserThread = new ThreadLocal<>();

    public static User getCurrentUser() {
        return currentUserThread.get();
    }

    public static void setCurrentUser(User user) {
        currentUserThread.set(user);
    }

    public static void clear() {
        currentUserThread.remove();
    }
}
