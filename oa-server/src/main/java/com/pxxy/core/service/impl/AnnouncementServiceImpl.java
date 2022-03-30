package com.pxxy.core.service.impl;

import com.pxxy.core.entity.po.AnnouncementPo;
import com.pxxy.core.mapper.AnnouncementMapper;
import com.pxxy.core.service.AnnouncementService;
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
 * @since 2022-03-30 09:21:59
 */
@Service
public class AnnouncementServiceImpl extends ServiceImpl<AnnouncementMapper, AnnouncementPo> implements AnnouncementService {

    @Resource
    private AnnouncementMapper announcementMapper;

    public List<AnnouncementPo> getAll(){
        return announcementMapper.selectList(null);
    }
}
