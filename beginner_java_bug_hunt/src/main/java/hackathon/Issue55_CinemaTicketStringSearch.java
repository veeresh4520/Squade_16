public class Issue55_CinemaTicketStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A16", "B16", "C16"};
        String target = new String("B16");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
