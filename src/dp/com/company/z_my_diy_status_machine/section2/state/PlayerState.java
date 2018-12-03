package com.company.z_my_diy_status_machine.section2.state;

import com.company.z_my_diy_status_machine.section2.IPlayer;

/**
 * Created by liukx on 2018-12-03.
 */
public abstract class PlayerState {

    public final static int PLAY_OR_PAUSE = 0;
    public final static int STOP = 1;

    protected IPlayer iPlayer;

    public PlayerState(IPlayer iPlayer) {
        this.iPlayer = iPlayer;
    }

    public abstract void handle(int action);

    @Override
    public String toString() {
        return "current state:------"+this.getClass().getSimpleName();
    }
}
