package com.jinhui.api.service.account;


import com.jinhui.api.entity.po.Market;

/**
 * 产品行情服务层
 *
 * @autor wsc
 * @create 2018-03-28 14:17
 **/
public interface MarketServcie {

    Market selectByProductName(String productName);
}
