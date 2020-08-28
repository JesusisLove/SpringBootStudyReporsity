package com.liu.springboot06datajpa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.liu.springboot06datajpa.entity.primarykeys.BukenOwnMasterPK;
import com.liu.springboot06datajpa.entity.primarykeys.DaytimeMngCopMstPK;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@SuppressWarnings("JpaDataSourceORMInspection")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity // 告诉JPA当前的类Employee是一个实体类（和数据表映射的类）
// 👇注意表名称要对上
@Table(name = "bzl_daytimemngcompanymst") // @Table来指定和哪个数据表相对应；如果省略该注解，默认的表明就是类名的小写
// 👇注意PK类名class要对上
@IdClass(value = DaytimeMngCopMstPK.class)
public class BezalDaytimeMngCompanyMaster {

    @Id @Column (name = "sys_id", length = 6, nullable = false)		protected String sysId;
    @Id @Column (name = "daytime_mng_cop_mng_no", length = 32, nullable = false)		protected String daytimeMngCopMngNo;
    @Column (name = "buken_mng_cop_name", length = 60)		protected String bukenMngCopName;
    @Column (name = "post_code", length = 10)		protected String postCode;
    @Column (name = "loaction1", length = 255)		protected String loaction1;
    @Column (name = "loaction2", length = 255)		protected String loaction2;
    @Column (name = "apart_name", length = 60)		protected String apartName;
    @Column (name = "apart_code", length = 10)		protected String apartCode;
    @Column (name = "cop_daihyosha", length = 60)		protected String copDaihyosha;
    @Column (name = "cop_tantosha", length = 60)		protected String copTantosha;
    @Column (name = "daytem_cntct_tel", length = 20)		protected String daytemCntctTel;
    @Column (name = "fax", length = 20)		protected String fax;
    @Column (name = "time_stamp_new")		protected Date timeStampNew;
    @Column (name = "time_stamp_update")		protected Date timeStampUpdate;
    @Column (name = "tantosha_code", length = 32)		protected String tantoshaCode;
    @Column (name = "del_flg")		protected Integer delFlg;

}
