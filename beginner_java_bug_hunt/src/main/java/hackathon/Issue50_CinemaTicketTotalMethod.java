public class Issue50_CinemaTicketTotalMethod {
    public static void main(String[] args) {
        int unitFee = 40;
        int quantity = 7;
        int discountPercent = 30;
        int subtotal = unitFee + quantity;
        int discount = subtotal * discountPercent;
        int total = subtotal + discount;
        System.out.println("Total=" + total);
    }
}
