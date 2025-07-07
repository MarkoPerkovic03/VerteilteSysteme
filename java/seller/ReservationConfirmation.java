package seller;

public class ReservationConfirmation {
    private String reservationId;
    private String message;

    public ReservationConfirmation(String reservationId, String message) {
        this.reservationId = reservationId;
        this.message = message;
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getMessage() {
        return message;
    }
}