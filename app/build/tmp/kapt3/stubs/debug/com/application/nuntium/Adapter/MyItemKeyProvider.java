package com.application.nuntium.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/application/nuntium/Adapter/MyItemKeyProvider;", "Landroidx/recyclerview/selection/ItemKeyProvider;", "Lcom/application/nuntium/model/TileModel;", "adapter", "Lcom/application/nuntium/Adapter/ChoiceAdapter;", "(Lcom/application/nuntium/Adapter/ChoiceAdapter;)V", "getKey", "position", "", "getPosition", "key", "app_debug"})
public final class MyItemKeyProvider extends androidx.recyclerview.selection.ItemKeyProvider<com.application.nuntium.model.TileModel> {
    private final com.application.nuntium.Adapter.ChoiceAdapter adapter = null;
    
    public MyItemKeyProvider(@org.jetbrains.annotations.NotNull()
    com.application.nuntium.Adapter.ChoiceAdapter adapter) {
        super(0);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public com.application.nuntium.model.TileModel getKey(int position) {
        return null;
    }
    
    @java.lang.Override()
    public int getPosition(@org.jetbrains.annotations.NotNull()
    com.application.nuntium.model.TileModel key) {
        return 0;
    }
}