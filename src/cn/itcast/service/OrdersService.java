package cn.itcast.service;

import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.OrdersDao;
@Transactional

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
		//异常
		int i = 10/0;
		//多钱的方法
		ordersDao.moreMoney();
	}
}
