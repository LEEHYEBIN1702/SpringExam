package com.company.temp.service;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PrdVO {
	private String product_id;
	private String product_name;
	private String product_price;
	private String product_info;
	private String product_date;
	private String company;
	private String manager_id;
}
