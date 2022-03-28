package com.pxxy.core.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pxxy.core.entity.po.DepartmentPo;
import com.pxxy.core.entity.vo.DepartmentVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@Mapper
public interface DepartmentMapper extends BaseMapper<DepartmentPo> {

    @Select("SELECT * FROM department")
    public List<DepartmentVo> getDepartmentTree();

}
