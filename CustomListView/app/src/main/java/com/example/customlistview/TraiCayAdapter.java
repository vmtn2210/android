package com.example.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override
    public int getCount() { //trả về số dòng hiển thị trên listView
        // return 0;
        return traiCayList.size();
    }

    @Override
    public Object getItem(int i) { return null; }

    @Override
    public long getItemId(int i) { return 0; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) { //trả về view mỗi dòng trên item khi gọi adapter
        LayoutInflater inflater = (LayoutInflater)  context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout,null);

        //ánh xạ
        TextView txtTen = (TextView) view.findViewById(R.id.textViewTen);
        TextView txtMota = (TextView) view.findViewById(R.id.textviewMota   );
        ImageView imageHinh = (ImageView)  view.findViewById(R.id.imageviewHinh);
        //Gán giá trị
        TraiCay traiCay = traiCayList.get(i);
        txtTen.setText(traiCay.getTen());
        txtMota.setText(traiCay.getMota());
        imageHinh.setImageResource(traiCay.getHinh());
        //return null; trả về view
        return view;
    }
}
