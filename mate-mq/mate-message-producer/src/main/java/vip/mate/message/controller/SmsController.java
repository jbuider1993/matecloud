package vip.mate.message.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.mate.core.common.api.Result;
import vip.mate.message.service.ISmsService;

/**
 * 发送短信控制器
 *
 * @author xuzhanfu
 */
@RestController
@AllArgsConstructor
public class SmsController {

	private final ISmsService smsService;

	@GetMapping("/send/sms")
	public Result<?> sendSms(String message) {
		smsService.sendSms(message);
		return Result.success("操作成功");
	}


}