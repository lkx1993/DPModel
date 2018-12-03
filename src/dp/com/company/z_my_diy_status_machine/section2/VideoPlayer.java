package com.company.z_my_diy_status_machine.section2;

import com.company.z_my_diy_status_machine.section2.state.PlayerState;
import com.company.z_my_diy_status_machine.section2.state.StoppedState;

/**
 * Created by liukx on 2018-12-03.
 */
public class VideoPlayer extends IPlayer {

    //todo 这里两个类之间有循环引用,待处理
    private PlayerState curState = new StoppedState(this);

    public void request(int action) {
        System.out.println("before action:"+ curState.toString());
        curState.handle(action);
        System.out.println("after action:"+ curState.toString());
    }

    public void setState(PlayerState state) {
        curState = state;
    }

    public void playVideo() {
        System.out.println("i am playing video!");
    }

    public void pause() {
        System.out.println("i am pausing video!");
    }

    public void stop() {
        System.out.println("i am stopping video!");
    }

    public void showAD() {

    }
}
