package com.application.nuntium;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004H\u0002J \u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\fH\u0002J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\u0016\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0004J\u0016\u0010\u001b\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lcom/application/nuntium/constants;", "", "()V", "country", "", "firstTime", "language", "sharedPreferencesKey", "title", "editor", "", "context", "Landroid/content/Context;", "const", "string", "editorBoolean", "bool", "", "getCountry", "getLanguage", "getSharedPreference", "Landroid/content/SharedPreferences;", "ctx", "getUserTime", "setCountry", "setLanguage", "lang", "setUserTime", "status", "app_debug"})
public final class constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.application.nuntium.constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String sharedPreferencesKey = "com.application.nuntium";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String country = "COUNTRY";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String language = "LANGUAGE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String title = "TITLE";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String firstTime = "intro";
    
    private constants() {
        super();
    }
    
    private final android.content.SharedPreferences getSharedPreference(android.content.Context ctx) {
        return null;
    }
    
    private final void editor(android.content.Context context, java.lang.String p1_47422385, java.lang.String string) {
    }
    
    private final void editorBoolean(android.content.Context context, java.lang.String p1_47422385, boolean bool) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setLanguage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String country) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final void setUserTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String status) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUserTime(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}