public class ReservationRecord {
    private String reservationId;
    private String productId;
    private String sellerId;
    private String buyerId;
    private int quantity;
    private String status;

    public ReservationRecord(String reservationId, String productId, String sellerId, String buyerId, int quantity) {
        this.reservationId = reservationId;
        this.productId = productId;
        this.sellerId = sellerId;
        this.buyerId = buyerId;
        this.quantity = quantity;
        this.status = "Pending"; // Default status
    }

    public String getReservationId() {
        return reservationId;
    }

    public String getProductId() {
        return productId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public void confirmReservation() {
        this.status = "Confirmed";
    }

    public void rejectReservation() {
        this.status = "Rejected";
    }

    @Override
    public String toString() {
        return "ReservationRecord{" +
                "reservationId='" + reservationId + '\'' +
                ", productId='" + productId + '\'' +
                ", sellerId='" + sellerId + '\'' +
                ", buyerId='" + buyerId + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}