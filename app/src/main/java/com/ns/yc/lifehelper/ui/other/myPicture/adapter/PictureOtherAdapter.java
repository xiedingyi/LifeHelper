package com.ns.yc.lifehelper.ui.other.myPicture.adapter;

import android.app.Activity;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.ns.yc.lifehelper.R;
import com.ns.yc.lifehelper.ui.other.myNews.txNews.bean.TxNewsBean;
import com.ns.yc.lifehelper.utils.image.ImageUtils;

import org.yczbj.ycrefreshviewlib.adapter.RecyclerArrayAdapter;
import org.yczbj.ycrefreshviewlib.viewHolder.BaseViewHolder;


/**
 * ================================================
 * 作    者：杨充
 * 版    本：1.0
 * 创建日期：2017/8/29
 * 描    述：
 * 修订历史：
 * ================================================
 */
public class PictureOtherAdapter extends RecyclerArrayAdapter<TxNewsBean.NewslistBean> {

    public PictureOtherAdapter(Activity activity) {
        super(activity);
    }

    @Override
    public BaseViewHolder OnCreateViewHolder(ViewGroup parent, int viewType) {
        return new ExpressDeliveryViewHolder(parent);
    }


    private class ExpressDeliveryViewHolder extends BaseViewHolder<TxNewsBean.NewslistBean> {

        ImageView iv_logo;
        TextView tv_title , tv_time;

        ExpressDeliveryViewHolder(ViewGroup parent) {
            super(parent, R.layout.item_tx_news_list);
            tv_title = $(R.id.tv_title);
            tv_time = $(R.id.tv_time);
            iv_logo = $(R.id.iv_logo);
        }

        @Override
        public void setData(TxNewsBean.NewslistBean data) {
            super.setData(data);
            if(data.getTitle()!=null && data.getTitle().length()>0){
                tv_title.setText(data.getTitle());
            }
            if(data.getCtime()!=null && data.getCtime().length()>0){
                tv_time.setText(data.getCtime());
            }
            ImageUtils.loadImgByPicassoError(getContext(),data.getPicUrl(),R.drawable.shape_load_error_img , iv_logo);
        }
    }
}
