package com.loongzee.upms.rpc;

/**
 * @program: upms-demo
 * @description: dubbo服务启动
 * @author: Loongzee
 * @create: 2019-04-08 09:56
 */
public class UmpsRpcMain {

    public static void main(String[] args) {
        args = new String[] {"spring", "myjetty"};
        com.alibaba.dubbo.container.Main.main(args);
    }
}
