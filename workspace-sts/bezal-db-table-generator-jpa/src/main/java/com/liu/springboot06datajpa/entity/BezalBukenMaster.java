package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BukenMasterPK;
import com.liu.springboot06datajpa.entity.primarykeys.BukenOwnMasterPK;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity // 告诉JPA当前的类Employee是一个实体类（和数据表映射的类）
// 👇注意表名称要对上
@Table(name = "bzl_bukenmst") // @Table来指定和哪个数据表相对应；如果省略该注解，默认的表明就是类名的小写
// 👇注意PK类名class要对上
@IdClass(value = BukenMasterPK.class)
public class BezalBukenMaster {

    @Id @Column (name = "sys_id", length = 6, nullable = false)		protected String sysId;
    @Id @Column (name = "buken_mng_no", length = 32, nullable = false)		protected String bukenMngNo;
    @Column (name = "post_code", length = 10)		protected String postCode;
    @Column (name = "loaction1", length = 255)		protected String loaction1;
    @Column (name = "loaction2", length = 255)		protected String loaction2;
    @Column (name = "apart_name", length = 60)		protected String apartName;
    @Column (name = "apart_code", length = 10)		protected String apartCode;
    @Column (name = "apart_structor", length = 60)		protected String apartStructor;
    @Column (name = "apart_wood", length = 60)		protected String apartWood;
    @Column (name = "apart_area", length = 16)		protected String apartArea;
    @Column (name = "apart_for_use", length = 60)		protected String apartForUse;
    @Column (name = "apart_mng_fee")		protected float apartMngFee;
    @Column (name = "daytime_mng_cop_mng_no", length = 32)		protected String daytimeMngCopMngNo;
    @Column (name = "key_switch_fee")		protected float keySwitchFee;
    @Column (name = "anti_bctril_construc_fee")		protected float antiBctrilConstrucFee;
    @Column (name = "peace_support_fee")		protected float peaceSupportFee;
    @Column (name = "update_fee")		protected float updateFee;
    @Column (name = "terminate_notice", length = 255)		protected String terminateNotice;
    @Column (name = "rent_fee")		protected float rentFee;
    @Column (name = "allow_live_num")		protected Integer allowLiveNum;
    @Column (name = "buken_own_no", length = 32)		protected String bukenOwnNo;
    @Column (name = "reikin")		protected float reikin;
    @Column (name = "shikikin")		protected float shikikin;
    @Column (name = "buken_status")		protected Integer bukenStatus;
    @Column (name = "koukoku_fee")		protected float koukokuFee;
    @Column (name = "buken_mng_flg")		protected Integer bukenMngFlg;
    @Column (name = "chukai_fee")		protected float chukaiFee;
    @Column (name = "mntnace_hst", length = 255)		protected String mntnaceHst;
    @Column (name = "time_stamp_new")		protected Date timeStampNew;
    @Column (name = "time_stamp_update")		protected Date timeStampUpdate;
    @Column (name = "tantosha_code", length = 32)		protected String tantoshaCode;
    @Column (name = "del_flg")		protected Integer delFlg;

}
