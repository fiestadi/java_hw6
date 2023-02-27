package task3;

public class Shop {
    public static void main(String[] args) {
        boolean isEdekaOpen = true;
        Boolean isReweOpen = false;
        Boolean canBuy = isEdekaOpen || isReweOpen;
String canBuysms = "Я могу купить еду, это " + canBuy;

     System.out.println(canBuysms);

        }
    }
