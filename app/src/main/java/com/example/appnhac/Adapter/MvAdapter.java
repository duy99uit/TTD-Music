package com.example.appnhac.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.appnhac.Model.Mv;
import com.example.appnhac.Model.Playlist;
import com.example.appnhac.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class MvAdapter extends ArrayAdapter<Mv> {
    public MvAdapter(@NonNull Context context, int resource, @NonNull List<Mv> objects) {
        super(context, resource, objects);
    }
    class ViewHolder{
        TextView txttenmv;
        ImageView imgbackground;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder viewHolder=null;
        if(convertView==null){
            LayoutInflater inflater=LayoutInflater.from(getContext());
            convertView=inflater.inflate(R.layout.dong_mv,null);
            viewHolder=new ViewHolder();

            viewHolder.txttenmv=convertView.findViewById(R.id.textviewtenmv);
            viewHolder.imgbackground=convertView.findViewById(R.id.imageviewbackgroundmv);

            convertView.setTag(viewHolder);
        }else{
            viewHolder= (MvAdapter.ViewHolder) convertView.getTag();
        }

        Mv mv=getItem(position);
        Picasso.with(getContext()).load(mv.getHinhmv()).into(viewHolder.imgbackground);
        viewHolder.txttenmv.setText(mv.getTenmv());
        return convertView;
    }
}
