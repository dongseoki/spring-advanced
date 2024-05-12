package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class OrderServiceV0 {

	private final OrderRepositoryV0 orderRepository;

	public void orderItem(String itemId) {
		orderRepository.save(itemId);
	}
}
