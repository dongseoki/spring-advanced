package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class OrderControllerV0 {

	private final OrderServiceV0 orderService;

	@GetMapping("/v0/request")
	public String request(String itemId) {
		orderService.orderItem(itemId);
		return "ok";
	}
}
