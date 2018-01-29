package com.ooteco.lock;

public class CapitalPoolLocker {

    private volatile static boolean isReady = Boolean.TRUE;
    public static byte[] lock = new byte[0];

    public static boolean getLock(){
        synchronized(lock){
            if(!isReady) return false;
            isReady = false;
            return true;
        }
    }

    public static void releaseLock(){
        isReady = true;
    }
}
