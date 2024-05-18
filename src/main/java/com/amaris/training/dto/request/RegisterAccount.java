//package com.amaris.training.dto.request;
//
//import lombok.*;
//
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//
//
//@Data
//@NoArgsConstructor
//public class RegisterAccount {
//    @NotBlank(message = "fullName is mandatory")
//    @NotNull(message = "FullName is not null")
//    private String firstName;
//    @NotBlank(message = "fullName is mandatory")
//    @NotNull(message = "FullName is not null")
//    private String lastName;
//    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",
//            message ="alice@example.com")
//    private String email;
//    private String password;
//    @Pattern(regexp = "(0[3|5|7|8|9])+([0-9]{8})\\b",
//            message = "84 or 0 +[3,5,7,8,9] " +
//                    "anything, at least eight places though")
//    private String phone;
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getPhone() {
//        return phone;
//    }
//
//    public void setPhone(String phone) {
//        this.phone = phone;
//    }
//}
