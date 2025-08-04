package com.next.app.api.user.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "business_wkd2000")
public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String businessNumber; // 사업자번호

    @Column(nullable = false)
    private String name; // 사업자명

    @Column(nullable = false)
    private String ceoName; // 대표자명

    @Column
    private String address; // 주소

    public Business() {}

    public Business(String businessNumber, String name, String ceoName, String address) {
        this.businessNumber = businessNumber;
        this.name = name;
        this.ceoName = ceoName;
        this.address = address;
    }

    public Long getId() { return id; }
    public String getBusinessNumber() { return businessNumber; }
    public void setBusinessNumber(String businessNumber) { this.businessNumber = businessNumber; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getCeoName() { return ceoName; }
    public void setCeoName(String ceoName) { this.ceoName = ceoName; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
}

