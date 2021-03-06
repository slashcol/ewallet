package com.fr.chain.trade.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fr.chain.trade.db.dao.TradeFlowDao;
import com.fr.chain.trade.db.dao.TradeOrderDao;
import com.fr.chain.trade.db.entity.TradeFlow;
import com.fr.chain.trade.db.entity.TradeFlowExample;
import com.fr.chain.trade.db.entity.TradeOrder;
import com.fr.chain.trade.db.entity.TradeOrderExample;
import com.fr.chain.trade.db.entity.TradeOrderKey;
import com.fr.chain.trade.service.QueryTradeOrderService;

@Service("queryTradeOrderService")
public class QueryTradeOrderServiceImpl implements QueryTradeOrderService {
	
	@Resource 
	TradeOrderDao tradeOrderDao;
	@Resource 
	TradeFlowDao tradeFlowDao;
	
	@Override
	public List<TradeOrder>  selectByExample(TradeOrder property) {
		return  tradeOrderDao.selectByExample(tradeOrderDao.getExample(property));		
	}

	@Override
	public List<TradeOrder>  selectByExample(TradeOrderExample info){
		return  tradeOrderDao.selectByExample(info);	
	}
	@Override
	public TradeOrder selectOrderByKey(String orderId){
		TradeOrderKey key = new TradeOrderKey();
		key.setOrderId(orderId);
		return tradeOrderDao.selectByPrimaryKey(key);
	}
	@Override
	public List<TradeFlow> selectByExample(TradeFlow info){
		return tradeFlowDao.selectByExample(tradeFlowDao.getExample(info));
	}
	
	@Override
	public List<TradeFlow> selectByExample(TradeFlowExample info){
		return tradeFlowDao.selectByExample(info);
	}
}
