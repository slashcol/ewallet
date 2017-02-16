package com.fr.chain.facadeservice.trade;

import java.util.List;

import com.fr.chain.message.Message;
import com.fr.chain.message.MsgBody;
import com.fr.chain.message.ResponseMsg;
import com.fr.chain.trade.db.entity.TradeOrder;
import com.fr.chain.trade.db.entity.TradeOrderExample;
import com.fr.chain.trade.db.entity.TradeOrderKey;
import com.fr.chain.vo.trade.ChangePropertyVo;
import com.fr.chain.vo.trade.GetPropertyVo;
import com.fr.chain.vo.trade.QueryTradeOrderVo;
import com.fr.chain.vo.trade.Res_QueryTradeOrderVo;
import com.fr.chain.vo.trade.Res_SendPropertyVo;
import com.fr.chain.vo.trade.SendPropertyVo;

public interface TradeOrderService {
	
    public int insert(TradeOrder info);
	
	public int batchInsert(List<TradeOrder> records);	
	
	public int deleteByPrimaryKey (TradeOrderKey key);
	
	public List<TradeOrder>  selectByExample(TradeOrder info);
	public List<TradeOrder>  selectByExample(TradeOrderExample info);
	
	public int updateByExampleSelective (TradeOrder record, TradeOrderExample example);
	
	public void queryAndCreateTradeOrder(Message msg, QueryTradeOrderVo msgVo, Res_QueryTradeOrderVo res_QueryTradeOrderVo );
	public void sendAndCreateProperty(Message msg, SendPropertyVo msgVo, Res_SendPropertyVo res_SendPropertyVo );
	public void getAndCreateProperty(Message msg, GetPropertyVo msgVo, ResponseMsg responseMsg  );
	public void changeAndDeleteProperty(Message msg, ChangePropertyVo msgVo, ResponseMsg responseMsg);
	
}
