package com.diq.quant.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.diq.quant.dto.QuantDataApiResponse;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class QuantData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public QuantDataApiResponse toResponse() {

		return QuantDataApiResponse.builder()
				.id(id)
				.code(code)
				.cmpname(cmpname)
				.debtRatio(debtRatio)
				.reserveRatio(reserveRatio)
				.operatingProfit(operatingProfit)
				.roa(roa)
				.roe(roe)
				.per(per)
				.pbr(pbr)
				.build();
	}

}
