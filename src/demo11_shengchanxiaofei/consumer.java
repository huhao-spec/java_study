package demo11_shengchanxiaofei;

import java.util.concurrent.TimeUnit;

public class consumer {
    private rongqi rongqi;

    public consumer(rongqi rongqi) {
        this.rongqi = rongqi;
    }
    public synchronized void consume(){
        for(int i = 0;i<30;i++){
            this.rongqi.pop();

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
