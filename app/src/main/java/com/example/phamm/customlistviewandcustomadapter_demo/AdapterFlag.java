package com.example.phamm.customlistviewandcustomadapter_demo;

/**
 * Created by phamm on 7/27/2017.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
public class AdapterFlag extends BaseAdapter{
    private Context context;
    private List<FlagFootball> list;
    private int layout;

    public AdapterFlag(Context context, int layout, ArrayList<FlagFootball> list) {
        this.context = context;
        this.list = list;
        this.layout = layout;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public List<FlagFootball> getList() {
        return list;
    }

    public void setList(List<FlagFootball> list) {
        this.list = list;
    }

    public int getLayout() {
        return layout;
    }

    public void setLayout(int layout) {
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        ImageView imghinh = (ImageView) view.findViewById(R.id.imageView);
        TextView txtten  = (TextView) view.findViewById(R.id.txtTen);
        TextView txtnam = (TextView) view.findViewById(R.id.txtNam);

        FlagFootball flag = list.get(i);

        imghinh.setImageResource(flag.getHinh());
        txtten.setText(flag.getTen());
        txtnam.setText(flag.getNam());

        return view;
    }
}
