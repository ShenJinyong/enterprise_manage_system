package com.pxxy.core.service.impl;

import com.pxxy.core.entity.po.DepartmentPo;
import com.pxxy.core.entity.vo.DepartmentVo;
import com.pxxy.core.mapper.DepartmentMapper;
import com.pxxy.core.service.DepartmentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
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
        DepartmentVo departmentVo = new DepartmentVo("1508337599503900674","浩云科技",null,null);
        List<DepartmentVo> departmentList = getDepartmentList();
        Stream<DepartmentVo> departmentVoStream = departmentList.stream().filter(
                item -> departmentVo.getId().equals(item.getPid())
        );
        long count = departmentVoStream.count();
        if(count > 1)
    }

    /**
     * 查询所有的部门
     * */
    public List<DepartmentVo> getDepartmentList(){
        return departmentMapper.getDepartmentTree();
    }

    public List<DepartmentVo> getDepartment(DepartmentVo departmentVo){

    }

}
