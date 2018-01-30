package cn.itcast.service;

import cn.itcast.dao.OrdersDao;

public class OrdersService {
	private OrdersDao ordersDao;

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}
	//调用dao的方法
	//业务逻辑层，写转账的业务
	public void accountMony() {
		//少钱方法
		ordersDao.lessMoney();
		//多钱的方法
		ordersDao.moreMoney();
	}
}
