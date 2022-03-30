package com.pxxy.core.controller;

import com.pxxy.core.entity.dto.AnnouncementDto;
import com.pxxy.core.entity.po.AnnouncementPo;
import com.pxxy.core.service.impl.AnnouncementServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 沈金勇
 * @since 2022-03-30 09:21:59
 */
@RestController
@RequestMapping("/core/announcementPo")
public class AnnouncementController {

    @Resource
    private AnnouncementServiceImpl announcementService;

    @PostMapping("/createAnnouncementPo")
    public void create(@RequestBody AnnouncementDto announcementDto){
        AnnouncementPo announcementPo = new AnnouncementPo();
        BeanUtils.copyProperties(announcementDto,announcementPo);
        announcementService.save(announcementPo);
    }

    @GetMapping("/getAllAnnouncementPo")
    public List<AnnouncementPo> getAll(){
        return announcementService.getAll();
    }
}
