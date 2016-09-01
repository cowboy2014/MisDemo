package com.lijx.direcotry.action;

import com.boss.demo.action.BaseAction;
import com.lijx.direcotry.entity.TableInfo;
import com.lijx.direcotry.service.IDirectoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Administrator on 2016/5/10.
 */
public class DirectoryAction extends BaseAction{
    @Autowired
    private IDirectoryService directoryService;
    private TableInfo table;
//    private List<>
    public List rows = new ArrayList();
    private HashMap map;

    public String selectAllTable(){
        directoryService.selectAllTable();
        return SUCCESS;
    }

    public String selectTbaleByName(){
        map.put("tab_name",table.getTab_name());
        rows = directoryService.selectTbaleByName(map);
        return SUCCESS;
    }

    public TableInfo getTable() {
        return table;
    }

    public void setTable(TableInfo table) {
        this.table = table;
    }
}
