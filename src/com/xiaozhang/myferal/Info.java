package com.xiaozhang.myferal;

import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zhang on 2016/3/3.
 */
public class Info {
    private TextView title;
    private TextView time;
    private TextView comment;
    private TextView praise;
    private ImageView commentImage;
    private ImageView praiseImage;

    public TextView getTitle() {
        return title;
    }

    public void setTitle(TextView title) {
        this.title = title;
    }

    public TextView getTime() {
        return time;
    }

    public void setTime(TextView time) {
        this.time = time;
    }

    public TextView getComment() {
        return comment;
    }

    public void setComment(TextView comment) {
        this.comment = comment;
    }

    public TextView getPraise() {
        return praise;
    }

    public void setPraise(TextView praise) {
        this.praise = praise;
    }

    public ImageView getCommentImage() {
        return commentImage;
    }

    public void setCommentImage(ImageView commentImage) {
        this.commentImage = commentImage;
    }

    public ImageView getPraiseImage() {
        return praiseImage;
    }

    public void setPraiseImage(ImageView praiseImage) {
        this.praiseImage = praiseImage;
    }


}
