package com.jing.www.mvp_demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/3/26.
 */

public class PresenterImpl implements Presenter {

    private List list;
private MainActivityView view;

    public PresenterImpl(MainActivityView view) {
        this.view = view;
    }

    @Override
    public void getData() {
        list = new ArrayList();
        for (int i = 0; i <100 ; i++) {
            list.add("条目0"+i);
        }
        view.setData(list);

    }
}
