package com.liu.springboot06datajpa.entity.primarykeys;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;
/* 鍵情報テーブルPKクラス*/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class KeyMasterPK implements Serializable {

    private static final long serialVersionUID = -2397232644712659217L;
    @Column(length = 32)
    private String sysId;

    @Column(length = 32)
    private String jisyaKeyNo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KeyMasterPK modelKey = (KeyMasterPK) o;
        return Objects.equals(sysId, modelKey.sysId) &&
                Objects.equals(jisyaKeyNo, modelKey.jisyaKeyNo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(sysId, jisyaKeyNo);
    }
}
