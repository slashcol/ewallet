package com.fr.chain.vo.property;

import com.fr.chain.message.MsgBody;

import lombok.Data;

@Data
public class Res_CreatePropertyVo extends MsgBody{
	private String productid;
	
	public Res_CreatePropertyVo(){		
	}
	
	public Res_CreatePropertyVo(String datano){
		this.datano = datano;
	}
	
	
	
}
