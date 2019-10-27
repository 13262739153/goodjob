package com.xmg.p2p.base.domain;

import lombok.Data;

/*用户登录信息
* @author zzj
* @date 2019年10月28日 上午12:29:01
*/
@Data
public class Logininfo extends BaseDomain{
	public static final Integer STATE_NORMAL=0;//默认0为正常用户
	public static final Integer STATE_LOCK=1;//默认0为正常用户
	private String username;
	private String password;
	private Integer state;
	
}
