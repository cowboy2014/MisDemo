package com.lijx.direcotry.dao.impl;

import com.boss.demo.dao.impl.BaseDaoImpl;
import com.lijx.direcotry.dao.IDirectoryDao;
import com.lijx.direcotry.entity.TableInfo;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/5/10.
 */
public class DirectoryDaoImpl extends BaseDaoImpl implements IDirectoryDao {
    @Override
    public List<TableInfo> selectAllTable() {
        List<TableInfo> tableInfos = findAll("biapNSP.selectAllTable");
        return tableInfos;
    }

    @Override
    public List<TableInfo> selectTbaleByName(HashMap map) {
        return this.find("biapNSP.selectTbaleByName", map);
    }
}
