package info.mastera.rest.controller;

import info.mastera.HerokuApp;
import info.mastera.model.Item;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    private static final Logger LOGGER = LoggerFactory.getLogger(HerokuApp.class);

    @GetMapping("/")
    public String index() {
        LOGGER.info("index page");
        return "Hello World";
    }

    @GetMapping("/item")
    public ResponseEntity<Item> item() {
        LOGGER.info("item page");
        return ResponseEntity.ok(new Item()
                .setName("SimpleName"));
    }
}
