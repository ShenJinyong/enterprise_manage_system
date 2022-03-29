package com.pxxy.core.service.impl;

import com.pxxy.core.entity.po.DepartmentPo;
import com.pxxy.core.entity.vo.DepartmentVo;
import com.pxxy.core.mapper.DepartmentMapper;
import com.pxxy.core.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<DepartmentMapper, DepartmentPo> implements DepartmentService {

    @Resource
    private DepartmentMapper departmentMapper;

    public List<DepartmentPo> getAllDepartment(){
        return departmentMapper.selectList(null);
    }

    public List<DepartmentVo> getDepartmentTree(){
        // 获取所有部门
        List<DepartmentVo> departmentTree = departmentMapper.getDepartmentTree();
        // 获取顶级部门的子部门
        return departmentTree.stream()
                .filter(item -> "0".equals(item.getPid()))
                .peek(item -> item.setDepartmentVos(getChildDepartmentList(item,departmentTree)))
                .sorted(Comparator.comparing(DepartmentVo::getId))
                .collect(Collectors.toList());
    }


    public List<DepartmentVo> getChildDepartmentList(DepartmentVo departmentVo,List<DepartmentVo> departmentTree){
        return departmentTree.stream().filter(item -> item.getPid().equals(departmentVo.getId()))
                // 递归查询
                .peek(item -> item.setDepartmentVos(getChildDepartmentList(item,departmentTree)))
                .sorted(Comparator.comparing(DepartmentVo::getId))
                .collect(Collectors.toList());
    }

}
