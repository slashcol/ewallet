package com.fr.chain.vo.property;

import com.fr.chain.message.MsgBody;

import lombok.Data;

@Data
public class QueryPropertyVo extends MsgBody{
	private String propertytype;
	private String productid;
	private String status;	
}
