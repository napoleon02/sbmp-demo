package com.werlini.sbmp.service;

import com.baomidou.mybatisplus.service.IService;
import com.werlini.sbmp.model.Person;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author werlini
 * @since 2018-05-27
 */
public interface IPersonService extends IService<Person> {

    Person getWerlini(String name);
}
