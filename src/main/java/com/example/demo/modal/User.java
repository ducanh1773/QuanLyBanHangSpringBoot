package com.example.demo.modal;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {
        @Id
        @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        public Long id;
        @Column(name = "username")
        public String userName;
        @Column(name = "password")
        public String passWord;
        @Column(name = "enabled")
        public Boolean enabled;
        @Column(name = "fullname")
        public String fullName;
        @Column(name = "gender")
        public Boolean gender;
        @Column(name = "address")
        public String address;
        @Column(name = "email")
        public String email;
        @Column(name = "telephone")
        public String telephone;
        @OneToMany(mappedBy = "user", fetch = FetchType.EAGER)
        private Set<User_Role> userRoles;
        public User() {
                super();
        }

        public User(Long id, String userName, String passWord, Boolean enabled, String fullName, Boolean gender, String address, String email, String telephone, Set<User_Role> userRoles) {
                this.id = id;
                this.userName = userName;
                this.passWord = passWord;
                this.enabled = enabled;
                this.fullName = fullName;
                this.gender = gender;
                this.address = address;
                this.email = email;
                this.telephone = telephone;
                this.userRoles = userRoles;
        }

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getUserName() {
                return userName;
        }

        public void setUserName(String userName) {
                this.userName = userName;
        }

        public String getPassWord() {
                return passWord;
        }

        public void setPassWord(String passWord) {
                this.passWord = passWord;
        }

        public Boolean getEnabled() {
                return enabled;
        }

        public void setEnabled(Boolean enabled) {
                this.enabled = enabled;
        }

        public String getFullName() {
                return fullName;
        }

        public void setFullName(String fullName) {
                this.fullName = fullName;
        }

        public Boolean getGender() {
                return gender;
        }

        public void setGender(Boolean gender) {
                this.gender = gender;
        }

        public String getAddress() {
                return address;
        }

        public void setAddress(String address) {
                this.address = address;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getTelephone() {
                return telephone;
        }

        public void setTelephone(String telephone) {
                this.telephone = telephone;
        }

        public Set<User_Role> getUserRoles() {
                return userRoles;
        }

        public void setUserRoles(Set<User_Role> userRoles) {
                this.userRoles = userRoles;
        }
}
