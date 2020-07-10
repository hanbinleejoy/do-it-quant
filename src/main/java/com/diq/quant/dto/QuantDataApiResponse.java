package com.diq.quant.dto;

import com.diq.quant.domain.QuantData;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuantDataApiResponse {

	private Long id;
	
	private String code;

	private String cmpname;

	private Double debtRatio;

	private Double reserveRatio;

	private Double operatingProfit;

	private Double roa;

	private Double roe;

	private Double per;

	private Double pbr;
	
	
}
