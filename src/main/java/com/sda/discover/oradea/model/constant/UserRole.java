package com.sda.discover.oradea.model.constant;

public enum UserRole {
    ADMIN("Admin"),
    GUEST("Guest");

    private final String displayName;

    UserRole(String displayName) {
        this.displayName = displayName;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
