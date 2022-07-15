/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class PCDesktop {
    
    private Long desktopId;
    private String desktopName;
    private Integer quantity;
    private BigDecimal price;
    private String chip;
    private Integer ram;

    public PCDesktop() {
    }

    public PCDesktop(Long desktopId, String desktopName, Integer quantity, BigDecimal price, String chip, Integer ram) {
        this.desktopId = desktopId;
        this.desktopName = desktopName;
        this.quantity = quantity;
        this.price = price;
        this.chip = chip;
        this.ram = ram;
    }

    public Long getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(Long desktopId) {
        this.desktopId = desktopId;
    }

    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "PCDesktop{" + "desktopId=" + desktopId + ", desktopName=" + desktopName + ", quantity=" + quantity + ", price=" + price + ", chip=" + chip + ", ram=" + ram + '}';
    }
    
    
}
