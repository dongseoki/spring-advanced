package hello.proxy.jdkdynamic.code;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CImpl implements CInterface{
    @Override
    public String call(String arg) {
        log.info("C 호출");
        log.info("C 인자 : {}", arg);
        return "c";
    }
}
