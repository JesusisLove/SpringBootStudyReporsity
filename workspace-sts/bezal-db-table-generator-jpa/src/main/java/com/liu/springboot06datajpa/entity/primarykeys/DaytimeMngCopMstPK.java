package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 日勤管理会社テーブルPKクラス*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DaytimeMngCopMstPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659220L;
    @Column//(name = "sys_id", length = 6)
    private String sysId;

    @Column//(name = "buken_own_no", length = 32)
    private String daytimeMngCopMngNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DaytimeMngCopMstPK modelKey = (DaytimeMngCopMstPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(daytimeMngCopMngNo, modelKey.daytimeMngCopMngNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sysId, daytimeMngCopMngNo);
    }
}
