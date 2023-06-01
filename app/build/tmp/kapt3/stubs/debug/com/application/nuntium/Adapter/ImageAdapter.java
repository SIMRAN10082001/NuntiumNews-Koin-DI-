package com.application.nuntium.Adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001bB\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001c\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012H\u0016J\u001c\u0010\u0017\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0012H\u0016R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lcom/application/nuntium/Adapter/ImageAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/application/nuntium/Adapter/ImageAdapter$ImageViewHolder;", "list", "", "Lcom/application/nuntium/model/ImageModelViewPager;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "(Ljava/util/List;Landroidx/viewpager2/widget/ViewPager2;)V", "getList", "()Ljava/util/List;", "setList", "(Ljava/util/List;)V", "getViewPager", "()Landroidx/viewpager2/widget/ViewPager2;", "setViewPager", "(Landroidx/viewpager2/widget/ViewPager2;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ImageViewHolder", "app_debug"})
public final class ImageAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.application.nuntium.Adapter.ImageAdapter.ImageViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.application.nuntium.model.ImageModelViewPager> list;
    @org.jetbrains.annotations.NotNull()
    private androidx.viewpager2.widget.ViewPager2 viewPager;
    
    public ImageAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.application.nuntium.model.ImageModelViewPager> list, @org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 viewPager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.application.nuntium.model.ImageModelViewPager> getList() {
        return null;
    }
    
    public final void setList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.application.nuntium.model.ImageModelViewPager> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.viewpager2.widget.ViewPager2 getViewPager() {
        return null;
    }
    
    public final void setViewPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.application.nuntium.Adapter.ImageAdapter.ImageViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.application.nuntium.Adapter.ImageAdapter.ImageViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\"\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/application/nuntium/Adapter/ImageAdapter$ImageViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lcom/application/nuntium/Adapter/ImageAdapter;Landroid/view/View;)V", "img", "Lcom/google/android/material/imageview/ShapeableImageView;", "kotlin.jvm.PlatformType", "getImg", "()Lcom/google/android/material/imageview/ShapeableImageView;", "setImg", "(Lcom/google/android/material/imageview/ShapeableImageView;)V", "bind", "", "imageModelViewPager", "Lcom/application/nuntium/model/ImageModelViewPager;", "app_debug"})
    public final class ImageViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.google.android.material.imageview.ShapeableImageView img;
        
        public ImageViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final com.google.android.material.imageview.ShapeableImageView getImg() {
            return null;
        }
        
        public final void setImg(com.google.android.material.imageview.ShapeableImageView p0) {
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.application.nuntium.model.ImageModelViewPager imageModelViewPager) {
        }
    }
}