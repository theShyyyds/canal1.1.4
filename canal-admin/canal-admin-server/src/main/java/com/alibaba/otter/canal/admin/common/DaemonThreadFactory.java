package com.alibaba.otter.canal.admin.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class DaemonThreadFactory implements ThreadFactory {

    public static final ThreadFactory daemonThreadFactory = new DaemonThreadFactory();
    //test
    public Thread newThread(Runnable r) {
        Thread t = Executors.defaultThreadFactory().newThread(r);
        t.setDaemon(true);
        return t;
    }
}
