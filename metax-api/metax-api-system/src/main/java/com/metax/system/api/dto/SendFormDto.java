package com.metax.system.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 对应前端发送表单对象
 * @Author: hanabi
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SendFormDto {

	private Long messageTemplateId;
	/**
	 * 接受者集合
	 */
	private String receivers;
	/**
	 * 占位符集合
	 */
	private String variables;

	/**
	 * 渠道类型
	 */
	private Integer sendChannel;

	/**
	 * 是否带有占位符数据 0.没有 其他.占位符数量
	 */
	private Integer isExitVariables;

	/**
	 * 发送方
	 */
	private Long sender;
}
