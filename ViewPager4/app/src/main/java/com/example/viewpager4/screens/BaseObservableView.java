package com.example.viewpager4.screens;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class BaseObservableView<ListenerType> extends BaseView implements BaseObservableViewInf<ListenerType>{
    private Set<ListenerType> mListeners = new HashSet<>();
  // methods to be fetched





    protected final Set<ListenerType> getListeners() {
        return Collections.unmodifiableSet(mListeners);
    }

}
