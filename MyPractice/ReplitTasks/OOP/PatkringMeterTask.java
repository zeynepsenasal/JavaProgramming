package ReplitTasks.OOP;

import java.util.Scanner;

public class PatkringMeterTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingMeter pm = new ParkingMeter(in.nextInt());
        pm.add(in.nextInt());
        pm.tick();
        System.out.println(pm.timeLeft);
        System.out.println(pm.isExpired());
in.close();
    }
    public static class ParkingMeter{
        private int timeLeft=0;
        private int maxTime;

        public ParkingMeter(int maxTime) {
            this.maxTime = maxTime;
        }

        public boolean add(int a){
            if(timeLeft<=maxTime){
                if(a==25){
                    timeLeft +=30;
                    return true;
                }else{
                    return false;
                }
            }else{
                return false;
            }

        }

        public void tick(){
            if(timeLeft>0){
                timeLeft -=1;
            }
        }

        public boolean isExpired(){
            if(timeLeft==0){
                return true;
            }else{
                return false;
            }
        }

    }
}

