package com.company.z_my_diy_status_machine.section1;

/**
 * Created by liukx on 2018-12-03.
 */
public class VideoPlayer implements IPlayer {

    public int mCurrentState;

    public void playVideo() {
        switch (mCurrentState){
            case STATE_PLAYING:
                System.out.println("curent state is palying, do nothing.");
                break;
            case STATE_PAUSED:
            case STATE_STOPPED:
                System.out.println("paly vedio now.");
                break;
            default:
                break;
        }
        mCurrentState=STATE_PLAYING;
    }

    public void pause() {
        switch (mCurrentState){
            case STATE_PLAYING:
                System.out.println("pause vedio now");
                break;
            case STATE_PAUSED:
                System.out.println("curent state is paused, do noting.");
            case STATE_STOPPED:
                System.out.println("curent state is paused, do noting.(react:STATE_STOPPED)");
                break;
            default:
                break;
        }
        mCurrentState=STATE_PAUSED;
    }

    public void stop() {
        switch (mCurrentState){
            case STATE_PLAYING:
            case STATE_PAUSED:
                System.out.println("stop vedio now");
            case STATE_STOPPED:
                System.out.println("curent state is stopped.");
                break;
            default:
                break;
        }
        mCurrentState=STATE_STOPPED;
    }
}
