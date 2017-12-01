package com.logoocc.model;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * Created by samchen on 11/29/17.
 */
@Entity
@Table(name = "tp_goods", schema = "fastdev", catalog = "")
public class TpGoods {

    private Integer goodsId;

    @Id
    @Column(name = "goods_id", nullable = false)
    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    private Integer catId;
    private Integer extendCatId;
    private String goodsSn;
    private String goodsName;
    private Integer clickCount;
    private Short brandId;
    private Short storeCount;
    private Short commentCount;
    private Integer weight;
    private BigDecimal marketPrice;
    private BigDecimal shopPrice;
    private BigDecimal costPrice;
    private String priceLadder;
    private String keywords;
    private String goodsRemark;
    private String goodsContent;
    private String originalImg;
    private Byte isReal;
    private Byte isOnSale;
    private Byte isFreeShipping;
    private Integer onTime;
    private Short sort;
    private Byte isRecommend;
    private Byte isNew;
    private Byte isHot;
    private Integer lastUpdate;
    private Short goodsType;
    private Short specType;
    private Integer exchangeIntegral;
    private Short suppliersId;
    private Integer salesSum;
    private Byte promType;
    private Integer promId;
    private BigDecimal commission;
    private String spu;
    private String sku;
    private String shippingAreaIds;

    @Basic
    @Column(name = "cat_id", nullable = false)
    public Integer getCatId() {
        return catId;
    }

    public void setCatId(Integer catId) {
        this.catId = catId;
    }

    @Basic
    @Column(name = "extend_cat_id", nullable = true)
    public Integer getExtendCatId() {
        return extendCatId;
    }

    public void setExtendCatId(Integer extendCatId) {
        this.extendCatId = extendCatId;
    }

    @Basic
    @Column(name = "goods_sn", nullable = false, length = 60)
    public String getGoodsSn() {
        return goodsSn;
    }

    public void setGoodsSn(String goodsSn) {
        this.goodsSn = goodsSn;
    }

    @Basic
    @Column(name = "goods_name", nullable = false, length = 120)
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "click_count", nullable = false)
    public Integer getClickCount() {
        return clickCount;
    }

    public void setClickCount(Integer clickCount) {
        this.clickCount = clickCount;
    }

    @Basic
    @Column(name = "brand_id", nullable = false)
    public Short getBrandId() {
        return brandId;
    }

    public void setBrandId(Short brandId) {
        this.brandId = brandId;
    }

    @Basic
    @Column(name = "store_count", nullable = false)
    public Short getStoreCount() {
        return storeCount;
    }

    public void setStoreCount(Short storeCount) {
        this.storeCount = storeCount;
    }

    @Basic
    @Column(name = "comment_count", nullable = true)
    public Short getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Short commentCount) {
        this.commentCount = commentCount;
    }

    @Basic
    @Column(name = "weight", nullable = false)
    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "market_price", nullable = false, precision = 2)
    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    @Basic
    @Column(name = "shop_price", nullable = false, precision = 2)
    public BigDecimal getShopPrice() {
        return shopPrice;
    }

    public void setShopPrice(BigDecimal shopPrice) {
        this.shopPrice = shopPrice;
    }

    @Basic
    @Column(name = "cost_price", nullable = true, precision = 2)
    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    @Basic
    @Column(name = "price_ladder", nullable = true, length = -1)
    public String getPriceLadder() {
        return priceLadder;
    }

    public void setPriceLadder(String priceLadder) {
        this.priceLadder = priceLadder;
    }

    @Basic
    @Column(name = "keywords", nullable = false, length = 255)
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    @Basic
    @Column(name = "goods_remark", nullable = false, length = 255)
    public String getGoodsRemark() {
        return goodsRemark;
    }

    public void setGoodsRemark(String goodsRemark) {
        this.goodsRemark = goodsRemark;
    }

    @Basic
    @Column(name = "goods_content", nullable = true, length = -1)
    public String getGoodsContent() {
        return goodsContent;
    }

    public void setGoodsContent(String goodsContent) {
        this.goodsContent = goodsContent;
    }

    @Basic
    @Column(name = "original_img", nullable = false, length = 255)
    public String getOriginalImg() {
        return originalImg;
    }

    public void setOriginalImg(String originalImg) {
        this.originalImg = originalImg;
    }

    @Basic
    @Column(name = "is_real", nullable = false)
    public Byte getIsReal() {
        return isReal;
    }

    public void setIsReal(Byte isReal) {
        this.isReal = isReal;
    }

    @Basic
    @Column(name = "is_on_sale", nullable = false)
    public Byte getIsOnSale() {
        return isOnSale;
    }

    public void setIsOnSale(Byte isOnSale) {
        this.isOnSale = isOnSale;
    }

    @Basic
    @Column(name = "is_free_shipping", nullable = false)
    public Byte getIsFreeShipping() {
        return isFreeShipping;
    }

    public void setIsFreeShipping(Byte isFreeShipping) {
        this.isFreeShipping = isFreeShipping;
    }

    @Basic
    @Column(name = "on_time", nullable = false)
    public Integer getOnTime() {
        return onTime;
    }

    public void setOnTime(Integer onTime) {
        this.onTime = onTime;
    }

    @Basic
    @Column(name = "sort", nullable = false)
    public Short getSort() {
        return sort;
    }

    public void setSort(Short sort) {
        this.sort = sort;
    }

    @Basic
    @Column(name = "is_recommend", nullable = false)
    public Byte getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Byte isRecommend) {
        this.isRecommend = isRecommend;
    }

    @Basic
    @Column(name = "is_new", nullable = false)
    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    @Basic
    @Column(name = "is_hot", nullable = true)
    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "last_update", nullable = false)
    public Integer getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Integer lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Basic
    @Column(name = "goods_type", nullable = false)
    public Short getGoodsType() {
        return goodsType;
    }

    public void setGoodsType(Short goodsType) {
        this.goodsType = goodsType;
    }

    @Basic
    @Column(name = "spec_type", nullable = true)
    public Short getSpecType() {
        return specType;
    }

    public void setSpecType(Short specType) {
        this.specType = specType;
    }

    @Basic
    @Column(name = "exchange_integral", nullable = false)
    public Integer getExchangeIntegral() {
        return exchangeIntegral;
    }

    public void setExchangeIntegral(Integer exchangeIntegral) {
        this.exchangeIntegral = exchangeIntegral;
    }

    @Basic
    @Column(name = "suppliers_id", nullable = false)
    public Short getSuppliersId() {
        return suppliersId;
    }

    public void setSuppliersId(Short suppliersId) {
        this.suppliersId = suppliersId;
    }

    @Basic
    @Column(name = "sales_sum", nullable = true)
    public Integer getSalesSum() {
        return salesSum;
    }

    public void setSalesSum(Integer salesSum) {
        this.salesSum = salesSum;
    }

    @Basic
    @Column(name = "prom_type", nullable = true)
    public Byte getPromType() {
        return promType;
    }

    public void setPromType(Byte promType) {
        this.promType = promType;
    }

    @Basic
    @Column(name = "prom_id", nullable = true)
    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    @Basic
    @Column(name = "commission", nullable = true, precision = 2)
    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    @Basic
    @Column(name = "spu", nullable = true, length = 128)
    public String getSpu() {
        return spu;
    }

    public void setSpu(String spu) {
        this.spu = spu;
    }

    @Basic
    @Column(name = "sku", nullable = true, length = 128)
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    @Basic
    @Column(name = "shipping_area_ids", nullable = false, length = 255)
    public String getShippingAreaIds() {
        return shippingAreaIds;
    }

    public void setShippingAreaIds(String shippingAreaIds) {
        this.shippingAreaIds = shippingAreaIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TpGoods tpGoods = (TpGoods) o;

        if (catId != null ? !catId.equals(tpGoods.catId) : tpGoods.catId != null) return false;
        if (extendCatId != null ? !extendCatId.equals(tpGoods.extendCatId) : tpGoods.extendCatId != null) return false;
        if (goodsSn != null ? !goodsSn.equals(tpGoods.goodsSn) : tpGoods.goodsSn != null) return false;
        if (goodsName != null ? !goodsName.equals(tpGoods.goodsName) : tpGoods.goodsName != null) return false;
        if (clickCount != null ? !clickCount.equals(tpGoods.clickCount) : tpGoods.clickCount != null) return false;
        if (brandId != null ? !brandId.equals(tpGoods.brandId) : tpGoods.brandId != null) return false;
        if (storeCount != null ? !storeCount.equals(tpGoods.storeCount) : tpGoods.storeCount != null) return false;
        if (commentCount != null ? !commentCount.equals(tpGoods.commentCount) : tpGoods.commentCount != null)
            return false;
        if (weight != null ? !weight.equals(tpGoods.weight) : tpGoods.weight != null) return false;
        if (marketPrice != null ? !marketPrice.equals(tpGoods.marketPrice) : tpGoods.marketPrice != null) return false;
        if (shopPrice != null ? !shopPrice.equals(tpGoods.shopPrice) : tpGoods.shopPrice != null) return false;
        if (costPrice != null ? !costPrice.equals(tpGoods.costPrice) : tpGoods.costPrice != null) return false;
        if (priceLadder != null ? !priceLadder.equals(tpGoods.priceLadder) : tpGoods.priceLadder != null) return false;
        if (keywords != null ? !keywords.equals(tpGoods.keywords) : tpGoods.keywords != null) return false;
        if (goodsRemark != null ? !goodsRemark.equals(tpGoods.goodsRemark) : tpGoods.goodsRemark != null) return false;
        if (goodsContent != null ? !goodsContent.equals(tpGoods.goodsContent) : tpGoods.goodsContent != null)
            return false;
        if (originalImg != null ? !originalImg.equals(tpGoods.originalImg) : tpGoods.originalImg != null) return false;
        if (isReal != null ? !isReal.equals(tpGoods.isReal) : tpGoods.isReal != null) return false;
        if (isOnSale != null ? !isOnSale.equals(tpGoods.isOnSale) : tpGoods.isOnSale != null) return false;
        if (isFreeShipping != null ? !isFreeShipping.equals(tpGoods.isFreeShipping) : tpGoods.isFreeShipping != null)
            return false;
        if (onTime != null ? !onTime.equals(tpGoods.onTime) : tpGoods.onTime != null) return false;
        if (sort != null ? !sort.equals(tpGoods.sort) : tpGoods.sort != null) return false;
        if (isRecommend != null ? !isRecommend.equals(tpGoods.isRecommend) : tpGoods.isRecommend != null) return false;
        if (isNew != null ? !isNew.equals(tpGoods.isNew) : tpGoods.isNew != null) return false;
        if (isHot != null ? !isHot.equals(tpGoods.isHot) : tpGoods.isHot != null) return false;
        if (lastUpdate != null ? !lastUpdate.equals(tpGoods.lastUpdate) : tpGoods.lastUpdate != null) return false;
        if (goodsType != null ? !goodsType.equals(tpGoods.goodsType) : tpGoods.goodsType != null) return false;
        if (specType != null ? !specType.equals(tpGoods.specType) : tpGoods.specType != null) return false;
        if (exchangeIntegral != null ? !exchangeIntegral.equals(tpGoods.exchangeIntegral) : tpGoods.exchangeIntegral != null)
            return false;
        if (suppliersId != null ? !suppliersId.equals(tpGoods.suppliersId) : tpGoods.suppliersId != null) return false;
        if (salesSum != null ? !salesSum.equals(tpGoods.salesSum) : tpGoods.salesSum != null) return false;
        if (promType != null ? !promType.equals(tpGoods.promType) : tpGoods.promType != null) return false;
        if (promId != null ? !promId.equals(tpGoods.promId) : tpGoods.promId != null) return false;
        if (commission != null ? !commission.equals(tpGoods.commission) : tpGoods.commission != null) return false;
        if (spu != null ? !spu.equals(tpGoods.spu) : tpGoods.spu != null) return false;
        if (sku != null ? !sku.equals(tpGoods.sku) : tpGoods.sku != null) return false;
        if (shippingAreaIds != null ? !shippingAreaIds.equals(tpGoods.shippingAreaIds) : tpGoods.shippingAreaIds != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = catId != null ? catId.hashCode() : 0;
        result = 31 * result + (extendCatId != null ? extendCatId.hashCode() : 0);
        result = 31 * result + (goodsSn != null ? goodsSn.hashCode() : 0);
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (clickCount != null ? clickCount.hashCode() : 0);
        result = 31 * result + (brandId != null ? brandId.hashCode() : 0);
        result = 31 * result + (storeCount != null ? storeCount.hashCode() : 0);
        result = 31 * result + (commentCount != null ? commentCount.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (shopPrice != null ? shopPrice.hashCode() : 0);
        result = 31 * result + (costPrice != null ? costPrice.hashCode() : 0);
        result = 31 * result + (priceLadder != null ? priceLadder.hashCode() : 0);
        result = 31 * result + (keywords != null ? keywords.hashCode() : 0);
        result = 31 * result + (goodsRemark != null ? goodsRemark.hashCode() : 0);
        result = 31 * result + (goodsContent != null ? goodsContent.hashCode() : 0);
        result = 31 * result + (originalImg != null ? originalImg.hashCode() : 0);
        result = 31 * result + (isReal != null ? isReal.hashCode() : 0);
        result = 31 * result + (isOnSale != null ? isOnSale.hashCode() : 0);
        result = 31 * result + (isFreeShipping != null ? isFreeShipping.hashCode() : 0);
        result = 31 * result + (onTime != null ? onTime.hashCode() : 0);
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        result = 31 * result + (isRecommend != null ? isRecommend.hashCode() : 0);
        result = 31 * result + (isNew != null ? isNew.hashCode() : 0);
        result = 31 * result + (isHot != null ? isHot.hashCode() : 0);
        result = 31 * result + (lastUpdate != null ? lastUpdate.hashCode() : 0);
        result = 31 * result + (goodsType != null ? goodsType.hashCode() : 0);
        result = 31 * result + (specType != null ? specType.hashCode() : 0);
        result = 31 * result + (exchangeIntegral != null ? exchangeIntegral.hashCode() : 0);
        result = 31 * result + (suppliersId != null ? suppliersId.hashCode() : 0);
        result = 31 * result + (salesSum != null ? salesSum.hashCode() : 0);
        result = 31 * result + (promType != null ? promType.hashCode() : 0);
        result = 31 * result + (promId != null ? promId.hashCode() : 0);
        result = 31 * result + (commission != null ? commission.hashCode() : 0);
        result = 31 * result + (spu != null ? spu.hashCode() : 0);
        result = 31 * result + (sku != null ? sku.hashCode() : 0);
        result = 31 * result + (shippingAreaIds != null ? shippingAreaIds.hashCode() : 0);
        return result;
    }
}
