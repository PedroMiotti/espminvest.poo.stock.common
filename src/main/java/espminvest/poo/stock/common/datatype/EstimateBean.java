package espminvest.poo.stock.common.datatype;

import java.util.Date;

public class EstimateBean {
    private int id;
    private StockBean stock;
    private Double value;
    private Date date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public StockBean getStock() {
        return stock;
    }

    public void setStock(StockBean stock) {
        this.stock = stock;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
