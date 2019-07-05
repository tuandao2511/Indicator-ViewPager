package com.asterisk.tuandao.indicator;

import android.support.v4.view.ViewPager;

/**
 * Created by SUN\ tuan-dao on 05/07/2019.
 * dao.tuan.anh@sun-asterisk.com
 */
public interface IndicatorInterface {
    void setViewPager(ViewPager viewPager) throws PagesLessException;

    void setAnimateDuration(long duration);

    /**
     *
     * @param radius: radius in pixel
     */
    void setRadiusSelected(int radius);

    /**
     *
     * @param radius: radius in pixel
     */
    void setRadiusUnselected(int radius);

    /**
     *
     * @param distance: distance in pixel
     */
    void setDistanceDot(int distance);
}
