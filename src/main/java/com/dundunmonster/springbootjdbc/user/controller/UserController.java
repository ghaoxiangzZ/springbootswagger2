/*
* 文件名: com.dundunmonster.springbootjdbc.User.controller
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月07日 10:15
* 修改人:
* 修改时间: 2019年01月07日 10:15
* 修改变更号: 
* 修改内容: 
*/
package com.dundunmonster.springbootjdbc.user.controller;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dundunmonster.springbootjdbc.user.domain.Users;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title UserController
 * @Description
 * @date 2019年01月07日 10:15
 * @since V1.0
 */
@RestController
@RequestMapping(value = "/user")
@Api(value = "用户服务接口",description = "提供对客户操作服务接口（增、删、改、查）用户信息")
public class UserController {
    private static List<Users> usersList=new ArrayList<>();

    static {
        usersList.add(new Users("1","ghaoxiang","ghaoxiang","ghaoxiang"));
        usersList.add(new Users("2","fanying","fanying","fanying"));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation(value = "获取所有用户信息", notes = "获取所有有效用户信息")
    public List<Users> getAllUser(){
        return usersList;
    }
}
