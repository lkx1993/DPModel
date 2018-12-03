package com.company.z_my_diy_status_machine.section2;

import com.company.z_my_diy_status_machine.section2.state.PlayerState;

/**
 * Created by liukx on 2018-12-03.
 */
public abstract class IPlayer {

    public abstract void request(int action);
    public abstract void setState(PlayerState state);

    public abstract void playVideo();
    public abstract void pause();
    public abstract void stop();
    public abstract void showAD();

}
