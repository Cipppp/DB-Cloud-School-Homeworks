package com.example.unittestinghomework.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

import static javax.persistence.FetchType.EAGER;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String username;
    private String password;

    @ManyToMany(fetch = EAGER)
    private Collection<Role> roles = new ArrayList<>();


//    private Integer numberOfOrders;

//    @ManyToOne
//    private Cart cart;
//
//    @OneToOne
//    private Wishlist wishlist;
//
//    @ManyToOne
//    private OrderHistory orderHistory;

//    public Integer getNumberOfOrders() {
//        return numberOfOrders;
//    }

}
