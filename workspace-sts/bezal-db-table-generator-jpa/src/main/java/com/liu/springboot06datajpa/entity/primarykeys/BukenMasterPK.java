package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

/* 物件情報テーブルPKクラス*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BukenMasterPK implements Serializable {
    private static final long serialVersionUID = -2397232644712659221L;
    @Column//(name = "sys_id", length = 6)
    private String sysId;

    @Column//(name = "buken_own_no", length = 32)
    private String bukenMngNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BukenMasterPK modelKey = (BukenMasterPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(bukenMngNo, modelKey.bukenMngNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sysId, bukenMngNo);
    }
}
