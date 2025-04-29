package me.chanjar.weixin.channel.bean.after;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 赠品信息
 *
 * @author <a href="https://github.com/lixize">Zeyes</a>
 */
@Data
@NoArgsConstructor
public class AfterSaleGiftProductInfo implements Serializable {

  private static final long serialVersionUID = -8652880416122863149L;

  /** 商品spuid */
  @JsonProperty("product_id")
  private String productId;

  /** 商品skuid */
  @JsonProperty("sku_id")
  private String skuId;

  /** 退款数量 */
  @JsonProperty("count")
  private Integer count;
}
