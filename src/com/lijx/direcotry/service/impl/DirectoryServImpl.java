package com.lijx.direcotry.service.impl;

import com.lijx.direcotry.dao.IDirectoryDao;
import com.lijx.direcotry.entity.TableInfo;
import com.lijx.direcotry.service.IDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/5/14.
 */
public class DirectoryServImpl implements IDirectoryService {
    @Autowired
    private IDirectoryDao directoryDao;

    @Override
    public List<TableInfo> selectAllTable() {
        return directoryDao.selectAllTable();
    }

    @Override
    public List<TableInfo> selectTbaleByName(HashMap map) {
        return directoryDao.selectTbaleByName(map);
    }
}
