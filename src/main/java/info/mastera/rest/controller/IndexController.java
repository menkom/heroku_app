package info.mastera.rest.controller;

import info.mastera.model.Item;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/item")
    public ResponseEntity<Item> item() {
        return ResponseEntity.ok(new Item()
                .setName("SimpleName"));
    }
}
