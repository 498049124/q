package com.szxs.service;

import com.szxs.entity.CarResever;
import com.szxs.entity.Pager;

public interface CarReseverService {

    /**
     * 查询全部
     * @return
     */
    Pager<CarResever> queryCarResever(int pageNo, int pageSize, Integer a, String b);
    int updateCarResever (int id);
    /**
     * 总行数
     */
    int selectCarReseverRows (Integer a,  String b);
}
