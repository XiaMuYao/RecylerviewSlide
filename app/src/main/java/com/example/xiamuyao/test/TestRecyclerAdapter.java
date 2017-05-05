package com.example.xiamuyao.test;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.yayandroid.parallaxrecyclerview.ParallaxViewHolder;

import org.xutils.x;


/**
 * Created by yahyabayramoglu on 14/04/15.
 */
public class TestRecyclerAdapter extends RecyclerView.Adapter<TestRecyclerAdapter.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;


    private String[] imageUrls = new String[]{
            "https://wedanf-wz.wedanf.com/ZT/wedanf-zt7.jpg",
            "https://wedanf-wz.wedanf.com/ZT/wedanf-zt6.jpg",
            "https://wedanf-wz.wedanf.com/ZT/wedanf-zt1.jpg",
            "https://wedanf-wz.wedanf.com/ZT/wedanf-zt2.jpg",
            "https://wedanf-wz.wedanf.com/ZT/wedanf-zt0.jpg",
            "https://wedanf-wz.wedanf.com/ZT/wedanf-zt7.jpg",

    };

    public TestRecyclerAdapter(Context context) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int position) {
        return new ViewHolder(inflater.inflate(R.layout.item, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int position) {
//        Picasso.with(context).load(imageUrls[position % imageUrls.length]).into(viewHolder.getBackgroundImage());
        x.image().bind(viewHolder.getBackgroundImage(), imageUrls[position]);
        viewHolder.getTextView().setText("Row " + position);
        // # CAUTION:
        // Important to call this method
        viewHolder.getBackgroundImage().reuse();
    }

    @Override
    public int getItemCount() {
        return imageUrls.length;
    }

    /**
     * # CAUTION:
     * ViewHolder must extend from ParallaxViewHolder
     */
    public static class ViewHolder extends ParallaxViewHolder {

        private final TextView textView;

        public ViewHolder(View v) {
            super(v);

            textView = (TextView) v.findViewById(R.id.label);
        }

        @Override
        public int getParallaxImageId() {
            return R.id.backgroundImage;
        }

        public TextView getTextView() {
            return textView;
        }
    }


}
