package com.company.z_my_diy_status_machine.section2.state;

import com.company.z_my_diy_status_machine.section2.IPlayer;

/**
 * Created by liukx on 2018-12-03.
 */
public class PlayingState extends PlayerState {


    public PlayingState(IPlayer iPlayer) {
        super(iPlayer);
    }

    public void handle(int action) {
        switch (action){
            case PLAY_OR_PAUSE:
                iPlayer.pause();
                iPlayer.setState(new PausedState(iPlayer));
                break;
            case STOP:
                iPlayer.stop();
                iPlayer.setState(new StoppedState(iPlayer));
                break;
            default:
                throw new IllegalArgumentException("error action:"+action);
        }
    }
}
