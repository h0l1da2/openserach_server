//package me.holiday.service.domain;
//
//import jakarta.persistence.*;
//import lombok.AccessLevel;
//import lombok.AllArgsConstructor;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Getter
//@Entity
//@AllArgsConstructor
//@NoArgsConstructor(access = AccessLevel.PROTECTED)
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String username;
//    private String password;
//
//    @Enumerated(EnumType.STRING)
//    private RoleName role;
//    private String name;
//    private String phoneNumber;
//
//    private LocalDateTime createdAt;
//
//}
//
