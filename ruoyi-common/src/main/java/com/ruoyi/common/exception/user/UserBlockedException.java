package com.ruoyi.common.exception.user;

/**
 * 用户锁定异常类
 * 
 * @author 1829003685@qq.com
 */
public class UserBlockedException extends UserException
{
    private static final long serialVersionUID = 1L;

    public UserBlockedException()
    {
        super("user.blocked", null);
    }
}
