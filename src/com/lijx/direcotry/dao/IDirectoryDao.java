package com.lijx.direcotry.dao;

import com.lijx.direcotry.entity.TableInfo;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/5/10.
 */
public interface IDirectoryDao {
    /**
     * 查询所有的表
     */
    public List<TableInfo> selectAllTable();

    /**
     * 根据表名模糊查询表
     */
    public List<TableInfo> selectTbaleByName(HashMap map);

}
