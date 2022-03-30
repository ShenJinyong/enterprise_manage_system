package com.pxxy.core.service.impl;

import com.pxxy.core.entity.po.HolidayPo;
import com.pxxy.core.mapper.HolidayMapper;
import com.pxxy.core.service.HolidayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-30 10:34:37
 */
@Service
public class HolidayServiceImpl extends ServiceImpl<HolidayMapper, HolidayPo> implements HolidayService {

    @Resource
    private HolidayMapper holidayMapper;

    public List<HolidayPo> getAll(){
        return holidayMapper.selectList(null);
    }
}
