package com.loongzee.cms.rpc;

/**
 * @program: upms-demo
 * @description: 服务启动类
 * @author: Loongzee
 * @create: 2019-04-15 16:42
 */
public class CmsRpcMain {
    public static void main(String[] args) {
        args = new String[] {"spring", "myjetty"};
        com.alibaba.dubbo.container.Main.main(args);
    }

}
