package com.werlini.sbmp.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.werlini.sbmp.model.Person;
import com.werlini.sbmp.model.ResultWrapper;
import com.werlini.sbmp.service.IPersonService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author werlini
 * @since 2018-05-27
 */
@Api(description = "测试demo", tags = "测试demo")
@Controller
@RequestMapping(value = "person")
public class PersonController extends BaseController{

    @Resource
    private IPersonService iPersonService;

    @GetMapping(value = "getOne")
    @ResponseBody
    public Object getOne(){
//        Person person = iPersonService.selectById(1);
        return new Person().selectOne(new EntityWrapper().eq("name", "napoleon"));
    }

    @GetMapping(value = "getList")
    @ResponseBody
    public Object getList(){
        List<Person> people = iPersonService.selectList(new EntityWrapper<>());
        return people;
    }

    @GetMapping(value = "getperson/{name}")
    @ResponseBody
    public Object getperson(@PathVariable(value = "name") String name){
        Person person = iPersonService.getWerlini(name);
        return person;
    }

    @GetMapping(value = "listPage")
    @ResponseBody
    @ApiOperation(value = "分页/查询")
    public Object listPage(@ApiParam(value = "每页记录数", required = true) @RequestParam(value = "pageSize") Integer pageSize,
                           @ApiParam(value = "当前页", required = true) @RequestParam(value = "pageNum") Integer pageNum,
                           @ApiParam(value = "查询条件") @RequestParam(value = "name", required = false) String name){
        Page<Person> page = new Page<>(pageNum, pageSize);
        EntityWrapper<Person> wrapper = new EntityWrapper<>();
        wrapper.like("name", name);
        Page<Person> list = iPersonService.selectPage(page, wrapper);
        return ResultWrapper.result(200, "success", list.getRecords());
    }

}

