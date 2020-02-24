package com.webank.ai.fate.serving.core.async;

import com.webank.ai.fate.serving.core.bean.Dict;
import com.webank.ai.fate.serving.core.disruptor.AsyncMessageEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AsyncMessageProcessor {
    Logger logger =  LoggerFactory.getLogger(AsyncMessageProcessor.class);

    private static AsyncMessageProcessor instance = null;

    public static AsyncMessageProcessor getInstance() {
        if (instance == null) {
            instance = new AsyncMessageProcessor();
        }
        return instance;
    }

    @Subscribe(name = Dict.EVENT_INFERENCE)
    public void processInferenceEvent(AsyncMessageEvent event) {
        // TODO: 2020/2/13
        logger.info("Thread " + Thread.currentThread().getName() + ", processInferenceEvent..");
    }

    @Subscribe(name = Dict.EVENT_INFERENCE)
    public void processInferenceEvent2(AsyncMessageEvent event) {
        // TODO: 2020/2/13
        logger.info("Thread " + Thread.currentThread().getName() + ", processInferenceEvent2..");
    }

    @Subscribe(name = Dict.EVENT_UNARYCALL)
    public void processUnarycallEvent(AsyncMessageEvent event) {
        // TODO: 2020/2/13
        logger.info("Thread " + Thread.currentThread().getName() + ", processUnarycallEvent..");
    }

}
