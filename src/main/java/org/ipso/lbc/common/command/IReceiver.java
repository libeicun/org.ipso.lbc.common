package org.ipso.lbc.common.command;

/**
 * 信息：李倍存 创建于 2016/01/27 20:32。电邮 1174751315@qq.com。<br>
 * 说明：
 */
public interface IReceiver {
     Object  action(Object params);
     Object info();
    Object[]         getParams();
}
