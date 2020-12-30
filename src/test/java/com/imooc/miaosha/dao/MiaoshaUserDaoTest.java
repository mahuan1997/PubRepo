package com.imooc.miaosha.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.miaosha.domain.MiaoshaUser;

/**
 * 
 * @ClassName: MiaoshaUserDaoTest
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author mahuan
 * @date 2020年12月30日
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MiaoshaUserDaoTest {

	@Autowired
	private MiaoshaUserDao miaoshaUserDao;
	
	/**
	 * 
	 * @Title: testGetById
	 * @Description: 测试
	 * @param  参数
	 * @return void 返回类型
	 * @throws
	 */
	@Test
	public void testGetById() {
		MiaoshaUser user = miaoshaUserDao.getById(15226095937L);
		System.out.println(user.getNickname());
	}

}
