/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;

import javax.persistence.*;

/**
 *
 * @author Bryan
 */
@Entity
@Table
public class Subscriber {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "subscriberKey")
    private int subscriberKey;
    
    @Column(name = "subscriberLastName")
    private String lastName;
    
    @Column(name = "subscriberFirstName")
    private String firstName;
    
    @Column(name = "subscriberCity")
    private String city;

    public int getSubscriberKey() {
        return subscriberKey;
    }

    public void setSubscriberKey(int subscriberKey) {
        this.subscriberKey = subscriberKey;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    
    @Override
    public String toString() {
        return Integer.toString(subscriberKey) + " " + firstName + " " + lastName + " " + city + ".";
    }
    
}
