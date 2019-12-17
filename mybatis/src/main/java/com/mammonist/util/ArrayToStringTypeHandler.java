package com.mammonist.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.*;

@Slf4j
@MappedTypes(String[].class)
@MappedJdbcTypes(JdbcType.VARCHAR)
public class ArrayToStringTypeHandler implements TypeHandler<String[]> {

    @Override
    public void setParameter(PreparedStatement ps, int i, String[] favor, JdbcType jdbcType) throws SQLException {
        log.info("保存时调用");
        if (favor == null) throw new RuntimeException("参数不能为空");
        String str = "";
        for (String s : favor) {
            str += s + ",";
        }
        str = str.substring(0,str.length() - 1);
        ps.setString(i,str);
    }

    @Override
    public String[] getResult(ResultSet rs, String columnName) throws SQLException {
        log.info("查询时会调用");
        String str = rs.getString(columnName);
        return str.split(",");
    }

    @Override
    public String[] getResult(ResultSet rs, int columnIndex) throws SQLException {
        return rs.getString(columnIndex).split(",");
    }

    @Override
    public String[] getResult(CallableStatement cs, int columnIndex) throws SQLException {
        return cs.getString(columnIndex).split(",");
    }
}
