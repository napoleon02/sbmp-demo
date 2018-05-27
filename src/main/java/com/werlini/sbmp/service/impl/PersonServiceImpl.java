package com.werlini.sbmp.service.impl;

import com.werlini.sbmp.model.Person;
import com.werlini.sbmp.mapper.PersonMapper;
import com.werlini.sbmp.service.IPersonService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author werlini
 * @since 2018-05-27
 */
@Service
public class PersonServiceImpl extends ServiceImpl<PersonMapper, Person> implements IPersonService {

    @Resource
    private PersonMapper personMapper;

    @Override
    public Person getWerlini(String name) {
        Person person = personMapper.getWerlini(name);
        return person;
    }
}
