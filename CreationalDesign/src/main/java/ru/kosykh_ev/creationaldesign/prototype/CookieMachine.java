package ru.kosykh_ev.creationaldesign.prototype;

/**
 * Client class.
 * @author monoid
 */
public class CookieMachine {
    
    private final Cookie cookie; // Could have been a private Cloneable cookie.
    
    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }
    
    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }
}
