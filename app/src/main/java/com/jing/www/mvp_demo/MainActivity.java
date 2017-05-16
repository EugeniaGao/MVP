package com.jing.www.mvp_demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainActivityView{

    private Presenter presenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new PresenterImpl(this);
        presenter.getData();
    }
private  List data;
    @Override
    public void setData(List list) {
       this.data=list;
        ListView view = (ListView) findViewById(R.id.lv);
        view.setAdapter(new MyBaseAdapter());
        
    }



    private class MyBaseAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            if (data != null) {
                return data.size();
            }
            return 0;
        }

        @Override
        public Object getItem(int position) {
            if (data != null) {
                return data.get(position);
            }
        return null;
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView =new TextView(getApplicationContext());
            textView.setText(data.get(position)+"haoa");
            textView.setTextColor(Color.RED);
         //   View view = LayoutInflater.from(getApplicationContext()).inflate(textView, parent, false);

            return textView;
        }
    }
}
