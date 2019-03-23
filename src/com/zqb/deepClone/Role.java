package com.zqb.deepClone;

import java.io.Serializable;

/**
 * Created by zqb on 2019/3/23.
 */
public class Role  implements Serializable {

    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
