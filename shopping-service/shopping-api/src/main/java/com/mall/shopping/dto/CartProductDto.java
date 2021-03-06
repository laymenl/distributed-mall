package com.mall.shopping.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *  ciggar
 * create-date: 2019/7/23-19:01
 */


@Data
public class CartProductDto implements Serializable {
    private static final long serialVersionUID = -809047960626248847L;

    private Long productId;

    private BigDecimal salePrice;

    private Long productNum;

    private Long limitNum;

    private String checked;

    private String productName;

    private String productImg;

    public CartProductDto() {
    }

    public CartProductDto(Long productId, BigDecimal salePrice, Long productNum, Long limitNum, String checked, String productName, String productImg) {
        this.productId = productId;
        this.salePrice = salePrice;
        this.productNum = productNum;
        this.limitNum = limitNum;
        this.checked = checked;
        this.productName = productName;
        this.productImg = productImg;
    }
}
