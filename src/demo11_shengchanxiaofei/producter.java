package demo11_shengchanxiaofei;

import java.util.concurrent.TimeUnit;

public class producter {
    private rongqi ronqi = null;
    public producter(rongqi rongqi){
        this.ronqi = rongqi;
    }
    public void product(){
        for (int i = 0;i<30;i++){

                Hanberger hanberger = new Hanberger(i);
                this.ronqi.push(hanberger);
                // 休眠
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

        }
    }
}
