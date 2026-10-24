public class Issue53_CinemaTicketSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {4, 7, 6, 116};
        int target = 116;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
