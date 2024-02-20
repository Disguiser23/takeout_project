package com.disguiser.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.disguiser.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 员工信息 Mapper 接口
 * </p>
 *
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {

}
