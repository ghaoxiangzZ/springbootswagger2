/*
* 文件名: com.dundunmonster.springbootjdbc.user.controller
* 文件编号: 
* 版权: Copyright (c) 2019, YAN Co.Ltd. and/or its affiliates. All rights reserved.Use is subject to license terms.
* 描述: 
* 创建人: ghaoxiang
* 创建时间: 2019年01月07日 10:08
* 修改人:
* 修改时间: 2019年01月07日 10:08
* 修改变更号:
* 修改内容:
*/
package com.dundunmonster.springbootjdbc.cus.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dundunmonster.springbootjdbc.cus.domain.Customer;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title CusController
 * @Description
 * @date 2019年01月07日 10:08
 * @since V1.0
 */
@RestController
@RequestMapping(value = "/cus")
@Api(value = "客户服务接口", description = "提供对客户操作服务接口（增、删、改、查）用户信息")
public class CusController {
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("1","G00001","中科软","sinosoft","深圳市罗湖区爵士大厦"));
        customerList.add(new Customer("2","G00002","易安财险","1an","深圳市保税区长富金融中心"));
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ApiOperation(value = "获取所有客户信息", notes = "获取当前所有有效客户信息")
    public List<Customer> getAllCustomer(){
        return customerList;
    }

    @RequestMapping(value = "/get/{cusId}", method = RequestMethod.GET)
    @ApiOperation(value = "根据客户ID获取客户信息", notes = "根据客户ID获取客户信息")
    @ApiImplicitParam(paramType = "path", name = "cusId", required = true, value = "客户ID", dataType = "string")
    public Customer getCusById(@PathVariable("cusId") String cusId){
        for (Customer customer : customerList){
            if (cusId.equals(customer.getCusId())) {
                return customer;
            }
        }
        return null;
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ApiOperation(value = "保存客户信息", notes = "保存客户信息", httpMethod = "POST")
    public List<Customer> saveCus(@ApiParam(name = "customer",required = true, type = "object", value = "客户信息")Customer customer){
        customerList.add(customer);
        return customerList;
    }

    @RequestMapping(value = "/del/{cusId}",method = RequestMethod.DELETE)
    @ApiOperation(value = "刪除客戶信息", notes = "根据客户ID删除客户信息")
    @ApiImplicitParam(value = "客户ID", name = "cusId", paramType = "path", required = true, dataType = "String")
    public List<Customer>  deleteCus(@PathVariable("cusId") String cusId){
        Iterator<Customer> it = customerList.iterator();
        while (it.hasNext()) {
            Customer cus = it.next();
            if (cusId.equals(cus.getCusId())) {
                it.remove();
            }
        }
        return customerList;
    }
}
