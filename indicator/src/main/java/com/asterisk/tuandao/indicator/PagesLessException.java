package com.asterisk.tuandao.indicator;

/**
 * Created by SUN\ tuan-dao on 05/07/2019.
 * dao.tuan.anh@sun-asterisk.com
 */
public class PagesLessException extends Exception {
    @Override
    public String getMessage() {
        return "Pages must equal or larger than 2";
    }
}