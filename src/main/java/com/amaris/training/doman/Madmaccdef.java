package com.amaris.training.doman;

import lombok.*;
import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "madmaccdef")
public class Madmaccdef  {
    @Id
    private String account_id;

    private String user_id;
    private String user_desc;
    private String password;
    private String old_password;
    private String default_tenant_code;
    private String default_lang_code;
    private int pwd_fail_count;
    private LocalDateTime pwd_expire_time;
    private String valid_start_date;
    private String valid_end_date;
    private int delete_flag;
    private String delete_user_id;
    private LocalDateTime delete_time;
    private String create_user_id;
    private LocalDateTime create_time;
    private String update_user_id;
    private LocalDateTime update_time;


    public Madmaccdef(String account_id, String user_id, String user_desc, String password, String old_password, String default_tenant_code, String default_lang_code, int pwd_fail_count, LocalDateTime pwd_expire_time, String valid_start_date, String valid_end_date, int delete_flag, String delete_user_id, LocalDateTime delete_time, String create_user_id, LocalDateTime create_time, String update_user_id, LocalDateTime update_time) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.user_desc = user_desc;
        this.password = password;
        this.old_password = old_password;
        this.default_tenant_code = default_tenant_code;
        this.default_lang_code = default_lang_code;
        this.pwd_fail_count = pwd_fail_count;
        this.pwd_expire_time = pwd_expire_time;
        this.valid_start_date = valid_start_date;
        this.valid_end_date = valid_end_date;
        this.delete_flag = delete_flag;
        this.delete_user_id = delete_user_id;
        this.delete_time = delete_time;
        this.create_user_id = create_user_id;
        this.create_time = create_time;
        this.update_user_id = update_user_id;
        this.update_time = update_time;
    }

    public Madmaccdef() {

    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
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

    public String getOld_password() {
        return old_password;
    }

    public void setOld_password(String old_password) {
        this.old_password = old_password;
    }

    public String getDefault_tenant_code() {
        return default_tenant_code;
    }

    public void setDefault_tenant_code(String default_tenant_code) {
        this.default_tenant_code = default_tenant_code;
    }

    public String getDefault_lang_code() {
        return default_lang_code;
    }

    public void setDefault_lang_code(String default_lang_code) {
        this.default_lang_code = default_lang_code;
    }

    public int getPwd_fail_count() {
        return pwd_fail_count;
    }

    public void setPwd_fail_count(int pwd_fail_count) {
        this.pwd_fail_count = pwd_fail_count;
    }

    public LocalDateTime getPwd_expire_time() {
        return pwd_expire_time;
    }

    public void setPwd_expire_time(LocalDateTime pwd_expire_time) {
        this.pwd_expire_time = pwd_expire_time;
    }

    public String getValid_start_date() {
        return valid_start_date;
    }

    public void setValid_start_date(String valid_start_date) {
        this.valid_start_date = valid_start_date;
    }

    public String getValid_end_date() {
        return valid_end_date;
    }

    public void setValid_end_date(String valid_end_date) {
        this.valid_end_date = valid_end_date;
    }

    public int getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }

    public String getDelete_user_id() {
        return delete_user_id;
    }

    public void setDelete_user_id(String delete_user_id) {
        this.delete_user_id = delete_user_id;
    }

    public LocalDateTime getDelete_time() {
        return delete_time;
    }

    public void setDelete_time(LocalDateTime delete_time) {
        this.delete_time = delete_time;
    }

    public String getCreate_user_id() {
        return create_user_id;
    }

    public void setCreate_user_id(String create_user_id) {
        this.create_user_id = create_user_id;
    }

    public LocalDateTime getCreate_time() {
        return create_time;
    }

    public void setCreate_time(LocalDateTime create_time) {
        this.create_time = create_time;
    }

    public String getUpdate_user_id() {
        return update_user_id;
    }

    public void setUpdate_user_id(String update_user_id) {
        this.update_user_id = update_user_id;
    }

    public LocalDateTime getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(LocalDateTime update_time) {
        this.update_time = update_time;
    }
}
