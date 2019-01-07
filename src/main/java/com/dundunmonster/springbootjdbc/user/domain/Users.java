/*
* 文件名: com.dundunmonster.springbootjdbc.User.domain
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
package com.dundunmonster.springbootjdbc.user.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @author ghaoxiang
 * @version V1.0
 * @Title Users
 * @Description
 * @date 2019年01月07日 10:15
 * @since V1.0
 */
@ApiModel(value = "用户实体信息类",description = "用户实体信息类")
public class Users {

    @ApiModelProperty(value = "用户ID",required = true,name = "userId",dataType = "String",readOnly =true)
    private String userId;
    @ApiModelProperty(value = "用户账户名",name = "account",required = true,dataType = "String",readOnly = true)
    private String account;
    @ApiModelProperty(value = "用户姓名",name="name",required = true,dataType = "String",readOnly = true)
    private String name;
    @ApiModelProperty(value = "密码",name="password",required = true,dataType = "String",readOnly = true)
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Users() {
    }

    public Users(String userId, String account, String name, String password) {
        this.userId = userId;
        this.account = account;
        this.name = name;
        this.password = password;
    }
}
