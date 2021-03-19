package com.luna.application.listView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.luna.application.R;

public class ListViewAdapter extends BaseAdapter {

    private Context        mContext;
    private LayoutInflater mLayoutInflater;

    public ListViewAdapter(Context context) {
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    static class ViewHolder {
        public ImageView imageView;
        public TextView  tvTitle, tvTime, tvContent;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null) {
            view = mLayoutInflater.inflate(R.layout.list_item_layout, null);
            holder = new ViewHolder();
            holder.imageView = view.findViewById(R.id.iv);
            holder.tvTitle = view.findViewById(R.id.tv_title);
            holder.tvTime = view.findViewById(R.id.tv_time);
            holder.tvContent = view.findViewById(R.id.tv_content);
            view.setTag(holder);
        } else
            holder = (ViewHolder)view.getTag();
        holder.tvTitle.setText("安卓应用开发");
        holder.tvTime.setText("2021-3-19");
        holder.tvContent.setText("面朝大海，春暖花开");
        Glide.with(mContext).load("https://www.isczy.tk/luna-image-bed/img/20210316141051.png").into(holder.imageView);
        return view;
    }
}
