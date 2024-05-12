package hello.advanced.trace.hellotrace;

import hello.advanced.trace.TraceStatus;
import org.junit.jupiter.api.Test;

public class HelloTraceV1Test {

	@Test
	void begin_end() {
		HelloTraceV1 trace = new HelloTraceV1();
		TraceStatus status = trace.begin("hello");
		trace.end(status);
	}

	@Test
	void begin_exception() {
		HelloTraceV1 trace = new HelloTraceV1();
		TraceStatus status = trace.begin("hello");
		trace.exception(status, new IllegalStateException());
	}

	// @Test
	// void addSpace() {
	// 	System.out.println(HelloTraceV1.addSpace("-->", 0));
	// 	System.out.println(HelloTraceV1.addSpace("-->", 1));
	// 	System.out.println(HelloTraceV1.addSpace("-->", 2));
	// 	System.out.println(HelloTraceV1.addSpace("<--", 3));
	// }
}
