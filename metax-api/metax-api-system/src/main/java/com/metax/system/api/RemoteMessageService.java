package com.metax.system.api;

import com.metax.common.core.constant.ServiceNameConstants;
import com.metax.common.core.web.domain.AjaxResult;
import com.metax.system.api.dto.SendFormDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * 用户服务
 *
 * @author ruoyi
 */
@FeignClient(contextId = "remoteMessageService", value = ServiceNameConstants.WEB_SERVICE)
public interface RemoteMessageService {

	@PostMapping("/message_template/send-inner")
	AjaxResult send(@RequestBody SendFormDto sendForm);
}
