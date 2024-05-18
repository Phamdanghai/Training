package com.amaris.training.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class AccountRequest {
    private String account_id;
    private String user_id;
    private String user_desc;
    private String password;
    private String email_address;
    private String mobile_phone_no;
    private int pwd_fail_count;
    private String default_tenant_code;
    private String default_name_tenant_code;
    private String user_cmf_1;
    private String user_cmf_2;
    private String user_cmf_3;
    private String user_cmf_4;
    private String user_cmf_5;
    private String user_cmf_6;
    private String create_user_id;
    private String update_user_id;
    private int default_photo_flag;
    private LocalDateTime update_time ;
    private LocalDateTime create_time;

    public AccountRequest(String account_id, String user_id, String user_desc, String password, String email_address, String mobile_phone_no, int pwd_fail_count, String default_tenant_code, String default_name_tenant_code, String user_cmf_1, String user_cmf_2, String user_cmf_3, String user_cmf_4, String user_cmf_5, String user_cmf_6, String create_user_id, String update_user_id, int default_photo_flag, LocalDateTime update_time, LocalDateTime create_time) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.user_desc = user_desc;
        this.password = password;
        this.email_address = email_address;
        this.mobile_phone_no = mobile_phone_no;
        this.pwd_fail_count = pwd_fail_count;
        this.default_tenant_code = default_tenant_code;
        this.default_name_tenant_code = default_name_tenant_code;
        this.user_cmf_1 = user_cmf_1;
        this.user_cmf_2 = user_cmf_2;
        this.user_cmf_3 = user_cmf_3;
        this.user_cmf_4 = user_cmf_4;
        this.user_cmf_5 = user_cmf_5;
        this.user_cmf_6 = user_cmf_6;
        this.create_user_id = create_user_id;
        this.update_user_id = update_user_id;
        this.default_photo_flag = default_photo_flag;
        this.update_time = update_time;
        this.create_time = create_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_desc() {
        return user_desc;
    }

    public void setUser_desc(String user_desc) {
        this.user_desc = user_desc;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPwd_fail_count() {
        return pwd_fail_count;
    }

    public void setPwd_fail_count(int pwd_fail_count) {
        this.pwd_fail_count = pwd_fail_count;
    }

    public String getDefault_tenant_code() {
        return default_tenant_code;
    }

    public void setDefault_tenant_code(String default_tenant_code) {
        this.default_tenant_code = default_tenant_code;
    }

    public String getDefault_name_tenant_code() {
        return default_name_tenant_code;
    }

    public void setDefault_name_tenant_code(String default_name_tenant_code) {
        this.default_name_tenant_code = default_name_tenant_code;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public String getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(String update_user_id) {
        this.update_user_id = update_user_id;
    }

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public String getMobile_phone_no() {
        return mobile_phone_no;
    }

    public void setMobile_phone_no(String mobile_phone_no) {
        this.mobile_phone_no = mobile_phone_no;
    }

    public String getUser_cmf_1() {
        return user_cmf_1;
    }

    public void setUser_cmf_1(String user_cmf_1) {
        this.user_cmf_1 = user_cmf_1;
    }

    public String getUser_cmf_2() {
        return user_cmf_2;
    }

    public void setUser_cmf_2(String user_cmf_2) {
        this.user_cmf_2 = user_cmf_2;
    }

    public String getUser_cmf_3() {
        return user_cmf_3;
    }

    public void setUser_cmf_3(String user_cmf_3) {
        this.user_cmf_3 = user_cmf_3;
    }

    public String getUser_cmf_4() {
        return user_cmf_4;
    }

    public void setUser_cmf_4(String user_cmf_4) {
        this.user_cmf_4 = user_cmf_4;
    }

    public String getUser_cmf_5() {
        return user_cmf_5;
    }

    public void setUser_cmf_5(String user_cmf_5) {
        this.user_cmf_5 = user_cmf_5;
    }

    public String getUser_cmf_6() {
        return user_cmf_6;
    }

    public void setUser_cmf_6(String user_cmf_6) {
        this.user_cmf_6 = user_cmf_6;
    }

    public int getDefault_photo_flag() {
        return default_photo_flag;
    }

    public void setDefault_photo_flag(int default_photo_flag) {
        this.default_photo_flag = default_photo_flag;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }
}
