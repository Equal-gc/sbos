package com.xe.demo.service;

import com.github.pagehelper.page.PageMethod;
import com.xe.demo.common.annotation.ServiceLog;
import com.xe.demo.common.pojo.PageAjax;
import com.xe.demo.common.support.DataCache;
import com.xe.demo.common.utils.AppUtil;
import com.xe.demo.mapper.JyGoodsMapper;

import com.xe.demo.model.JyGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GoodsService extends AbstratService<JyGoods> {

	@Autowired
	private JyGoodsMapper jyGoodsMapper;

	@Autowired
	private DataCache dataCache;

	@Override
	@ServiceLog("查询库存列表")
	public PageAjax<JyGoods> queryPage(PageAjax<JyGoods> page, JyGoods goods) {
		PageMethod.startPage(page.getPageNo(), page.getPageSize());
		List<JyGoods> list = jyGoodsMapper.queryList(goods);
		System.out.println(list);
		return AppUtil.returnPage(list);
	}

//	@ServiceLog("添加用户")
//	public AjaxResult saveUser(AuthUser user) {
//		String result = null;
//		AuthUser $user = userMapper.queryByUsername(user.getUsername());
//		if (null == $user) {
//			user.setAddtime(DateUtil.getCurDateTime());
//			save(user);
//		} else {
//			result = "用户名已存在";
//		}
//		return AppUtil.returnObj(result);
//	}
//
//	@ServiceLog("修改用户")
//	public AjaxResult updateUser(AuthUser user) {
//		String result = null;
//		AuthUser $user = userMapper.queryByUsername(user.getUsername());
//		if (null != $user && $user.getId() != user.getId()) {
//			result = "用户名已存在";
//		} else {
//			updateByID(user);
//		}
//		return AppUtil.returnObj(result);
//	}
//
//	@ServiceLog("修改个人密码")
//	public AjaxResult updatePwd(HttpServletResponse response, HttpServletRequest request, int id, String oldPwd, String newPwd) {
//		AuthUser user = null;
//		if(StringUtils.isNotEmpty(oldPwd)){
//			user = queryByID(id);
//			if(!oldPwd.equals(user.getPassword())){
//				return new AjaxResult(0, "旧密码不正确");
//			}
//		}
//		user = new AuthUser();
//		user.setId(id);
//		user.setPassword(newPwd);
//		int ret = userMapper.updateByPrimaryKeySelective(user);
//		if(ret > 0){
//			String sessionId = CookieUtil.get(Constant.SESSION_IDENTITY_KEY, request);
//			if (StringUtils.isNotEmpty(sessionId)) {
//				dataCache.remove(sessionId);
//				String userName = (String) dataCache.getValue(sessionId);
//				if (StringUtils.isNotEmpty(userName)) {
//					dataCache.remove(userName + IPUtil.getIpAdd(request));
//				}
//				CookieUtil.delete(Constant.SESSION_IDENTITY_KEY, request, response);
//			}
//		}
//		return new AjaxResult(1, "修改成功");
//	}
//
//	@ServiceLog("查询用户列表")
//	public List<AuthUser> queryRoleUsers(int roleid) {
//		AuthUser user = new AuthUser();
//		user.setRoleid(roleid);
//		return userMapper.select(user);
//	}
//
//	@ServiceLog("角色绑定用户")
//	public AjaxResult bindUser(int roleid, Integer[] ids) {
//		AuthRole role = roleMapper.queryByRolename(Constant.ROLE_ANONYMOUS);
//		//剔除的用户
//		List<Map<String, Integer>> userList = new ArrayList<Map<String, Integer>>();
//		Map<String, Integer> user = null;
//		//该角色原拥有的用户
//		List<Integer> userids = userMapper.queryRoleUids(roleid);
//		for(int id: userids){
//			if(!Arrays.asList(ids).contains(id)){
//				user = new HashMap<String, Integer>();
//				user.put("id", id);
//				user.put("roleid", role.getRoleid());
//				userList.add(user);
//			}
//		}
//		dao.batchUpdate("AuthUserMapper.bindUser", userList);
//		//新增的用户
//		userList = new ArrayList<Map<String, Integer>>();
//		for(int id: ids){
//			user = new HashMap<String, Integer>();
//			user.put("id", id);
//			user.put("roleid", roleid);
//			userList.add(user);
//		}
//		dao.batchUpdate("AuthUserMapper.bindUser", userList);
//		return AppUtil.returnObj(null);
//	}

}
