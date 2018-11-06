package com.szxs.dao;

import com.szxs.entity.CarResever;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CarReseverDao {

    /**
     * 查询全部
     * @return
     */
    List<CarResever> queryCarResever(@Param("offset") int offset, @Param("pageSize") int pageSize,@Param("a") Integer a, @Param("b") String b);
    int updateCarResever (int id);
    /**
     * 总行数
     */
    int selectCarReseverRows (@Param("a") Integer a, @Param("b") String b);
}
