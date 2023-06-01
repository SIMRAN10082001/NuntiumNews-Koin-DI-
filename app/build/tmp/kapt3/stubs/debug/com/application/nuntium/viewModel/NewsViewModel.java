package com.application.nuntium.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u00100\u001a\u000201J\u001e\u00102\u001a\u0002012\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u000204J\u0016\u00107\u001a\u0002012\u0006\u00103\u001a\u0002042\u0006\u00108\u001a\u000204J\u0006\u00109\u001a\u000201J\u000e\u0010:\u001a\u0002012\u0006\u0010;\u001a\u00020\bJ&\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\u0006\u0010<\u001a\u0002042\u0006\u00105\u001a\u000204J\u0016\u0010=\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u00105\u001a\u000204J\u0016\u0010>\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u00105\u001a\u000204J\u0016\u0010?\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u00105\u001a\u000204J\u0016\u0010@\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u00105\u001a\u000204J\u0016\u0010A\u001a\u0002012\u0006\u0010<\u001a\u0002042\u0006\u00105\u001a\u000204R\'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\'\u0010\f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\'\u0010\u000e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u000bR\'\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u000bR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\'\u0010\u001b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u000bR\'\u0010\u001d\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00110 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00110 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180 X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R*\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010%\"\u0004\b.\u0010/\u00a8\u0006B"}, d2 = {"Lcom/application/nuntium/viewModel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "newsRepository", "Lcom/application/nuntium/repository/NewsRepository;", "(Lcom/application/nuntium/repository/NewsRepository;)V", "_businessList", "Landroidx/lifecycle/LiveData;", "Ljava/util/ArrayList;", "Lcom/application/nuntium/model/articles;", "Lkotlin/collections/ArrayList;", "get_businessList", "()Landroidx/lifecycle/LiveData;", "_healthList", "get_healthList", "_interests", "get_interests", "_loadingState", "Lcom/application/nuntium/utils/LoadingState;", "get_loadingState", "_loadingStateSearch", "get_loadingStateSearch", "_politicsList", "get_politicsList", "_sourceList", "", "Lcom/application/nuntium/model/SourcesItem;", "get_sourceList", "_sportList", "get_sportList", "_technologyList", "get_technologyList", "businessList", "Landroidx/lifecycle/MutableLiveData;", "healthList", "interests", "loadedResult", "getLoadedResult", "()Ljava/util/ArrayList;", "loadingState", "loadingStateSearch", "politicsList", "sourceList", "sportList", "technologyList", "topHeadlines", "getTopHeadlines", "setTopHeadlines", "(Ljava/util/ArrayList;)V", "getSavedData", "", "getSearch", "q", "", "language", "limit", "getSearchData", "lang", "getSources", "saveHeadlines", "model", "country", "topHeadlinesBusiness", "topHeadlinesHealth", "topHeadlinesPolitics", "topHeadlinesSports", "topHeadlinesTechnology", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.application.nuntium.repository.NewsRepository newsRepository = null;
    private final androidx.lifecycle.MutableLiveData<com.application.nuntium.utils.LoadingState> loadingState = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.application.nuntium.model.articles> topHeadlines;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.nuntium.model.articles>> sportList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.nuntium.model.articles>> businessList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.nuntium.model.articles>> healthList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.nuntium.model.articles>> technologyList = null;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.nuntium.model.articles>> interests;
    private androidx.lifecycle.MutableLiveData<java.util.ArrayList<com.application.nuntium.model.articles>> politicsList;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.application.nuntium.model.articles> loadedResult = null;
    private androidx.lifecycle.MutableLiveData<java.util.List<com.application.nuntium.model.SourcesItem>> sourceList;
    private androidx.lifecycle.MutableLiveData<com.application.nuntium.utils.LoadingState> loadingStateSearch;
    
    public NewsViewModel(@org.jetbrains.annotations.NotNull()
    com.application.nuntium.repository.NewsRepository newsRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.application.nuntium.model.articles> getTopHeadlines() {
        return null;
    }
    
    public final void setTopHeadlines(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.application.nuntium.model.articles> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.nuntium.model.articles>> get_sportList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.nuntium.model.articles>> get_businessList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.nuntium.model.articles>> get_healthList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.nuntium.model.articles>> get_technologyList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.nuntium.model.articles>> get_interests() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.ArrayList<com.application.nuntium.model.articles>> get_politicsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.application.nuntium.utils.LoadingState> get_loadingState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.application.nuntium.model.articles> getLoadedResult() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.application.nuntium.model.SourcesItem>> get_sourceList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.application.nuntium.utils.LoadingState> get_loadingStateSearch() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.application.nuntium.model.articles> topHeadlines(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
        return null;
    }
    
    public final void topHeadlinesSports(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    public final void topHeadlinesBusiness(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    public final void topHeadlinesHealth(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    public final void topHeadlinesTechnology(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    public final void topHeadlinesPolitics(@org.jetbrains.annotations.NotNull()
    java.lang.String country, @org.jetbrains.annotations.NotNull()
    java.lang.String language) {
    }
    
    public final void saveHeadlines(@org.jetbrains.annotations.NotNull()
    com.application.nuntium.model.articles model) {
    }
    
    public final void getSavedData() {
    }
    
    public final void getSources() {
    }
    
    public final void getSearchData(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    java.lang.String lang) {
    }
    
    public final void getSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String q, @org.jetbrains.annotations.NotNull()
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    java.lang.String limit) {
    }
}