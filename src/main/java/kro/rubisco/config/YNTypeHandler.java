package kro.rubisco.config;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

public class YNTypeHandler implements TypeHandler<Boolean>{

	@Override
	public void setParameter(PreparedStatement ps, int i, Boolean parameter, JdbcType jdbcType) throws SQLException {
	ps.setString(i, parameter != null && parameter ? "Y":"N");
		
	}

	@Override
	public Boolean getResult(ResultSet rs, String columnName) throws SQLException {

		return "Y".equals(rs.getString(columnName));
	}

	@Override
	public Boolean getResult(ResultSet rs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return "Y".equals(rs.getString(columnIndex));
	}

	@Override
	public Boolean getResult(CallableStatement cs, int columnIndex) throws SQLException {
		// TODO Auto-generated method stub
		return "Y".equals(cs.getString(columnIndex));
	}

}
