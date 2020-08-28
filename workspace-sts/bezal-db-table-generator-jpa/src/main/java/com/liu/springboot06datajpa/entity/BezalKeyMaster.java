package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.KeyMasterPK;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity // 告诉JPA当前的类Employee是一个实体类（和数据表映射的类）
// 👇注意表名称要对上
@Table(name = "bzl_keymst") // @Table来指定和哪个数据表相对应；如果省略该注解，默认的表明就是类名的小写
// 👇注意PK类名class要对上
@IdClass(value = KeyMasterPK.class)
public class BezalKeyMaster {

    @Id @Column (name = "sys_id", length = 6, nullable = false)		protected String sysId;
    @Id @Column (name = "jisya_key_no", length = 32, nullable = false)		protected String jisyaKeyNo;
    @Column (name = "oya_key_no", length = 32)		protected String oyaKeyNo;
    @Column (name = "buken_mng_no", length = 32, nullable = false)		protected String bukenMngNo;
    @Column (name = "master_key_flg")		protected Integer masterKeyFlg;
    @Column (name = "key_storage_near_apart", length = 255)		protected String keyStorageNearApart;
    @Column (name = "key_password", length = 16)		protected String keyPassword;
    @Column (name = "key_storage_in_cop", length = 255)		protected String keyStorageInCop;
    @Column (name = "key_maker", length = 32)		protected String keyMaker;
    @Column (name = "key_maker_code", length = 32)		protected String keyMakerCode;
    @Column (name = "key_use_flg")		protected Integer keyUseFlg;
    @Column (name = "key_status")		protected Integer keyStatus;
    @Column (name = "key_owner", length = 50)		protected String keyOwner;
    @Column (name = "key_type", length = 32)		protected String keyType;
    @Column (name = "time_stamp_new", nullable = false)		protected Date timeStampNew;
    @Column (name = "time_stamp_update")		protected Date timeStampUpdate;
    @Column (name = "tantosha_code", length = 32, nullable = false)		protected String tantoshaCode;
    @Column (name = "del_flg", nullable = false)		protected Integer delFlg;
}
