package com.kgc.service;

import com.github.pagehelper.PageInfo;
import com.kgc.entity.Emp;
import com.kgc.utils.EmpParam;

public interface EmpService {
    public PageInfo<Emp> getEmpListByPage(Integer pageIndex, Integer pageSize, EmpParam empParam);

}
