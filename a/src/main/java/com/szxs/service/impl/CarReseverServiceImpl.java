package com.szxs.service.impl;

import com.szxs.dao.CarReseverDao;
import com.szxs.entity.CarResever;
import com.szxs.entity.Pager;
import com.szxs.service.CarReseverService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class CarReseverServiceImpl implements CarReseverService {
    @Resource
    private CarReseverDao carReseverDao;

    public Pager<CarResever> queryCarResever(int pageNo,int pageSize,Integer a, String b) {
        Pager<CarResever> pager= new Pager<CarResever>();
        pager.setPageNo(pageNo);
        pager.setPageSize(pageSize);
        pager.setTotalRows(carReseverDao.selectCarReseverRows(a,b));
        pager.setTotalPage((pager.getTotalRows()+pageSize-1)/pageSize);
        pager.setDatas(carReseverDao.queryCarResever((pageNo-1)*pageSize,pageSize,a,b));
        return pager;
    }

    public int updateCarResever(int id) {
        carReseverDao.updateCarResever(id);
        return 1;
    }

    public int selectCarReseverRows(Integer a, String b) {
        return carReseverDao.selectCarReseverRows(a,b);
    }
}
