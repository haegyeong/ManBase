package cn.jmpt.manbase.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016-03-26.
 * 线程管理者
 */
public class ThreadManger {
    //    线程池
    private static ExecutorService executor;

    //    单利
    private ThreadManger() {
    }

    public static ExecutorService getService() {
        if (executor == null) {
            executor = Executors.newFixedThreadPool(5);
        }
        return executor;
    }

    /**
     * 执行任务
     */
    public static void executRunnable(Runnable runnable) {
        executor.execute(runnable);
    }

}
