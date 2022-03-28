package com.pxxy.core.controller;

import com.pxxy.core.entity.dto.DepartmentDto;
import com.pxxy.core.entity.po.DepartmentPo;
import com.pxxy.core.entity.vo.DepartmentVo;
import com.pxxy.core.service.DepartmentService;
import com.pxxy.core.service.impl.DepartmentServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@RestController
@RequestMapping("/core/departmentPo")
public class DepartmentController {

    @Autowired
    private DepartmentServiceImpl departmentService;

    /**
     * 创建部门
     * */
    @PostMapping("/create")
    public void createDepartment(@RequestBody DepartmentDto departmentDto){
        DepartmentPo departmentPo = new DepartmentPo();
        BeanUtils.copyProperties(departmentDto,departmentPo);
        departmentService.save(departmentPo);
    }

    /**
     * 所有部门
     * */
    @GetMapping("/getAllDepartment")
    public List<DepartmentPo> getAllDepartment(){
        return departmentService.getAllDepartment();
    }

    /**
     * 组织树
     * */
    @GetMapping("/getDepartmentTree")
    public List<DepartmentVo> getDepartmentTree(){

    }



}
