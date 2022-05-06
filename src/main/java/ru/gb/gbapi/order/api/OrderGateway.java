package ru.gb.gbapi.order.api;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import ru.gb.gbapi.order.dto.OrderDto;

import java.util.List;

public interface OrderGateway {

    @GetMapping
    List<OrderDto> getOrderList();

    @GetMapping("/{id}")
    ResponseEntity<OrderDto> getOrder(@PathVariable("id") Long id);

    @PostMapping
    ResponseEntity<OrderDto> handlePost(@Validated @RequestBody OrderDto orderDto);

    @PutMapping("/{id}")
    ResponseEntity<OrderDto> handleUpdate(@PathVariable("id") Long id,
                                          @Validated @RequestBody OrderDto orderDto);

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable("id") Long id);
}
