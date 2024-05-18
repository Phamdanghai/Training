package com.amaris.training.doman;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "madmusrdef")
public class Madmusrdef {
    @Id
    private String account_id;

    private String user_id;
    private String user_desc;
    private int default_photo_flag;
    private String skin_name;
    private String  email_address;
    private  String mobile_phone_no;
    private  String user_grp_1;
    private String  user_grp_2;
    private String   user_grp_3;
    private  String  user_grp_4;
    private  String  user_grp_5;
    private  String  user_cmf_1;
    private  String  user_cmf_2;
    private String   user_cmf_3;
    private String   user_cmf_4;
    private  String  user_cmf_5;
    private String   user_cmf_6;
    private String   user_cmf_7;
    private  String  user_cmf_8;
    private String  user_cmf_9;
    private String   user_cmf_10;
    private  String  user_cmf_11;
    private  String  user_cmf_12;
    private  String  user_cmf_13;
    private  String user_cmf_14;
    private  String user_cmf_15;
    private  String  user_cmf_16;
    private  String user_cmf_17;
    private  String user_cmf_18;
    private  String  user_cmf_19;
    private  String  user_cmf_20;
    private  String  user_cmf_21;
    private  String  user_cmf_22;
    private  String  user_cmf_23;
    private  String  user_cmf_24;
    private  String user_cmf_25;
    private  String user_cmf_26;
    private  String user_cmf_27;
    private   String user_cmf_28;
    private  String  user_cmf_29;
    private  String  user_cmf_30;
    private int delete_flag;
    private String delete_user_id;
    private  LocalDateTime delete_time;
    private String  create_user_id;
    private  LocalDateTime create_time;
    private  String update_user_id;
    private LocalDateTime update_time;

    public Madmusrdef() {
    }

    public Madmusrdef(String account_id, String user_id, String user_desc, int default_photo_flag, String skin_name, String email_address, String mobile_phone_no, String user_grp_1, String user_grp_2, String user_grp_3, String user_grp_4, String user_grp_5, String user_cmf_1, String user_cmf_2, String user_cmf_3, String user_cmf_4, String user_cmf_5, String user_cmf_6, String user_cmf_7, String user_cmf_8, String user_cmf_9, String user_cmf_10, String user_cmf_11, String user_cmf_12, String user_cmf_13, String user_cmf_14, String user_cmf_15, String user_cmf_16, String user_cmf_17, String user_cmf_18, String user_cmf_19, String user_cmf_20, String user_cmf_21, String user_cmf_22, String user_cmf_23, String user_cmf_24, String user_cmf_25, String user_cmf_26, String user_cmf_27, String user_cmf_28, String user_cmf_29, String user_cmf_30, int delete_flag, String delete_user_id, LocalDateTime delete_time, String create_user_id, LocalDateTime create_time, String update_user_id, LocalDateTime update_time) {
        this.account_id = account_id;
        this.user_id = user_id;
        this.user_desc = user_desc;
        this.default_photo_flag = default_photo_flag;
        this.skin_name = skin_name;
        this.email_address = email_address;
        this.mobile_phone_no = mobile_phone_no;
        this.user_grp_1 = user_grp_1;
        this.user_grp_2 = user_grp_2;
        this.user_grp_3 = user_grp_3;
        this.user_grp_4 = user_grp_4;
        this.user_grp_5 = user_grp_5;
        this.user_cmf_1 = user_cmf_1;
        this.user_cmf_2 = user_cmf_2;
        this.user_cmf_3 = user_cmf_3;
        this.user_cmf_4 = user_cmf_4;
        this.user_cmf_5 = user_cmf_5;
        this.user_cmf_6 = user_cmf_6;
        this.user_cmf_7 = user_cmf_7;
        this.user_cmf_8 = user_cmf_8;
        this.user_cmf_9 = user_cmf_9;
        this.user_cmf_10 = user_cmf_10;
        this.user_cmf_11 = user_cmf_11;
        this.user_cmf_12 = user_cmf_12;
        this.user_cmf_13 = user_cmf_13;
        this.user_cmf_14 = user_cmf_14;
        this.user_cmf_15 = user_cmf_15;
        this.user_cmf_16 = user_cmf_16;
        this.user_cmf_17 = user_cmf_17;
        this.user_cmf_18 = user_cmf_18;
        this.user_cmf_19 = user_cmf_19;
        this.user_cmf_20 = user_cmf_20;
        this.user_cmf_21 = user_cmf_21;
        this.user_cmf_22 = user_cmf_22;
        this.user_cmf_23 = user_cmf_23;
        this.user_cmf_24 = user_cmf_24;
        this.user_cmf_25 = user_cmf_25;
        this.user_cmf_26 = user_cmf_26;
        this.user_cmf_27 = user_cmf_27;
        this.user_cmf_28 = user_cmf_28;
        this.user_cmf_29 = user_cmf_29;
        this.user_cmf_30 = user_cmf_30;
        this.delete_flag = delete_flag;
        this.delete_user_id = delete_user_id;
        this.delete_time = delete_time;
        this.create_user_id = create_user_id;
        this.create_time = create_time;
        this.update_user_id = update_user_id;
        this.update_time = update_time;
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

    public int getDefault_photo_flag() {
        return default_photo_flag;
    }

    public void setDefault_photo_flag(int default_photo_flag) {
        this.default_photo_flag = default_photo_flag;
    }

    public String getSkin_name() {
        return skin_name;
    }

    public void setSkin_name(String skin_name) {
        this.skin_name = skin_name;
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

    public String getUser_grp_1() {
        return user_grp_1;
    }

    public void setUser_grp_1(String user_grp_1) {
        this.user_grp_1 = user_grp_1;
    }

    public String getUser_grp_2() {
        return user_grp_2;
    }

    public void setUser_grp_2(String user_grp_2) {
        this.user_grp_2 = user_grp_2;
    }

    public String getUser_grp_3() {
        return user_grp_3;
    }

    public void setUser_grp_3(String user_grp_3) {
        this.user_grp_3 = user_grp_3;
    }

    public String getUser_grp_4() {
        return user_grp_4;
    }

    public void setUser_grp_4(String user_grp_4) {
        this.user_grp_4 = user_grp_4;
    }

    public String getUser_grp_5() {
        return user_grp_5;
    }

    public void setUser_grp_5(String user_grp_5) {
        this.user_grp_5 = user_grp_5;
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

    public String getUser_cmf_7() {
        return user_cmf_7;
    }

    public void setUser_cmf_7(String user_cmf_7) {
        this.user_cmf_7 = user_cmf_7;
    }

    public String getUser_cmf_8() {
        return user_cmf_8;
    }

    public void setUser_cmf_8(String user_cmf_8) {
        this.user_cmf_8 = user_cmf_8;
    }

    public String getUser_cmf_9() {
        return user_cmf_9;
    }

    public void setUser_cmf_9(String user_cmf_9) {
        this.user_cmf_9 = user_cmf_9;
    }

    public String getUser_cmf_10() {
        return user_cmf_10;
    }

    public void setUser_cmf_10(String user_cmf_10) {
        this.user_cmf_10 = user_cmf_10;
    }

    public String getUser_cmf_11() {
        return user_cmf_11;
    }

    public void setUser_cmf_11(String user_cmf_11) {
        this.user_cmf_11 = user_cmf_11;
    }

    public String getUser_cmf_12() {
        return user_cmf_12;
    }

    public void setUser_cmf_12(String user_cmf_12) {
        this.user_cmf_12 = user_cmf_12;
    }

    public String getUser_cmf_13() {
        return user_cmf_13;
    }

    public void setUser_cmf_13(String user_cmf_13) {
        this.user_cmf_13 = user_cmf_13;
    }

    public String getUser_cmf_14() {
        return user_cmf_14;
    }

    public void setUser_cmf_14(String user_cmf_14) {
        this.user_cmf_14 = user_cmf_14;
    }

    public String getUser_cmf_15() {
        return user_cmf_15;
    }

    public void setUser_cmf_15(String user_cmf_15) {
        this.user_cmf_15 = user_cmf_15;
    }

    public String getUser_cmf_16() {
        return user_cmf_16;
    }

    public void setUser_cmf_16(String user_cmf_16) {
        this.user_cmf_16 = user_cmf_16;
    }

    public String getUser_cmf_17() {
        return user_cmf_17;
    }

    public void setUser_cmf_17(String user_cmf_17) {
        this.user_cmf_17 = user_cmf_17;
    }

    public String getUser_cmf_18() {
        return user_cmf_18;
    }

    public void setUser_cmf_18(String user_cmf_18) {
        this.user_cmf_18 = user_cmf_18;
    }

    public String getUser_cmf_19() {
        return user_cmf_19;
    }

    public void setUser_cmf_19(String user_cmf_19) {
        this.user_cmf_19 = user_cmf_19;
    }

    public String getUser_cmf_20() {
        return user_cmf_20;
    }

    public void setUser_cmf_20(String user_cmf_20) {
        this.user_cmf_20 = user_cmf_20;
    }

    public String getUser_cmf_21() {
        return user_cmf_21;
    }

    public void setUser_cmf_21(String user_cmf_21) {
        this.user_cmf_21 = user_cmf_21;
    }

    public String getUser_cmf_22() {
        return user_cmf_22;
    }

    public void setUser_cmf_22(String user_cmf_22) {
        this.user_cmf_22 = user_cmf_22;
    }

    public String getUser_cmf_23() {
        return user_cmf_23;
    }

    public void setUser_cmf_23(String user_cmf_23) {
        this.user_cmf_23 = user_cmf_23;
    }

    public String getUser_cmf_24() {
        return user_cmf_24;
    }

    public void setUser_cmf_24(String user_cmf_24) {
        this.user_cmf_24 = user_cmf_24;
    }

    public String getUser_cmf_25() {
        return user_cmf_25;
    }

    public void setUser_cmf_25(String user_cmf_25) {
        this.user_cmf_25 = user_cmf_25;
    }

    public String getUser_cmf_26() {
        return user_cmf_26;
    }

    public void setUser_cmf_26(String user_cmf_26) {
        this.user_cmf_26 = user_cmf_26;
    }

    public String getUser_cmf_27() {
        return user_cmf_27;
    }

    public void setUser_cmf_27(String user_cmf_27) {
        this.user_cmf_27 = user_cmf_27;
    }

    public String getUser_cmf_28() {
        return user_cmf_28;
    }

    public void setUser_cmf_28(String user_cmf_28) {
        this.user_cmf_28 = user_cmf_28;
    }

    public String getUser_cmf_29() {
        return user_cmf_29;
    }

    public void setUser_cmf_29(String user_cmf_29) {
        this.user_cmf_29 = user_cmf_29;
    }

    public String getUser_cmf_30() {
        return user_cmf_30;
    }

    public void setUser_cmf_30(String user_cmf_30) {
        this.user_cmf_30 = user_cmf_30;
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
