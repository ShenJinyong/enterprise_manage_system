package com.pxxy.core.mapper;

import com.pxxy.core.entity.po.UserPo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-28 10:06:54
 */
@Mapper
public interface UserMapper extends BaseMapper<UserPo> {

}
