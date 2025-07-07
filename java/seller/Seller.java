package seller;

public class Seller {
    private String sellerId;
    private String name;
    private String email;
    private SellerStatus status;

    public Seller(String sellerId, String name, String email) {
        this.sellerId = sellerId;
        this.name = name;
        this.email = email;
        this.status = SellerStatus.ACTIVE; // Default status
    }

    public String getSellerId() {
        return sellerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public SellerStatus getStatus() {
        return status;
    }

    public void setStatus(SellerStatus status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "sellerId='" + sellerId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                '}';
    }
}