package com.company.z_my_diy_status_machine.section1;

/**
 * 状态机
 * Created by liukx on 2018-12-03.
 */
public interface IPlayer {

    final int STATE_PLAYING = 1;
    final int STATE_PAUSED = 2;
    final int STATE_STOPPED = 3;

    void playVideo();
    void pause();
    void stop();

    //我们都知道，需求总是会改变的，现在你的boss需要在视频播放中（片头或者片尾什么的）
    // 可以播放一段广告。嗯，你可能会觉得没关系，只需要在接口上增加多一个方法就好了，
    // 同时增加个状态字段，
   // 真的就完了？终于发现了，palyVedio，pause，stop三个方法中的swtich里面
    // 还需要各多加一个case的判断，纳尼！！！
    // 如果以后又增加几个状态，那么还得修改啊，而且随着状态的增加，
    // 修改的代码也会成倍的增加，简直不可想象。这种情况下，状态机模式就可以帮你个大忙了。
    //请看section2
//    void showAD();


}
