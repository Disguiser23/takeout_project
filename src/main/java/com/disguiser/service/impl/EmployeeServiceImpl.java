package com.disguiser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.disguiser.entity.Employee;
import com.disguiser.mapper.EmployeeMapper;
import com.disguiser.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工信息 服务实现类
 * </p>
 */
@Service
@Slf4j
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {

}
