package mybtrade;

import java.util.Date;

public class PurchaseCanceled extends AbstractEvent {

    private Long id;
    private Long salesNum;
    private String status;
    private Date cancelDate = new Date();

    public PurchaseCanceled(){
        super();
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalesNum() {
        return salesNum;
    }
    public void setSalesNum(Long salesNum) {
        this.salesNum = salesNum;
    }

    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCancelDate() {
        return cancelDate;
    }
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }
}
