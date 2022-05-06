package ru.gb.gbapi.order.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.gb.gbapi.product.dto.ProductDto;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderDto {

    private Long id;

    @NotBlank
    private String address;

    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @NotBlank
    private String phone;

    @NotBlank
    private String mail;

    private String status;

    private List<ProductDto> products;

    private List<String> productsIdForAdding;
}
