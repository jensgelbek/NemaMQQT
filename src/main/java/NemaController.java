public class NemaController {

    public void turn_left(){
        Mqqt_Publisher.mqqtNemaPublisher("turn left");
    }
    public void turn_right(){
        Mqqt_Publisher.mqqtNemaPublisher("turn right");
    }
    public static void main(){
        NemaController nc=new NemaController();
        nc.turn_left();
        nc.turn_right();
    }

}
