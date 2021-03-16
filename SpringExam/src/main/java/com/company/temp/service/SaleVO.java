package com.company.temp.service;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaleVO {
	
	private String sale_seq;
	private String sale_date;
	private String product_id;
	private String sale_qty;
	private String sale_price;
	private String member_id;
	

}
