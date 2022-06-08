package ReplitTasks.OOP;

import java.util.Scanner;

public class TV_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV tv = new TV();
        System.out.println(tv.getVolumeLevel());
        tv.turnOff();
        tv.setChannel(in.nextInt());

        TV tv2 = new TV(in.next());
        tv2.turnOn();
        tv2.turnOn();
        tv2.setChannel(in.nextInt());
        tv2.setChannel(in.nextInt());
        tv2.setVolumeLevel(in.nextInt());
        tv2.volumeUp();

        in.close();
    }

    public static class TV{
        private int channel=1;
        private int volumeLevel=0;
       private boolean on =false;
      private   String brand= "undefined";


        public TV(){
            System.out.println("creating TV object using no args-constructor");
        }
        public TV(String brand){
            this.brand=brand;
            System.out.println("creating TV object using 1 arg -constructor");
        }

        public int getChannel() {
            return channel;
        }

        public void setChannel(int channel) {

            if((channel<0 ||channel==0 || channel>120) || isOn()==false){
                System.out.println("ERROR: TV is either OFF or invalid Channel");
            }else {
                this.channel = channel;
            }
        }

        public int getVolumeLevel() {
            return volumeLevel;
        }

        public void setVolumeLevel(int volumeLevel) {
            if(isOn()==true && (volumeLevel>0 && volumeLevel<7)){
                this.volumeLevel = volumeLevel;
            }else{
                System.out.println("ERROR: TV is either OFF or invalid Volume level");
            }
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public void volumeUp(){
            this.volumeLevel +=1;
        }
        public void volumeDown(){
            this.volumeLevel -=1;
        }

        public boolean isOn() {
            return on;
        }

        public void turnOn(){
            if(isOn()==true){
                System.out.println("TV is already ON");
            }else{
                this.on=true;
            }
        }

        public void turnOff(){
            if(isOn()==false){
                System.out.println("TV is already OFF");
            }else{
                this.on=false;
            }
        }

        @Override
        public String toString() {
            return "TV{" +
                    "channel=" + channel +
                    ", volumeLevel=" + volumeLevel +
                    ", on=" + on +
                    ", brand='" + brand + '\'' +
                    '}';
        }
    }



}
