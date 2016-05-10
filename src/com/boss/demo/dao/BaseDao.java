/**
 * 
 */
package com.boss.demo.dao;

import com.ibatis.sqlmap.client.SqlMapClient;

public interface BaseDao {
	public SqlMapClient getSqlMapClientRef();
}
