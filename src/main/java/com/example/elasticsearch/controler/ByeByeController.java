package com.example.elasticsearch.controler;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
class ByeByeController {

  @GetMapping("/bye")
  @SneakyThrows
  public void byeBye() {
    log.info("Shutting down...");
    log.info("Processing inflight request...");
    for (int i = 0; i < 20_000; i++) {
      for (int j = 0; j< 1_000_000; j++) {
        // busy working...
      }
    }
    log.info("Bye bye!");
  }
}
