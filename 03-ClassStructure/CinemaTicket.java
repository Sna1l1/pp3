public class CinemaTicket {
    static String cinemaName = "Cinema City";
        static String filmTitle = "Gone with the wind";

        public CinemaTicket(int row, int seat, double price) {
            this.row = row; // Set the initial value for the class attribute x
            this.seat = seat;
            this.price = price;
        }

        public String toString() {
            return "Cinema name: " + cinemaName + "\nfilmTitle: " + filmTitle + "\nRow number: " + this.row + "\nSeat number: " + this.seat + "\nPrice of the ticket: " + this.price;
        }

        int row;
        int seat;
        double price;
}
