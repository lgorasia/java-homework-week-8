package methodoverrifing24;

class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        ICICI i = new ICICI();
        AXIS a = new AXIS();
        System.out.println("SBI rate of Interest:" + s.getRateOfInterest());
        System.out.println("ICICI rate of Interst:" + i.getRateOfInterest());
        System.out.println("Axis rate of Interest:" + a.getRateOfInterest());
    }
}
