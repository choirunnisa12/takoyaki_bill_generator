public class Takoyaki {

    private int price;
    private Boolean octopus;
    private int extraToppingsPrice = 3000;
    private int extraLevelPrice = 5000;
    private int boxPrice = 2000;

    private int octopusTakoyakiPrice;

    private boolean isExtraToppingsAdded = false;
    private boolean isExtraLevelAdded = false;
    private boolean isOptedForTakeway = false;

public Takoyaki (Boolean octopus) {
    this.octopus = octopus;
    if (this.octopus) {
        this.price = 35000;
    } else {
        this.price = 40000;
    }
    octopusTakoyakiPrice = this.price;
}
public void addExtraToppingsPrice(){
    isExtraToppingsAdded = true;
    this.price += extraToppingsPrice;
}
public void  addExtraLevelPrice(){
    isExtraLevelAdded = true;
    this.price += extraLevelPrice;

}
public void  takeaway(){
    isOptedForTakeway = true;
    this.price += boxPrice;
}
public void  getBill(){
    String bill = "";
    System.out.println("Takoyaki: "+octopusTakoyakiPrice);
    if (isExtraToppingsAdded){
        bill += "Extra toppings added: "+extraToppingsPrice+ "\n";
    }
    if (isExtraLevelAdded){
        bill += "Extra Level added: "+extraLevelPrice+ "\n";
    }
if (isOptedForTakeway) {
    bill += "Take away: " + boxPrice + "\n";
}
bill += "Bill: "+this.price + "\n";
    System.out.println(bill);}
}


