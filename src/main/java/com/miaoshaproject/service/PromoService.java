package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;

/**
 * @author god-jiang
 * @date 2020/1/6
 */
public interface PromoService {
    //根据itemid获取即将进行的或者正在进行的秒杀活动
    public PromoModel getPromoByItemId(Integer itemId);
}
