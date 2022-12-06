package com.rise.authorize.provider.controller;


import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.rise.authorize.model.user.entity.SysUser;
import com.rise.authorize.service.user.SysUserService;
import com.rise.common.entity.BaseResult;
import com.rise.common.entity.QueryPage;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author 张牧之
 * @since 2022-12-05
 */


@RestController
@RequestMapping("/sys-user")
public class SysUserController {
    @Autowired
    private SysUserService sysUserService;

    /**
     * 查看单个用户
     */
    @GetMapping("{id}")
    @ApiOperation("查看单个用户")
    public BaseResult<SysUser> detail (@PathVariable("id") Long id) {
        return sysUserService.detail(id);
    }

    /**
     * 保存用户
     */
    @PostMapping
    @ApiOperation("保存用户")
    public BaseResult save (@RequestBody @Validated SysUser sysUser) {
        return sysUserService.userSave(sysUser);
    }


    /**
     * 分页查询用户信息
     * @return
     */
    @GetMapping
    public BaseResult<Page<SysUser>> page (@RequestBody @Validated QueryPage<SysUser> userQueryPage) {
        return sysUserService.page(userQueryPage);
    }


    /**
     * 删除用户
     * @param id
     */
    @DeleteMapping("{id}")
    @ApiOperation("删除用户")
    public BaseResult delete (@PathVariable("id") Long id) {
        return sysUserService.delete(id);
    }


    /**
     * @param userNo
     */
    @GetMapping("queryCount")
    @ApiOperation("")
    public int queryCount (String userNo) {
        return sysUserService.queryCount(userNo);
    }
}
