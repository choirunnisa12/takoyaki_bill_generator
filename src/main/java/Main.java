public class Main {
    public static void main(String[] args) {

        Takoyaki octopusTakoyaki = new Takoyaki(true);
        octopusTakoyaki.addExtraToppingsPrice();
        octopusTakoyaki.addExtraLevelPrice();
        octopusTakoyaki.takeaway();
        octopusTakoyaki.getBill();
    }
}
