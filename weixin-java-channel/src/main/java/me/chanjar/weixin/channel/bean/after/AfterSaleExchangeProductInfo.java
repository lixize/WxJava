package me.chanjar.weixin.channel.bean.after;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 * 换货商品信息
 *
 * @author <a href="https://github.com/lixize">Zeyes</a>
 */
public class AfterSaleExchangeProductInfo implements Serializable {

  private static final long serialVersionUID = 2828865020915045126L;

  /** 商品spuid */
  @JsonProperty("product_id")
  private String productId;

  /** 旧商品skuid */
  @JsonProperty("old_sku_id")
  private String oldSkuId;

  /** 新商品skuid */
  @JsonProperty("new_sku_id")
  private String newSkuId;

  /** 数量 */
  @JsonProperty("product_count")
  private Integer productCount;
  
}
