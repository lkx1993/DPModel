package com.company.z_my_diy_status_machine.section2.state;

import com.company.z_my_diy_status_machine.section2.IPlayer;

/**
 * Created by liukx on 2018-12-03.
 */
public class PausedState extends PlayerState {
    public PausedState(IPlayer iPlayer) {
        super(iPlayer);
    }

    public void handle(int action) {
        switch (action) {
            case PlayingState.PLAY_OR_PAUSE:
                iPlayer.playVideo();
                iPlayer.setState(new PlayingState(iPlayer));
                break;
            case PlayerState.STOP:
                iPlayer.stop();
                iPlayer.setState(new StoppedState(iPlayer));
                break;
            default:
                throw new IllegalArgumentException("ERROE ACTION:" + action + ",current state:" + this.getClass().getSimpleName());
        }
    }
}
