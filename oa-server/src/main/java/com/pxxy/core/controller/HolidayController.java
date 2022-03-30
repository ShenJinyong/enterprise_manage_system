package com.pxxy.core.controller;

import com.pxxy.core.entity.dto.HolidayDto;
import com.pxxy.core.entity.po.HolidayPo;
import com.pxxy.core.service.impl.HolidayServiceImpl;
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
 * @since 2022-03-30 10:34:37
 */
@RestController
@RequestMapping("/core/holidayPo")
public class HolidayController {


    @Resource
    private HolidayServiceImpl holidayService;

    @PostMapping("/createHolidayPo")
    public void create(@RequestBody HolidayDto holidayDto){
        HolidayPo holidayPo = new HolidayPo();
        BeanUtils.copyProperties(holidayDto,holidayPo);
        holidayService.save(holidayPo);
    }

    @GetMapping("/getAllHolidayPo")
    public List<HolidayPo> getAll(){
        return holidayService.getAll();
    }
}
