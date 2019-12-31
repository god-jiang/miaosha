package com.miaoshaproject.service;

import com.miaoshaproject.error.BusinessException;
import com.miaoshaproject.service.model.ItemModel;

import java.util.List;

/**
 * @author god-jiang
 * @date 2019/12/31
 */
public interface ItemService {

    /**
     * @author god-jiang
     * @date 2019/12/31
     * @param itemModel:商品模型
     * @return ItemModel:商品模型
     * @description 创建商品
     */
    ItemModel createItem(ItemModel itemModel) throws BusinessException;

    /**
     * @author god-jiang
     * @date 2019/12/31
     * @param
     * @return List<ItemModel>:商品List
     * @description 列出商品
     */
    List<ItemModel> listItem();

    /**
     * @author god-jiang
     * @date 2019/12/31
     * @param id：商品id
     * @return ItemModel
     * @description 通过id获取商品详情
     */
    ItemModel getItemById(Integer id);

    /**
     * @author god-jiang
     * @date 2019/12/31
     * @param itemId
     * @param amount
     * @return boolean
     * @description 扣减库存
     */
    boolean decreaseStock(Integer itemId, Integer amount) throws BusinessException;

    /**
     * @author god-jiang
     * @date 2019/12/31
     * @param
     * @return
     * @description 增加商品销量
     */
    void increaseSales(Integer itemId, Integer amount) throws BusinessException;

}
