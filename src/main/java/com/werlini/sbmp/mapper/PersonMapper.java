package com.werlini.sbmp.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.werlini.sbmp.model.Person;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author werlini
 * @since 2018-05-27
 */
public interface PersonMapper extends BaseMapper<Person> {

    Person getWerlini(@Param(value = "name") String name);

}
