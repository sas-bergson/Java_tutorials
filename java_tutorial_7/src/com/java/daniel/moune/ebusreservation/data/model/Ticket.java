package com.java.daniel.moune.ebusreservation.data.model;

import java.util.Date;

public class Ticket {
    private Date date;
    private TYPE type;
    private String customer_name;
    private int customer_phone_number;

    /**
     * Constructor of the class
     *
     * @param date                  the date of the ticket
     * @param type                  the type of ticket
     * @param customer_name         the name of the customer who bought the ticket
     * @param customer_phone_number the phone number of the customer who bought the ticket
     */
    public Ticket(Date date, TYPE type, String customer_name, int customer_phone_number) {
        this.date = date;
        this.type = type;
        this.customer_name = customer_name;
        this.customer_phone_number = customer_phone_number;
    }

    /**
     * returns the date at which the ticket was bought
     *
     * @return The {@link Date} of the ticket
     */
    public Date getDate() {
        return date;
    }

    /**
     * changes the date of the ticket and applies a new date
     *
     * @param date The {@link Date} to apply to the ticket
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * returns the TYPE of ticket (STUDENT, STAFF, ADMIN, GUEST)
     *
     * @return the {@link TYPE} of ticket
     */
    public TYPE getType() {
        return type;
    }

    /**
     * changes the TYPE of the ticket
     *
     * @param type the {@link TYPE} to apply to the ticket
     */
    public void setType(TYPE type) {
        this.type = type;
    }

    /**
     * returns the name of the customer who bought the ticket
     *
     * @return the name:{@link String} of the customer
     */
    public String getCustomer_name() {
        return customer_name;
    }

    /**
     * changes the name of the customer
     *
     * @param customer_name the new name:{@link String} to apply as customer's name
     */
    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    /**
     * returns the phone number of the customer who bought the ticket
     *
     * @return the phone number: {@link Integer} of the customer
     */
    public Integer getCustomer_phone_number() {
        return customer_phone_number;
    }

    /**
     * changes the phone number of the customer who bought the ticket
     *
     * @param customer_phone_number the new phone number: {@link Integer} of the customer
     */
    public void setCustomer_phone_number(Integer customer_phone_number) {
        this.customer_phone_number = customer_phone_number;
    }

    public static TYPE _type(String str_type){
        if (str_type.equalsIgnoreCase("STUDENT")) return TYPE.STUDENT;
        else  if (str_type.equalsIgnoreCase("STAFF")) return TYPE.STAFF;
        else  if (str_type.equalsIgnoreCase("ADMIN")) return TYPE.ADMIN;
        return TYPE.STUDENT;
    }

    /**
     * returns a string having details about all the records of the ticket
     * @return a {@String} representation of the Ticket
     */
    @Override
    public String toString() {
        return "Ticket{" +
                "\ndate=" + date +
                ",\ntype=" + type +
                ",\ncustomer_name='" + customer_name + '\'' +
                ",\ncustomer_phone_number=" + customer_phone_number +
                '}';
    }

    /*There are 04 types of tickets*/
    public enum TYPE {
        STUDENT,
        STAFF,
        ADMIN,
        GUEST,
        HANDICAP
    }
}
