package fr.efrei.backend.web.rest;

import fr.efrei.backend.domain.Item;
import fr.efrei.backend.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemResource {

    public final ItemService itemService;

    public ItemResource(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/items")
    public List<Item> getAllItems() {
        return itemService.findAll();
    }

    @GetMapping("/items/{id}")
    public Item getItem(@PathVariable String id) {
        return itemService.findAll().get(Integer.parseInt(id));
    }
}
